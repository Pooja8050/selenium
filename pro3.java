package p1;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pro3 

{
	
	public static WebDriver driver;
	
	
       public static void TS01()
	     {
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 System.out.println("Title is:"+driver.getTitle());
		 System.out.println("URL is:"+driver.getCurrentUrl());
	      }

public static void main(String[] args)
	{
	  Scanner scn=new Scanner(System.in);
	  System.out.println("Enter your choice");
	  String s1=scn.next();
	  
	  if(s1.equals("chrome"))
	  {
	    System.setProperty("webdriver.chrome.driver","D:\\TR soft\\Selenium Jars\\chromedriver.exe");
	    driver=new ChromeDriver();
         TS01();
	  }
	  else if(s1.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver","D:\\TR soft\\Selenium Jars\\geckodriver.exe");
		  driver=new FirefoxDriver();
		  TS01();
	  }
	  else
	  {
		  System.out.println("Invalid Output");
	  }
	  }

}
