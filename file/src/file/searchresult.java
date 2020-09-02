package file;

import org.openqa.selenium.WebDriver;


public class searchresult {
private WebDriver driver;
public searchresult(WebDriver driver) {
	this.driver=driver;
}

public void newrequest(String a,int e) {
	driver.get("http://localhost:8081/goverment/"+a+".jsp?e="+e);
	
}

}
