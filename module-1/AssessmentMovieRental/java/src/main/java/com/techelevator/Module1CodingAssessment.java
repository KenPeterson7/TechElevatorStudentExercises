package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Module1CodingAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MovieRental movieRental = new MovieRental("Godfather", "DVD", true);
		MovieRental movieRentalDos = new MovieRental("The Room", "VHS", false);

		movieRental.isPremiumMovie();
		movieRental.getRentalPrice();
		movieRental.getTitle();
		movieRental.getFormat();

		System.out.println(movieRental.isPremiumMovie());
		System.out.println(movieRental.getRentalPrice());
		System.out.println(movieRental.getTitle());
		System.out.println(movieRental.getFormat());

		System.out.println("////////////////////////////////////////////////////////////////");
		System.out.println(movieRentalDos.isPremiumMovie());
		System.out.println(movieRentalDos.getRentalPrice());
		System.out.println(movieRentalDos.getTitle());
		System.out.println(movieRentalDos.getFormat());

		System.out.println("////////////////////////////////////////////////////////////////");
		System.out.println(movieRental.lateFee(1));
		System.out.println(movieRental.lateFee(2));
		System.out.println(movieRental.lateFee(5));


		File file = new File("MovieInput.csv");

		MovieRental movieRentaltest = new MovieRental("Godfather", "DVD", true);
		List<MovieRental> movieList = new ArrayList<>();

		try(Scanner scanner = new Scanner(file)){
			while(scanner.hasNextLine()){
				String line = scanner.nextLine();
				for(MovieRental movie: movieList){
					String title = movieRental.getTitle();
					String format = movieRental.getFormat();
					boolean isPremium = movieRental.isPremiumMovie();
					double price = movieRental.getRentalPrice();

					System.out.println(title + " " + format + " " + isPremium + " " + price);
				}

			}
		}catch(FileNotFoundException e){
			e.getMessage();
		}

	}

}
