/**
 * 
 */
package com.abdelrahman.diffrent.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Abdelrahman Sayed
 *
 * Feb 28, 2018
 */
public class checkedExceptionMainClass {

	//// check exception force you to handle exception 
	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		try {
			String input = bufferedReader.readLine();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			/// your dessicion
		}
		
		
		int y=0,x=1;
		if (x==y) {
			throw new NullPointerException();
		}
		
	}

}
