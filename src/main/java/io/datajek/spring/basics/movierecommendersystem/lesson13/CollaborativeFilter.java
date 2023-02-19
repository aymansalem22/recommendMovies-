package io.datajek.spring.basics.movierecommendersystem.lesson13;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;

@Named
@Qualifier("CF")
public class CollaborativeFilter implements Filter {

	public String[] getRecommendations(String movie) {
		// TODO Auto-generated method stub
		return new String[] { "Finding Nemo", "Ice Age", "Toy Story" };
	}

}
