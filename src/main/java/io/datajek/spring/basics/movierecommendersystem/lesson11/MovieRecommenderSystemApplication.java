package io.datajek.spring.basics.movierecommendersystem.lesson11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

		System.out.println(recommender);

		Movie m1 = appContext.getBean(Movie.class);
		System.out.println(m1);

		Movie m2 = appContext.getBean(Movie.class);
		System.out.println(m2);

//		String[] result=recommender.recommendMovies("Finding Dory");
//		
//		
//		System.out.println();
//		System.out.println();
//		System.out.println(Arrays.toString(result));

	}

}
