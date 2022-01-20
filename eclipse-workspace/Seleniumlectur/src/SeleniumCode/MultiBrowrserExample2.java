package SeleniumCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowrserExample2 {
	
		public static void main(String[] args) throws InterruptedException {


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
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			}



			driver.get("https://www.amazon.com/");
			driver.manage().window().maximize();
			Thread.sleep(4000);
			driver.close();
			}
	}


