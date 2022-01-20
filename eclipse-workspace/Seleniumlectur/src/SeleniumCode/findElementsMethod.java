package SeleniumCode;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsMethod {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		//Dynamic dropdown list
		//findElements​(By by)
		List<WebElement> element = driver.findElements(By.xpath("//select[@id='month']//child::option"));
		
		for(int i = 0; i < element.size(); i++) {
			String months = element.get(i).getText();
			System.out.print("Month: " + months + "\n");
		}
		
		Thread.sleep(3000);
		driver.close();	
		
	}}
