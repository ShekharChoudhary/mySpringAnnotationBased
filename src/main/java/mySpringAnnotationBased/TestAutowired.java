package mySpringAnnotationBased;

import org.springframework.beans.factory.annotation.Autowired;


public class TestAutowired {

	@Autowired
	HelloWorld helloWorld;
	
	public void testAuto() {
		helloWorld.setMessage("Test Message");
		helloWorld.getMessage();
	}
	
}
