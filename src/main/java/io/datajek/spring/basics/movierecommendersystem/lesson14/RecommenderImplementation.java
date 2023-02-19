package io.datajek.spring.basics.movierecommendersystem.lesson14;

import org.springframework.beans.factory.annotation.Autowired;

public class RecommenderImplementation {

	@Autowired
	private Filter filter;

	// first options
//	public RecommenderImplementation(Filter filter) {
//		this.filter=filter;
//	}

	// second options
	public Filter getFilter() {
		return filter;
	}

	public void setFilter(Filter filter) {
		this.filter = filter;
	}

	public String[] recommendMovies(String movie) {
		System.out.println("\nName of the filter in use: " + filter + "\n");
		String[] results = filter.getRecommendations("Finding Dory");
		return results;
	}

}
