package SeleniumCode;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiBrowserTesting {
public static void main(String[] args) throws InterruptedException {
		
		//chrome browser
		//firefox browser
		//edge browser
		WebDriver driver;
		String browser = "firefox";
		
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}else if(browser.equalsIgnoreCase("edge")){
			System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			
		}else{
			System.setProperty("webdriver.gecko.driver\", \".\\\\drivers\\\\geckodriver.exe", browser);
			driver = new ChromeDriver();
		}

		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		
		Thread.sleep(6000);
		driver.close();
		
	}
}
