package Sampleproject.E2Eproject;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	
	public WebDriver driver ;//globally accessible  webdriver object
	
	public WebDriver InitializeDriver() throws IOException
	
	
	{
	
		Properties prop= new Properties();
		FileInputStream fls= new FileInputStream("D:\\workspace\\E2Eproject\\src\\main\\java\\Sampleproject\\E2Eproject\\data.properties");
		prop.load(fls);
		String browserName=prop.getProperty("browser");
		
	//	if(browserName ="chrome"),it is will throw an error so we need to use equals() property as we are extracting value from a property
		if (browserName.equals("chrome"))	
		{
			System.setProperty("webdriver.chrome.driver", "D:\\PRATYUSHA\\Study\\Selenium\\Udemy_RahulShetty\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		
		//create webdriver object globally to skip creation of new object everytime
	 	
	    }
		
		else if(browserName.equals("Firefox"))
			
		{
			
			
        }
		else if(browserName.equals("IE"))
		
		{
		
		}
		return driver;
	}
	
}