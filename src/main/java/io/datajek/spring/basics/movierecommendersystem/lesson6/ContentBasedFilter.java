package io.datajek.spring.basics.movierecommendersystem.lesson6;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("CBF")
public class ContentBasedFilter implements Filter {

	@Override
	public String[] getRecommendations(String movie) {
		// TODO Auto-generated method stub
		return new String[] { "Happy Feet", "Ice Age", "Shark Tale" };
	}

	/*
	 * @Component
	 * 
	 * @Qualifier("CBF") equal.. @Component("CBF")
	 */

}
