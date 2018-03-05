/**
 * 
 */
package com.abdelrahman.customExcption;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 1, 2018
 */
public class MainClass {
	
	
	public static String printme(String me){
		if(me.length() >100){
			throw new InvalidUncheckedExcption("age lager than 100");
		}
		 return "good";
	}
	
	public static String printyo(String me) throws InvalidCheckedExcption{
		if(me.length() >100){
			throw new InvalidCheckedExcption("age lager than 100");
		}
		 return "good";
	}
	
	public static void main(String [] args){
		
		/// this don't need try catch becuase it unchecked exception
		printme("jvnevdnv");
		
		/// this  need try catch becuase it checked exception
		try {
			printyo("go");
		} catch (InvalidCheckedExcption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
