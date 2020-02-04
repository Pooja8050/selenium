package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pro1 {

	public static void main(String[] args)
	{	
	
		System.setProperty("webdriver.chrome.driver","D:\\TR soft\\Selenium Jars\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 driver.close();
		 
	}

}
