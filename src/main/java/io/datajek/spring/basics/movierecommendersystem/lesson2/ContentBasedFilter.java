package io.datajek.spring.basics.movierecommendersystem.lesson2;

public class ContentBasedFilter implements Filter {

	@Override
	public String[] getRecommendations(String movie) {
		// TODO Auto-generated method stub
		return new String[] { "Happy Feet", "Ice Age", "Shark Tale" };
	}

}
