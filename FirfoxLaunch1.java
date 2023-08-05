package seleniumPrograms;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirfoxLaunch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\nitis\\Downloads\\geckodriver-v0.33.0-win32\\geckodriver.exe");
		new FirefoxDriver();

	}

}
