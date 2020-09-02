package file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegPage {
private WebDriver driver;
private WebElement fname;
private WebElement lname;
private WebElement phone;
private WebElement email;
private WebElement pass;
private WebElement cpass;
	public RegPage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement setfname(String first_name) {
		fname=driver.findElement(By.id("fname"));
		fname.sendKeys(first_name);
		return fname;
	}
	public WebElement setlname(String last_name) {
		lname=driver.findElement(By.id("lname"));
		lname.sendKeys(last_name);
		return lname;
	}
	public WebElement setphone(String phone_number) {
		phone=driver.findElement(By.id("phone"));
		phone.sendKeys(phone_number);
		return phone;
	}
	public WebElement setemail(String u) {
		email=driver.findElement(By.id("email"));
		email.sendKeys(u);
		return email;
	}
	public WebElement setpass(String p) {
		pass=driver.findElement(By.id("pass"));
		pass.sendKeys(p);
		return pass;
	}
	public WebElement setcpass(String u) {
		cpass=driver.findElement(By.id("cpass"));
		cpass.sendKeys(u);
		return cpass;
	}
	public ServicesPage checkregsub(){
	    driver.findElement(By.id("sign")).click();
	    return new ServicesPage(driver);
	}
	public void Reg(String f,String l,String p,String e,String ps,String cps) {
		setfname(f);
		setlname(l);
		setphone(p);
		setemail(e);
		setpass(ps);
		setcpass(cps);
		checkregsub();
	}
}
