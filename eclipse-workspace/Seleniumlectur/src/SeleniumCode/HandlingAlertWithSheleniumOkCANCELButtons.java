package SeleniumCode;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingAlertWithSheleniumOkCANCELButtons {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
        //store the frame in webelement
        WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
        //using selenium pre-built functions, switch to that frame
        driver.switchTo().frame(frame);
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        //to accept
        driver.switchTo().alert().accept();
        //to dimiss
//      driver.switchTo().alert().dismiss();
        Thread.sleep(6000);
        driver.close();
    }

	}


