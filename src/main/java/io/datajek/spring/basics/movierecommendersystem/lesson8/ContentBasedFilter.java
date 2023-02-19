package io.datajek.spring.basics.movierecommendersystem.lesson8;

import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {
	public ContentBasedFilter() {
		super();
		System.out.println("content-based filter constructor called");

	}

	@Override
	public String[] getRecommendations(String movie) {
		// TODO Auto-generated method stub
		return new String[] { "Happy Feet", "Ice Age", "Shark Tale" };
	}

}
