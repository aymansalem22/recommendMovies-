package io.datajek.spring.basics.movierecommendersystem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations="/appcontextforunittesting.xml")
public class RecommenderImplementationXmlConfigTest {

	@Autowired
	private io.datajek.spring.basics.movierecommendersystem.lesson14.RecommenderImplementation recommenderImpl;
	
	
	@Test
	void testRecommendMovies() {
		assertArrayEquals(new String[] {"Happy Feet","Ice Age","Shark Tale"},recommenderImpl.recommendMovies("Finding Dory"));
	}
	
	
	
	
	
	
}
