package com.codemind.sblearning.sbproject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SbprojectApplication {
	
	// THE MOST IMP ANNOATAION OF SPRING BOOT
	
//@SPRINGBOOTAPPLICATION  = @SPRINGCONFIGURATION + @ENABLEAUTOCONFIGURATION + @COMPONENTSCAN
	//@LAZY
	
	
	@Value("${my.app.appname}")
	String applicationName ;
	

	public static void main(String[] args) {
		
		SpringApplication.run(SbprojectApplication.class, args);
		
		
		
		ApplicationContext context  = new AnnotationConfigApplicationContext(
												BeanConfig.class);
		Employee emp = (Employee)context.getBean("Vivek");
		
		new SbprojectApplication().showProperties();
		
		System.out.println(emp);
		
		
		
	}


	private void showProperties() {
		System.out.println("My Application Name from prop file is" + applicationName );
		
	}


}
