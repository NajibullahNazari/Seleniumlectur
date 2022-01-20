package SeleniumCode;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassPressShiftAndSendText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));

		Actions action = new Actions(driver);
		//we are moving to the element
		action.moveToElement(searchBar)
		//we are pressing shift key
		.keyDown(searchBar, Keys.SHIFT)
		//send the text
		.sendKeys(searchBar, "selenium")
		//we release the shift key
		.keyUp(searchBar, Keys.SHIFT)
		//build and perform, since we have composite action
		.build().perform();

		Thread.sleep(6000);
		driver.close();
		
	}
}
