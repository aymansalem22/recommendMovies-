package io.datajek.spring.basics.movierecommendersystem.lesson2;

import java.util.Arrays;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		RecommenderImplementation recommender = new RecommenderImplementation(new ContentBasedFilter());
		RecommenderImplementation recommender2 = new RecommenderImplementation(new CollaborativeFilter());
		String[] result = recommender.recommendMovies("Finding Dory");
		String[] result2 = recommender2.recommendMovies("The Incredibles");
		System.out.println(Arrays.toString(result));
		System.out.println(Arrays.toString(result2));

	}

}