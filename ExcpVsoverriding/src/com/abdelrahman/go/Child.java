/**
 * 
 */
package com.abdelrahman.go;

import java.io.IOException;

/**
 * @author Abdelrahman Sayed
 *
 * Feb 28, 2018
 */
/// super class throw excption sub can throw same
public class Child  extends Parrent{

	/// this function can't  throws Exception 
	/// becuase super methods can't implement that
  public void print() {
		
	}
	///// this can throw  unchecked exception 
    ////  otherwise super method dont throw excption
	public void drow() throws NullPointerException{
		
	}
	//// this function can't throws Excption laregr than parent 
 public void walk()/*throws Exception*/{
		
	}
 /// accept because this exception small then parent
	public void walk2()throws NullPointerException{
		
	}
////this function can't throws Excption laregr than parent 
public void eat()/*throws Exception*/{
		
	}
/// accept because this exception small then parent or equal parent excption 
public void eat2()throws IOException{
	
}
}
