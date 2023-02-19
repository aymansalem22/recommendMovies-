package io.datajek.spring.basics.movierecommendersystem.lesson13;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;

@Named
public class RecommenderImplementation {

	@Inject
	@Qualifier("CF")
	private Filter filter;

	public Filter getFilter() {
		return this.filter;
	}

	public String[] recommendMovies(String movie) {
		System.out.println("\nName of the filter in use: " + filter + "\n");
		String[] results = filter.getRecommendations("Finding Dory");
		return results;
	}

}
