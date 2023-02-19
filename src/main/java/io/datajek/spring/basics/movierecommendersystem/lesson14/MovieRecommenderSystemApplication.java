package io.datajek.spring.basics.movierecommendersystem.lesson14;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
		// check the beans which have been loaded
		System.out.println("\nBeans loaded:");
		System.out.println(Arrays.toString(appContext.getBeanDefinitionNames()));

		// other way..>//retrieve bean from the application context
		RecommenderImplementation recommender = appContext.getBean("recommenderImpl", RecommenderImplementation.class);
//	String [] result=recommender.recommendMovies("Finding Dory");

		// print dependency
		System.out.println("\nDependency: " + recommender.getFilter());
		System.out.println();

//	System.out.println(Arrays.asList(result));
//	
		appContext.close();

	}

}
