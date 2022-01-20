package SeleniumCode;


import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LinkTextAndPartialLinkText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.amazon.com/");
		//full link text
		driver.findElement(By.linkText("Amazon Basics")).click();
		Thread.sleep(3000);
		//part of the link text
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Basics")).click();
		
		Thread.sleep(3000);
		driver.close();
	}

}
