package io.datajek.spring.basics.movierecommendersystem.lesson15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

	@Value("${recommender.implementation.favoriteMovie: hello}")
	String favoriteMovie;

	public String getFavoriteMovie() {
		return favoriteMovie;
	}

	@Autowired
	@Qualifier("CF")
	private Filter filter;

	public String[] recommendMovies(String movie) {
		System.out.println("\nName of the filter in use: " + filter.getClass() + "\n");
		String[] results = filter.getRecommendations("Finding Dory");
		return results;
	}

}
