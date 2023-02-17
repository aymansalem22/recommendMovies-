package io.datajek.spring.basics.movierecommendersystem.lesson6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

	@Autowired
	@Qualifier("CF")
	private Filter filter;

	public String[] recommendMovies(String movie) {
		System.out.println("\nName of the filter in use: " + filter.getClass() + "\n");
		String[] results = filter.getRecommendations("Finding Dory");
		return results;
	}

}
