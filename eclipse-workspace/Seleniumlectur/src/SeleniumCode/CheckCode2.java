package SeleniumCode;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckCode2 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://makemytrip.com/");
		String myselect = "Boston";

		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-controls='react-autowhatever-1']")).sendKeys(myselect);
		List<WebElement> list = driver.findElements(By.xpath("//li[@role='option']"));
		for (WebElement i : list) {
			String newname = i.getText();
			if (newname.equalsIgnoreCase(myselect)) {
				i.click();
				break;
			}
		}
		String myselect1 = "Las Vegas";
		driver.findElement(By.xpath("//input[@aria-controls='react-autowhatever-1']")).sendKeys("Los");
		Thread.sleep(2000);
		List<WebElement> list1 = driver.findElements(By.xpath("//li[@role='option']"));
		for (WebElement i : list1) {
			String newname1 = i.getText();
			if (newname1.equalsIgnoreCase(myselect1)) {
				i.click();

				break;
			}
		}
	}
}
