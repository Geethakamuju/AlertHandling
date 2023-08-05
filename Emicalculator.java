package seleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Emicalculator {
       
	 WebDriver driver;
	 @BeforeMethod
	 public void setup()
	 {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://emicalculator.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 }
	 
	 
	 @Test
	 public void mouseHoverTest()
	 {
		
		 Actions action1=new Actions(driver);
		 
		 action1.dragAndDropBy(driver.findElement(By.xpath("(//span[@tabindex='0'])[1]")),90,0)
		       .build()
               .perform();
		 
		// Actions action2=new Actions(driver);
		 
		 action1.dragAndDropBy(driver.findElement(By.xpath("(//span[@tabindex='0'])[2]")), 130, 0)
		       .build()
               .perform();  
		 
		// Actions action3=new Actions(driver);
		 action1.dragAndDropBy(driver.findElement(By.xpath("(//span[@tabindex='0'])[3]")), -120, 0)		             
		       .build()
               .perform();
		 
	 }
	 
	 @AfterMethod
	  public void teardown() throws Exception
	  {
		  Thread.sleep(3000);
		  
		  driver.quit();
		  
	  }
		                     
		                     
				 
			
	 }
	 
	 
	
	
	
       