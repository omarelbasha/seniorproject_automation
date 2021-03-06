package Testcases;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import file.RegPage;

public class regscnario {
	private WebDriver driver;
	String driverPath="C:\\Users\\User\\Downloads\\ck\\chromedriver.exe";
	public static final Logger log = Logger.getLogger(regscnario.class.getName());
  private  RegPage RegObj;
  @BeforeTest
  public void setup(){

      System.setProperty("webdriver.chrome.driver", driverPath);

      driver = new ChromeDriver();

      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      driver.manage().window().maximize();

      driver.get("http://localhost:8081/goverment/reg.jsp");

  }
  @Test(priority = 1)
  public void Login(){
      WebDriverWait wait = new WebDriverWait(driver, 2);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sign")));
      RegObj = new RegPage(driver);
      log.info("Add username,password & login to your account ..");
      RegObj.Reg("Firas", "Elbasha", "81456789", "firas@hotmail.com", "987", "987");
  }
}
