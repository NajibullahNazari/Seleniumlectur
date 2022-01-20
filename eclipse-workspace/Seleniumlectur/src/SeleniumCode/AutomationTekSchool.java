package SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTekSchool {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tek-school.com/retail/index.php?route=account/login");
		Thread.sleep(6000);
		driver.findElement(By.id("input-email")).sendKeys("tom@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("123");
		driver.findElement(By.xpath("//input[@type ='submit']")).click();
		Thread.sleep(6000);
		driver.close();
	}

}
