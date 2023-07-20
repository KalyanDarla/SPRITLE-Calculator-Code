package com.spring_Calculator.spring_Calculator.Impl;

import org.springframework.stereotype.Service;

import com.spring_Calculator.spring_Calculator.Interface.Calculator_Interface;
import com.spring_Calculator.spring_Calculator.exception.DivideByZero;
@Service
public class Calculator implements Calculator_Interface {

	@Override
	public int add(int num1, int num2) {
 		return (num1+num2);
	}

	@Override
	public int subtract(int num1, int num2) {
 		return (num1-num2);
	}

	@Override
	public int multiply(int num1, int num2) {
 		return (num1*num2);
	}

	@Override
	public double divide(int num1, int num2) {
		if(num2==0) {
    		throw new DivideByZero(num2);
    	}
    	else {
		 
 		return (num1/num2);
	}}

	public static void main(String[] args) {
 
	}

}
