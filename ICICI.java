package seleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ICICI {

	
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.icicibank.com/");
	        driver.manage().window().maximize();
	        
	       List<WebElement>allLinks=driver.findElements(By.tagName("a"));
	       
	       System.out.println(allLinks.size());
	       
	       for(int i=0;i<allLinks.size();i++)
	    	   
	       {
	    	System.out.println(allLinks.get(i).getText()); 
	    	
	    	   
	       }
	    	driver.quit();   
	        

	}

}
