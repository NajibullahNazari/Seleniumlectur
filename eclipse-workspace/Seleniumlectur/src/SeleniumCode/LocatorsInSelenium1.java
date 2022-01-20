package SeleniumCode;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInSelenium1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

//		driver.get("https://www.facebook.com/");

//		Thread.sleep(6000);
//		driver.findElement(By.id("email")).sendKeys("email@email.com");
//		driver.findElement(By.name("pass")).sendKeys("123456");

		Thread.sleep(3000);
		//reminder: need to still practice this one
//		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//what if want to store this element and perform action(s) later on this element?
//		WebElement text = driver.findElement(By.tagName("h2"));
		
//		System.out.println(text.getText());
		
//		String text2 = text.getText();
//		System.out.println(text2);
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		driver.findElement(By.className("hm-icon-label")).click();
		
		Thread.sleep(3000);

		driver.close();
	}
}
