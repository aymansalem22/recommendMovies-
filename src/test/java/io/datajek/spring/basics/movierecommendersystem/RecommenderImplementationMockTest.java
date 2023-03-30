package io.datajek.spring.basics.movierecommendersystem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;


@ExtendWith(MockitoExtension.class)
public class RecommenderImplementationMockTest {

	@Mock
	private io.datajek.spring.basics.movierecommendersystem.lesson4.Filter mockFilter;
	
	@InjectMocks
	private io.datajek.spring.basics.movierecommendersystem.lesson4.RecommenderImplementation recommenderImpl;
	
	@Test
	void testRecommendMovies_noRecommendationsFound() {
		when(mockFilter.getRecommendations("Finding Dory")).thenReturn(new String[] {});
		assertArrayEquals(new String[] {}, recommenderImpl.recommendMovies("Finding Dory"));
	}
	
}

