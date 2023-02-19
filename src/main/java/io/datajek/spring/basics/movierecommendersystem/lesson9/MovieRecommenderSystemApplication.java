package io.datajek.spring.basics.movierecommendersystem.lesson9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//@ComponentScan(basePackages="io.datajek.spring.basics.movierecommendersystem.lesson10")
//@ComponentScan(includeFilters = @ComponentScan.Filter (type= FilterType.REGEX, pattern="io.datajek.spring.basics.movierecommendersystem.lesson9.*"))
//@ComponentScan(basePackages={"io.datajek.spring.basics.movierecommendersystem.lesson9","io.datajek.spring.basics.movierecommendersystem.lesson10"})
//@ComponentScan(basePackages="io.datajek.spring.basics.movierecommendersystem.lesson10")
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class);

		ContentBasedFilter filter = appContext.getBean(ContentBasedFilter.class);
		System.out.println("\nContentBasedFilter bean with singleton scope\n");
		System.out.println(filter);

		Movie movie1 = filter.getMovie();
		Movie movie2 = filter.getMovie();
		Movie movie3 = filter.getMovie();

		System.out.println("\nMovie bean with prototype scope\n");
		System.out.println(movie1);
		System.out.println(movie2);
		System.out.println(movie3);

		System.out.println("\nContentBasedFilter instances created: " + ContentBasedFilter.getInstances());
		System.out.println("\nMovie instances created :" + Movie.getInstances());

		/*
		 * the ContentBasedFilter bean (from lesson9 package) is found but the
		 * CollaborativeFilter bean (from lesson10 package) is not found. This is
		 * because Spring scans the
		 * io.datajek.spring.basics.movierecommendersystem.lesson9 package where
		 * the @SpringBootApplication annotation is used.
		 */

		System.out.println("*********************************");
		System.out.println("ContentBasedFilter bean found = " + appContext.containsBean("contentBasedFilter"));
		System.out.println("CollaborativeFilter bean found = " + appContext.containsBean("collaborativeFilter"));

	}

}
