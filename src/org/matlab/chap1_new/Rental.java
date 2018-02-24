package org.matlab.chap1_new;

import org.matlab.chap1_new.Movie;

public class Rental {
	
	// 대여한 영화
	private Movie _movie;
	// 연체 날짜
	private int _daysRented;
	
	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}

	public Movie getMovie() {
		return _movie;
	}

	public int getDaysRented() {
		return _daysRented;
	}
	
	public double getCharge() {
		return _movie.getCharge(_daysRented);
	}
	
	public int getFrequentRenterPoints() {
		return _movie.getFrequentRenterPoints(_daysRented);
	}
}
