package SeleniumCode;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassSendKeys {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement amazonBasics = driver.findElement(By.id("twotabsearchtextbox"));

		Actions action = new Actions(driver);
		action.sendKeys(amazonBasics, "best Books").perform();
		
		//the above method from actions class work the same way as sendKeys method below,
		//but it is just for situations where sendKeys method alone may not work
		//		amazonBasics.sendKeys("best books");
		Thread.sleep(6000);
		driver.close();
		
	}
}
