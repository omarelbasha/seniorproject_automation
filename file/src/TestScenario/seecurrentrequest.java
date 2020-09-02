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

import file.Searchpage;
import file.ServicesPage;
import file.loginPage;
import file.searchresult;

public class seecurrentrequest {
	WebDriver driver;
	String driverPath="C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe";
	public static final Logger log = Logger.getLogger(seecurrentrequest.class.getName());
	private  loginPage loginObj;
	private Searchpage s;
	private ServicesPage sv;
	private searchresult sr;

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
	        loginObj.login("raed@hotmail.com","456");
	    }
	 
	  @Test(priority = 2)
	  public void gottosearchresult() {
		  sv=new ServicesPage(driver);
		  s=sv.seecurrentrequest();
		  s.search("Omar", "Anwar", "Elbasha", "Franjyi", 204);
	  }
	  @Test(priority = 3)
	  public void seecurrent() {
		  sr=new searchresult(driver);
		sr.newrequest("current", 1); 
	  }
	  
}
