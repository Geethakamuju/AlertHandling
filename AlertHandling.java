package seleniumPrograms;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		
		  WebDriverManager.chromedriver().setup();
		  driver =new ChromeDriver();
		  driver.get(" https://demo.guru99.com/v4/");
		  driver.manage().window().maximize();
	}
     @Test
     public void guru() throws InterruptedException
     {
      driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr266311");
      Thread.sleep(3000);
      driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Admin123$");
      Thread.sleep(3000);
      driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
      Thread.sleep(3000);
      driver.findElement(By.xpath("//a[@href='DeleteCustomerInput.php']")).click();
      
      Thread.sleep(3000);
      driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'google_ads_iframe')]")));
      driver.switchTo().frame("ad_iframe");
      Thread.sleep(3000);
      try
      {
    	  driver.findElement(By.xpath("//span[text()='Close']")).click();
    	  Thread.sleep(3000);
      }
      catch(Exception e)
      {
    	  System.out.println(e.getMessage());
      }
      driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("2345");
      Thread.sleep(3000);
      driver.findElement(By.xpath("//input[@type='submit']")).click();
      Thread.sleep(3000);
      Alert al=driver.switchTo().alert();
      Assert.assertEquals(al.getText(), "Do you really want to delete this Customer?");
      al.accept();
      
      
      
      
      }
      
     @AfterMethod
     public void teardown() throws InterruptedException
     {
    	    Thread.sleep(3000);
			
			driver.quit();
     }
}
