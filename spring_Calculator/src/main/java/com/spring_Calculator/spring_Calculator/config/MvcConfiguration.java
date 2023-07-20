package com.spring_Calculator.spring_Calculator.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.spring_Calculator.spring_Calculator.Impl.Calculator;

/*
 * this file represents the Spring Configuration class
 */
@Configuration
@ComponentScan(basePackages="com.spring_Calculator.spring_Calculator")
@EnableWebMvc
public class MvcConfiguration implements WebMvcConfigurer{

	
	
	/*
	 *  Here to declare the beans of the Spring and User defined Classes
	 */
	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
 

	
}
