/**
 * 
 */
package com.abdelrahman.finfal.using;

/**
 * @author Abdelrahman Sayed
 *
 * Feb 28, 2018
 */
public class finalizeEX {
	
	public static void main(String [] args){
		{
			finalizeEX finalizeEX = new finalizeEX();
			finalizeEX finalizeEX2 = new finalizeEX();
		}
		System.gc();
		// here two object deleted from memory 
	}

}
