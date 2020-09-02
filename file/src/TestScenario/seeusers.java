package TestScenario;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Testcases.loginscinario;
import file.ServicesPage;
import file.loginPage;

public class seeusers {
	private WebDriver driver;
	String driverPath="C:\\Users\\User\\Downloads\\ck\\chromedriver.exe";
	public static final Logger log = Logger.getLogger(loginscinario.class.getName());
  private  loginPage loginObj;
  
	@BeforeTest
    public void setup(){

        System.setProperty("webdriver.chrome.driver", driverPath);

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.get("http://localhost:8081/goverment/login.jsp");

    }
	  @Test(priority = 1)
	    public void Login(){
	        WebDriverWait wait = new WebDriverWait(driver, 2);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login")));
	        loginObj = new loginPage(driver);
	        log.info("Add username,password & login to your account ..");
	        loginObj.login("omarelbasha100@hotmail.com","123");
	    }
	  @Test(priority = 2)
	  public void gotouser() {
			 driver.findElement(By.id("u")).click();
		 }
}
