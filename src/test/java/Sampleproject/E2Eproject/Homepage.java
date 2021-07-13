package Sampleproject.E2Eproject;

import java.io.IOException;

import org.testng.annotations.Test;

public class Homepage extends Base {

	
	@Test
	
	public void pagenavigation() throws IOException
	
	{
		
		driver= InitializeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
	
    }
}