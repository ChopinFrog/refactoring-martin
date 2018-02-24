package org.matlab.chap1_new;

public class Movie {

	// 일반물, 최신물, 아동물 각각 상수값을 선언
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	public static final int CHILDRENS = 2;
	private Price _price;
	
	
	// 영화 제목
	private String _title;
	
	public Movie(String title, int priceCode) {
		_title = title;
		setPriceCode(priceCode);
	}
	
	public int getPriceCode() {
		return _price.getPriceCode();
	}
	
	public void setPriceCode(int arg) {
		switch (arg) {
		case REGULAR:
			_price = new RegularPrice();
			break;
		case CHILDRENS:
			_price = new ChildrensPrice();
			break;
		case NEW_RELEASE:
			_price = new NewReleasePrice();
			break;
		default:
			throw new IllegalArgumentException("가격 코드가 잘못됐습니다.");
		}
	}
	
	public String getTitle() {
		return _title;
	}
	
	public double getCharge(int daysRented) {
		return _price.getCharge(daysRented);
	}
	
	public int getFrequentRenterPoints(int daysRented) {
		return _price.getFrequentRenterPoints(daysRented);
	}
}