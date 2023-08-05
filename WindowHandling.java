package seleniumPrograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	
	  WebDriver driver;
	  @BeforeMethod
	  public void setup()
	  {
		  
		  WebDriverManager.chromedriver().setup();
		  driver =new ChromeDriver();
		  driver.get("https://www.livetech.in/");
		  driver.manage().window().maximize();
	  }
	  
	  @Test
	  public void livetech() throws InterruptedException
	     
	  {
		  
		  String homewindowId=driver.getWindowHandle();
		  
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("(//a[contains(@href,'https://www.facebook.com/livetechqa')])[1]")).click();  Thread.sleep(3000);
		  switchtowindow("LiveTech | Facebook");
		  Thread.sleep(3000);
		  driver.switchTo().window(homewindowId);
		  driver.findElement(By.xpath("(//a[contains(@href,'https://www.instagram.com/livetechqa')])[1]")).click(); Thread.sleep(3000);
		  switchtowindow("LiveTech Testingtools (@livetechqa) | Instagram");
		  Thread.sleep(3000);
		  driver.switchTo().window(homewindowId);
		  driver.findElement(By.xpath("//a[contains(@href,'https://twitter.com/livetechtesting')]")).click(); Thread.sleep(3000);
		  switchtowindow("Log in to Twitter / Twitter");
		  Thread.sleep(3000);
		  driver.switchTo().window(homewindowId);
		  
	  }  
		  
		 private void switchtowindow(String expTitle) throws InterruptedException
		 
		 {
			 
			 Set<String> windowIds=driver.getWindowHandles();
			 Iterator<String> it=windowIds.iterator();
			 while(it.hasNext())
			 {
				
				 String windowId=it.next();
				 driver.switchTo().window(windowId);
				 Thread.sleep(3000);
				 if(driver.getTitle().equals(expTitle))
				 {
					 
					 break;
					 
				 }
				 
				 
			}  
		  
	  }
		  
		  
		@AfterMethod
		
		public void teardown()throws InterruptedException
		
		{
			
			Thread.sleep(3000);
			
			driver.quit();
			
			
		}
		
		
		
}		
		
		
		
		
		
		
		
		
		
		  
		  
		  
	  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	


