package io.datajek.spring.basics.movierecommendersystem.lesson2;

public class RecommenderImplementation {
	private Filter filter;

	public RecommenderImplementation(Filter filter) {
		super();
		this.filter = filter;
	}

	public String[] recommendMovies(String movie) {
		System.out.println("Name of the filter in use: " + filter.getClass() + "\n");
		String[] results = filter.getRecommendations("Finding Dory");
		return results;
	}

}
