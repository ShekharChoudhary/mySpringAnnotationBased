package mySpringAnnotationBased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {
   @Bean 
   public HelloWorld helloWorld(){
      return new HelloWorld();
   }
   
	 @Bean 
	   public TestAutowired testAutoWire(){
	      return new TestAutowired();
	   }
}