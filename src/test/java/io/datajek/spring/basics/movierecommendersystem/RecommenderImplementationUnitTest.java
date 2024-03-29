package io.datajek.spring.basics.movierecommendersystem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import io.datajek.spring.basics.movierecommendersystem.lesson4.*;

public class RecommenderImplementationUnitTest {

	@Test
	void testRecommendMovies_withCollaborativeFilter() {
		RecommenderImplementation recommenderImpl = new RecommenderImplementation(new CollaborativeFilter());
		String[] actualResult = recommenderImpl.recommendMovies("Finding Dory");
		assertArrayEquals(new String[] { "Finding Nemo", "Ice Age", "Toy Story" }, actualResult);
	}

	void testRecommendMovies_withContentBasedFilter() {
		RecommenderImplementation recommenderImpl = new RecommenderImplementation(new ContentBasedFilter());
		assertArrayEquals(new String[] { "Happy Feet", "Ice Age", "Shark Tale" },
				recommenderImpl.recommendMovies("Finding Dory"));
	}

}
