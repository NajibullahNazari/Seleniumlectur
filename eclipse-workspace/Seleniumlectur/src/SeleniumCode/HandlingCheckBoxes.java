package SeleniumCode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDrive;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://tek-school.com/retail/index.php?route=account/register");

		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(3000);
		WebElement checkBox = driver.findElement(By.xpath("//input[@name='agree']"));
		boolean isdisplayed = checkBox.isDisplayed();
		System.out.println(isdisplayed);
		boolean isenabled = checkBox.isEnabled();
		System.out.println(isenabled);
		boolean isselected1 = checkBox.isSelected();
		System.out.println("Before Clicking: " + isselected1);
		checkBox.click();
		boolean isselected2 = checkBox.isSelected();
		System.out.println("After Clicking: " + isselected2);
		Thread.sleep(3000);
		driver.close();
	}
	}


