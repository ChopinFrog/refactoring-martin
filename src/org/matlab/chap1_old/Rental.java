package org.matlab.chap1_old;

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
}
