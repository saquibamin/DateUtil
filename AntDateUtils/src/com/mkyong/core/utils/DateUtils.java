package com.mkyong.core.utils;

import java.util.Date;

public class DateUtils {

	public static void main(String[] args) {
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
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
