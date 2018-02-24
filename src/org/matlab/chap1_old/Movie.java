package org.matlab.chap1_old;

public class Movie {

	// 일반물, 최신물, 아동물 각각 상수값을 선언
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	public static final int CHILDRENS = 2;
	private int _priceCode;
	
	// 영화 제목
	private String _title;
	
	public Movie(String title, int priceCode) {
		_title = title;
		_priceCode = priceCode;
	}
	
	public int getPriceCode() {
		return _priceCode;
	}
	public void setPriceCode(int arg) {
		_priceCode = arg;
	}
	
	public String getTitle() {
		return _title;
	}
}