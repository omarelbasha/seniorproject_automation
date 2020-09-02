package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {

	 WebDriver driver;

	    @FindBy(name="email")

	    WebElement username;

	    @FindBy(name="password")

	    WebElement password;

	    @FindBy(name="login")

	    WebElement login;

	    public LoginPageFactory(WebDriver driver){

	        this.driver = driver;

	        //This initElements method will create all WebElements

	        PageFactory.initElements(driver, this);

	    }

	    //Set user name in textbox

	    public void setUserName(String UN){

	        username.sendKeys(UN);
	    }

	    //Set password in password textbox

	    public void setPassword(String pass){

	        password.sendKeys(pass);

	    }

	    //Click on login button

	    public void clickLogin(){

	        login.click();

	    }


	     // This POM method will be exposed in test case to login in the application

	    public void login(String UN,String pass){

	        //Fill user name

	        this.setUserName(UN);

	        //Fill password

	        this.setPassword(pass);

	        //Click Login button

	        this.clickLogin();

	    }


}
