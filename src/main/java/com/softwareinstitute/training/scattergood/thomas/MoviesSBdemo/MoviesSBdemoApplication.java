package com.softwareinstitute.training.scattergood.thomas.MoviesSBdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MoviesSBdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesSBdemoApplication.class, args);
	}

	@GetMapping("/getMovie")
	public String movieResponse(){
	Movie movie = new Movie ("Halloween",102, "Horror");
	return movie.getJsonObjectOfMovie();
	}
}
