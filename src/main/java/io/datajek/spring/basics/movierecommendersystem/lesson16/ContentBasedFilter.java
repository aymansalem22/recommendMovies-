package io.datajek.spring.basics.movierecommendersystem.lesson16;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContentBasedFilter implements Filter {

	@Autowired
	private Movie movie;

	public ContentBasedFilter() {
		super();
	}

	@Override
	public String[] getRecommendations(String movie) {
		// TODO Auto-generated method stub
		return new String[] { "Happy Feet", "Ice Age", "Shark Tale" };
	}

}
