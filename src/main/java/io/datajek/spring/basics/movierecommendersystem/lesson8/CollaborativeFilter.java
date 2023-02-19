package io.datajek.spring.basics.movierecommendersystem.lesson8;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CollaborativeFilter implements Filter {

	public CollaborativeFilter() {
		super();
		System.out.println("collaborative filter constructor called");
	}

	@Override
	public String[] getRecommendations(String movie) {
		// TODO Auto-generated method stub
		return new String[] { "Finding Nemo", "Ice Age", "Toy Story" };
	}

}
