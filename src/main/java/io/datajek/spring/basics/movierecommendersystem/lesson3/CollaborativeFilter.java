package io.datajek.spring.basics.movierecommendersystem.lesson3;

public class CollaborativeFilter implements Filter {

	@Override
	public String[] getRecommendations(String movie) {
		// TODO Auto-generated method stub
		return new String[] { "Finding Nemo", "Ice Age", "Toy Story" };
	}

}
