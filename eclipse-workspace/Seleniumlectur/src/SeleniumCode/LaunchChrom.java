package SeleniumCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrom {

	public static void main(String[] args) {


		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\najib\\eclipse-workspace\\Seleniumlectur\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.get("https://www.Amazon.com/");
		//driver.get("https://www.Tekschool.com/");
		//driver.launchApp("12345");
		
		
	}

}
