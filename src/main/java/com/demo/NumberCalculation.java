package com.demo;

/**
 * @author: Oliver Pagalanan
 * @time: Mar 10, 2022-11:52:35 AM
 */
public class NumberCalculation {
	String temp = "";
	
	public int add(int x, int y) {
		return x + y;
	}
	
	public String convertCase(String str) {
		
		// logic to convert small letter to capital letter
		for(int i = 0; i < str.length(); i++) {
			int x = str.charAt(i);
			x = x - 32;
			temp = temp + (char)x;
		}
		
		return temp;
	}
}
