package p1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class pro13
{
	
	public static void myprint(String str)
	{
		System.out.println(str);
	}

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","D:\\TR soft\\Selenium Jars\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.gmail.com/");
		 //driver.close();
		 
      driver.findElement(By.linkText("Help")).click();
	
      myprint(driver.getTitle());
      
      
      Set<String>id=driver.getWindowHandles();
      Iterator<String> it=id.iterator();
      System.out.println("fehgf");
      String vParent=it.next();
      String vChild=it.next();
      driver.switchTo().window(vChild);
      System.out.println("egfherrr");
      driver.findElement(By.linkText("Community")).click();
      myprint(driver.getTitle());
      driver.switchTo().window(vParent);
      myprint(driver.getTitle());
	  driver.close();
      
      
      
	
	
	}

}
