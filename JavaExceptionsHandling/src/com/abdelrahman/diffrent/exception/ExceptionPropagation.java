/**
 * 
 */
package com.abdelrahman.diffrent.exception;

/**
 * @author Abdelrahman Sayed
 *
 * Feb 28, 2018
 */
public class ExceptionPropagation {

public static void func1(){
	
	String word =null;
	word.length();
}
public static void func2(){
	func1();
}
public static void func3(){
	func2();
}
public static void func4(){
	func3();
}
	public static void main(String[] args) {

		//// excption will propagation throw caller to find cacher if cacher not found it crashed
		try{
		func4();
	}catch (Exception e) {
		e.printStackTrace();
		}
	}

}
