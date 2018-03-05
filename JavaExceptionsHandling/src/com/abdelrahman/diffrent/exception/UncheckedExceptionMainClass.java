
package com.abdelrahman.diffrent.exception;

/**
 * @author Abdelrahman Sayed
 *
 * Feb 28, 2018
 */
public class UncheckedExceptionMainClass {

	public static void main(String[] args) {
	
		try{
		///ArithmeticException: / by zero
		int y=100/0;
		
		String word = null;  ////NullPointerException
		System.out.println(word.length());
		
		// java.lang.NumberFormatException
		String word2 = "abdelrahmanSayed0";
    	int num = Integer.parseInt(word2);
		
		//// java.lang.ArrayIndexOutOfBoundsException
		String [] words =  new String[10];
		words[70] ="go man";
		}catch (ArithmeticException e) {
			/// your decision
		}catch (NullPointerException e) {
			/// your decision
		}catch (NumberFormatException e) {
			/// your decision
		}catch (ArrayIndexOutOfBoundsException e) {
			/// your decision
		}catch (Exception e) {
			/// your decision
		}finally{
			/// this erea executed every where
			/// when exception or no excption
		}
	}

}
