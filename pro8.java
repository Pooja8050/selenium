package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pro8 {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:\\TR soft\\Selenium Jars\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/");
		  driver.findElement(By.id("email")).sendKeys("123456");
		  driver.findElement(By.id("pass")).sendKeys("12345677");
		  //driver.findElement(By.id("loginbutton")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.partialLinkText("Forgotten ")).click();
		  
		  
	

	}

}
