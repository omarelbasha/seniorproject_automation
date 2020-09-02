package file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Searchpage {
	private WebDriver driver;
	private WebElement  fname;
	private WebElement father;
	private WebElement lname;
	private WebElement mother;
	private WebElement rn;
public Searchpage(WebDriver driver) {
	this.driver=driver;
}
public WebElement setfname(String first) {
	fname=driver.findElement(By.id("frname"));
	fname.sendKeys(first);
	return fname;
}
public WebElement setfather(String first) {
	father=driver.findElement(By.id("mrname"));
	father.sendKeys(first);
	return father;
}
public WebElement setlname(String first) {
	lname=driver.findElement(By.id("lrname"));
	lname.sendKeys(first);
	return lname;
}
public WebElement setmother(String first) {
	mother=driver.findElement(By.id("mothername"));
	mother.sendKeys(first);
	return mother;
}
public WebElement setrn(int first) {
	rn=driver.findElement(By.id("rn"));
	rn.sendKeys(String.valueOf(first));
	return rn;
}
public searchresult clickLoginSubmit(){
    driver.findElement(By.id("search")).click();
   return new searchresult(driver);
}
public void search(String first,String father_name,String last,String mname,int r) {
	setfname(first);
	setfather(father_name);
	setlname(last);
	setmother(mname);
	setrn(r);
	clickLoginSubmit();
}
}
