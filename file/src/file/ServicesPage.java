package file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ServicesPage {
private WebDriver driver;
public ServicesPage(WebDriver driver) {
	this.driver=driver;
}
public Searchpage  MakeNewRequest(String id)
{
	driver.findElement(By.id("btnnew")).click();
	driver.findElement(By.id(id)).click();
	return new Searchpage(driver);
}
public Searchpage seecurrentrequest() {
	driver.findElement(By.id("currentrequest")).click();
	return new Searchpage(driver);
}

}
