package SeleniumCode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementByClassName {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.amazon.com/");
		Thread.sleep(6000);
		
		driver.findElement(By.className("hm-icon-label")).click();
		
		Thread.sleep(6000);
		driver.close();
		
		
	}

}
