package com.spring_Calculator.spring_Calculator.exception;

 @SuppressWarnings("unused")
public class DivideByZero extends RuntimeException{
	
	
	 
	private int num2;
	
	public DivideByZero(int num2){
		super(String.format("Divided By Zero is Not a Valid Division Format.Dont give %s: value",num2));
	
	this.num2=num2;
	}

}
