package io.datajek.spring.basics.movierecommendersystem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import io.datajek.spring.basics.movierecommendersystem.lesson4.*;

 @ExtendWith(SpringExtension.class)
 @ContextConfiguration(classes=io.datajek.spring.basics.movierecommendersystem.lesson4.MovieRecommenderSystemApplication.class)
 public class RecommenderImplementationSpringTest {
	 
	 @Autowired
	 private RecommenderImplementation recommenderImpl;
	 
	 @Test
	 void testRecommendMovies() {
		 assertArrayEquals(new String[] {"Finding Nemo","Ice Age","Toy Story"}, 
				 recommenderImpl.recommendMovies("Finding Dory") );
	 }

}
 
/*
 * to work correctly -->
 * 
 * add those depedency:
 * 
 * <!-- <dependency> <groupId>org.springframework</groupId>
 * <artifactId>spring-test</artifactId> <scope>test</scope> </dependency>
 * 
 * <dependency> <groupId>org.junit.jupiter</groupId>
 * <artifactId>junit-jupiter-engine</artifactId> <scope>test</scope>
 * </dependency> -->
 * 
 * disactive this dependency-->
 * 
 * <dependency> <groupId>org.springframework.boot</groupId>
 * <artifactId>spring-boot-starter-test</artifactId> <scope>test</scope>
 * </dependency>
 * 
 * also comment anotation in default test class @SpringBootTest
 */