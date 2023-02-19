package io.datajek.spring.basics.movierecommendersystem.lesson11;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public ContentBasedFilter() {
		super();
		logger.info("In ContentBasedFilter constructor method");
	}

	@PostConstruct
	private void postConstruct() {
		logger.info("In ContentBasedFilter postConstruct method");
	}

	@PreDestroy
	private void preDestroy() {
		logger.info("In ContentBasedFilter preDestroy method");
	}

	@Override
	public String[] getRecommendations(String movie) {
		// TODO Auto-generated method stub
		return new String[] { "Happy Feet", "Ice Age", "Shark Tale" };
	}

}
