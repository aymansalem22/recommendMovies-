package io.datajek.spring.basics.movierecommendersystem.lesson13;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@ComponentScan
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		// ApplicationContext appContext =
		// SpringApplication.run(MovieRecommenderSystemApplication.class);

		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(
				MovieRecommenderSystemApplication.class);
		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);
		System.out.println(recommender);
		System.out.println(recommender.getFilter());

		String[] result = recommender.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(result));

		appContext.close();

	}

}
