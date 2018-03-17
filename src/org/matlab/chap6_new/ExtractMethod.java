package org.matlab.chap6_new;

import java.util.Enumeration;
import java.util.Vector;

public class ExtractMethod {

	private Vector _order = new Vector();
	private String _name; 
	
	public void printOwing() {
		Enumeration e = _order.elements();
		double outstanding = 0.0;
		printBanner();
		
		//외상액 계산
		while (e.hasMoreElements()) {
			Order each = (Order) e.nextElement();
			outstanding += each.getAmount();
		}
		
		// 세부 내역 출력
		System.out.println("고객명: " +  _name);
		System.out.println("외상: " + outstanding);
	}	
	
	
	public void printBanner() {
		// 배너 출력
		System.out.println("******************");
		System.out.println("******고객 외상 ******");
		System.out.println("******************");
	}
	
}