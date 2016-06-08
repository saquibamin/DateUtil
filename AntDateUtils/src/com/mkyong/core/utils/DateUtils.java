package com.mkyong.core.utils;

import java.util.Date;

public class DateUtils {

	public static void main(String[] args) {

		System.out.println(getLocalCurrentDate());
		
		
	}
/**
 * Method to get date now
 * @return
 */
	private static Date getLocalCurrentDate() {
	
		return new Date();
		
	}

}
