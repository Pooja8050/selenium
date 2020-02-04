package p1;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;







public class Home
{
	public  WebDriver driver;
    public  String url1;
    
    
	public String TS01() throws IOException
	{
		driver.manage().window().maximize();
		driver.get(url1);
		String abc=driver.getCurrentUrl();
		System.out.println("URL is:"+abc);	
        //driver.close();
        if(url1.equals(abc))
           {
   	       return "PASS";
   	       
          }
        else
         {
   	       
   	     File scrFile=(File)((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   	     Files.copy(scrFile,new File("D:\\selenium Screenshots\\pool.jpg"));
   	     return "FAIL";
         }
	}
		
	public void Welcome() throws IOException 
     { 
	   Scanner scn=new Scanner(System.in);
	   System.out.println("Enter the URL");
	   url1=scn.next(); 
	   System.out.println("Enter your choice");
	   String s1=scn.next();
	    if(s1.equals("chrome"))
	      {
	    System.setProperty("webdriver.chrome.driver","D:\\TR soft\\Selenium Jars\\chromedriver.exe");
	    driver=new ChromeDriver();
	   // System.out.println(TS01());
	     }
	   else if(s1.equals("firefox"))
	       {
		  System.setProperty("webdriver.gecko.driver","D:\\TR soft\\Selenium Jars\\geckodriver.exe");
		  driver=new FirefoxDriver();
		 // System.out.println(TS01(Url));
	     }
	  else
	  {
		  System.out.println("Invalid Input");
	  }	

}
}
