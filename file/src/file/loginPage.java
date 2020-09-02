package file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage {
private  WebDriver driver;
private WebElement username;
private WebElement password;
public loginPage(WebDriver driver) {
	this.driver=driver;
}
public WebElement SetUsername(String UN) {
    WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
    username = driver.findElement(By.id("email"));
    username.sendKeys(UN);
    return username;
}
public WebElement SetPassword(String pass) {
    password = driver.findElement(By.id("password"));
    password.sendKeys(pass);
    return password;
}
public ServicesPage clickLoginSubmit(){
    driver.findElement(By.id("login")).click();
    return new ServicesPage(driver);
}
public void login(String UN, String pass) {
    SetUsername(UN);
    SetPassword(pass);
    clickLoginSubmit();

}
}
