package io.datajek.spring.basics.movierecommendersystem;

import java.util.Arrays;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.datajek.spring.basics.movierecommendersystem.lesson1.RecommenderImplementation;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		RecommenderImplementation recommender = new RecommenderImplementation();
		String[] result = recommender.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(result));

	}

}
