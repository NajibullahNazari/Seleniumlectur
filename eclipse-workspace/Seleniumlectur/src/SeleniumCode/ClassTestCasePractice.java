package SeleniumCode;



import java.time.Duration;
import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class ClassTestCasePractice {

public static void main(String[] args) throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
        //from before
//      WebDriver driver = new ChromeDriver();
        //with headless browser
        HtmlUnitDriver driver = new HtmlUnitDriver();
        driver.get("http://tek-school.com/retail//");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement myAccount = driver.findElement(By.xpath("//span[text()='My Account']"));
        String actualAccount = myAccount.getText();
        String expectedAccount = "My Account";
        compareText(actualAccount, expectedAccount);
        myAccount.click();
        driver.findElement(By.xpath("//a[text()='Register']")).click();
        WebElement registerForm = driver.findElement(By.xpath("//h1[text()='Register Account']"));
        String actualFormText = registerForm.getText();
        String expectedFormText = "Register Account";
        compareText(actualFormText, expectedFormText);
        WebElement messageText = driver.findElement(By.xpath("//p[text()='If you already have an account with us, please login at the ']"));
        String actualMessage = messageText.getText();
        String expectedMessage = "If you already have an account with us, please login at the login page.";
        compareText(actualMessage, expectedMessage);
        driver.findElement(By.id("input-firstname")).sendKeys("John");
        driver.findElement(By.id("input-lastname")).sendKeys("David");
        driver.findElement(By.id("input-email")).sendKeys("johndavoopt567@gmail.com");
        driver.findElement(By.id("input-telephone")).sendKeys("444-567-9876");
        driver.findElement(By.id("input-password")).sendKeys("123456");
        driver.findElement(By.id("input-confirm")).sendKeys("123456");
        driver.findElement(By.xpath("//div[@class='form-group']//label/input[@value='1']")).click();
        WebElement agreeMessage = driver.findElement(By.xpath("//div[text()='I have read and agree to the ']"));
        String actualAgreeMessage = agreeMessage.getText();
        String expectedAgreeMessge = "I have read and agree to the Privacy Policy  ";
        compareText(actualAgreeMessage, expectedAgreeMessge);
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//input[@value='Continue']")).click();
        WebElement successMessage = driver.findElement(By.xpath("//div[@id='content']//child::h1[text()='Your Account Has Been Created!']"));
        String actualsuccessMessage = successMessage.getText();
        String expectedsuccessMessage = "Your Account Has Been Created!";
        compareText(actualsuccessMessage, expectedsuccessMessage);
        driver.findElement(By.xpath("//a[text()='Continue']")).click();
        WebElement myAccountPage = driver.findElement(By.xpath("//h2[text()='My Account']"));
        String actualmyAccountPage = myAccountPage.getText();
        String expectedmyAccountPage = "My Account";
        compareText(actualmyAccountPage, expectedmyAccountPage);
        Thread.sleep(3000);
        driver.close();
    }
    public static void compareText(String actualText, String expectedText) {
        
        if(actualText.equalsIgnoreCase(expectedText)) {
            System.out.println(actualText + " = " + expectedText + "Passed");
        }else {
            System.out.println(actualText + " != " + expectedText + "Failed");
        }
    }
		

	}


