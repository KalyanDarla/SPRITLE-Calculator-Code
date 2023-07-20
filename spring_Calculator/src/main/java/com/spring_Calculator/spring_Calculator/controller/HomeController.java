package com.spring_Calculator.spring_Calculator.controller;

/*
 * this file represents the Spring Controller class
 */


import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.spring_Calculator.spring_Calculator.Interface.Calculator_Interface;
import com.spring_Calculator.spring_Calculator.exception.DivideByZero;
@SuppressWarnings("unused")
@Controller
public class HomeController {

	
	 @Autowired
	private Calculator_Interface calculator_Interface;
	
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	
	@RequestMapping(value="/app")
	@ResponseBody
	public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2,  Model model, @RequestParam("options") String options) throws IOException{
		
		  
		 
         
		
		switch (options) {
		
            case "add":
            	
                try {
                 	int sum=calculator_Interface.add(num1, num2);
                	model.addAttribute("sum", sum);
                    } 
                catch (Exception e) {
                       e.printStackTrace();
                   }
                
              break;
                
            case "subtract":
            	
                try {
                     int subtract=calculator_Interface.subtract(num1, num2);
            	    model.addAttribute("subtract", subtract);
                    } 
                catch (Exception e) {
                       e.printStackTrace();
                    } 
                
                break;
                
            case "multiply":
                try {
                 	int multiply= calculator_Interface.multiply(num1, num2);
                	model.addAttribute("multiply", multiply);
                    } 
                catch (Exception e) {
                        e.printStackTrace();
                     }
                
                break;
                
            case "divide":
            	
                try {
                	 
                 	double divide= calculator_Interface.divide(num1, num2);
                	model.addAttribute("divide", divide);
                  }
                	
                catch (Exception e) {
                	model.addAttribute("divide", "Divided By Zero is Not a Valid Division Format.Dont give 0 value");
                   }
                break;
             
            default:
                try {
                    System.out.println("Not Selected Any Options");
                } catch (Exception e) {
                    e.printStackTrace();
                } 
                break; 
            } 
		
		
		 
		
		return new ModelAndView("viewanswers");
	}
	
	
}
