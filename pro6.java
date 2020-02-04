package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pro6 {

	public static void main(String[] args)throws InterruptedException
	{
	  System.setProperty("webdriver.chrome.driver","D:\\TR soft\\Selenium Jars\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in/");
	  driver.findElement(By.id("twotabsearchtextbox" )).sendKeys("mi smartphones");
	  driver.findElement(By.className("nav-input")).click();
	   Thread.sleep(2000);
	   System.out.println(driver.getTitle());
	   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/span[4]/div[1]/div[2]/div/span/div/div/div[2]/div[1]/div/div/span/a/div/img")).click();
	  	driver.findElement(By.linkText( "Back to results")).click();	


	}

}
