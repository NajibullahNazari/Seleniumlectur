package SeleniumCode;

		import java.time.Duration;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class SeleniumMethods4 {

			public static void main(String[] args) throws InterruptedException {

				System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();

				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				WebElement element = driver.findElement(By.xpath("//a[text()='Create new account']"));
				System.out.println(element.getCssValue("background-color"));
				//For getAttribute method you may get a null or blank
				//String name2 = "";
				System.out.println("getAttribute Name: " + element.getAttribute("id"));
				//For getDomAttribute method you may get true or null
				//public static String name1;
				System.out.println("getDomAttribute Name: " + element.getDomAttribute("id"));
				//For getDomProperty method it will give the property of that element 
				//blank or null
				System.out.println("getDomProperty Name: " + element.getDomProperty("id"));
				//getTabName will get the tagName for an attribute in the DOM
				System.out.println("getTagName: " + element.getTagName());
				
				Thread.sleep(3000);
				driver.close();
			}

		

	

}
