package com.codemind.sblearning.sbproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanConfig {
	
	// A java class where we defines all the beans instead of beans.xml 
	//we call that class as @Configuration class
	//and we call the method which create a bean is @Bean
	
	/**
	 * 
	 * Now I will need to create Emp bean
	 */
	
	@Bean(name="Vivek")
	@Lazy   // hey spring !! dnt create this bean by yourself . Only create when user ask you to create
	//@Primary
	public Employee getEmployee() {
		
		Employee emp = new Employee();
		emp.setId(123);
		emp.setName("Vivek");
		emp.setCity("Bhopal");
		int t =10;
		int x =0 ;
		//int y = t/x;
		
		return emp ;
	}
	
	@Bean(name="Prateek")
	public Employee getEmployee1() {
		
		Employee emp = new Employee();
		emp.setId(123);
		emp.setName("Prateek");
		emp.setCity("Bhopal");
		
		return emp ;
	}

}
