package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPagefactory {

	WebDriver driver;

    @FindBy(name = "fname")

    WebElement fname;

    @FindBy(name = "lname")

    WebElement lname;

    @FindBy(name = "phone")

    WebElement phoneCode;

    @FindBy(name = "email")

    WebElement email;

    @FindBy(name = "pass")

    WebElement password;

    @FindBy(name = "cpass")

    WebElement Cpassword;

    @FindBy(name = "sign")

    WebElement btnRegister;

    public RegistrationPagefactory(WebDriver driver) {

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }

    public void setFname(String first) {
        fname.sendKeys(first);
    }

    public void SetIdentificationID(String txtID) {
        lname.sendKeys(txtID);
    }

    public void SetUPhoneCode(String Pcode) {
        phoneCode.sendKeys(Pcode);
    }

  
    public void SetEmail(String Email) {
        email.sendKeys(Email);
    }

    public void SetPassword(String pass) {
        password.sendKeys(pass);
    }

    public void SetConfPassword(String Cpass) {
        Cpassword.sendKeys(Cpass);
    }

    public void submitRegistration() {
        btnRegister.click();
    }

    public void Register(String UN, String ID, String Pcode, String Pnum, String Email, String password, String Cpass) {
      setFname(UN);
        SetIdentificationID(ID);
        SetUPhoneCode(Pcode);
       
        SetEmail(Email);
        SetPassword(password);
        SetConfPassword(Cpass);
        submitRegistration();
//        driver.switchTo().alert().accept(); // To click on the "OK" button of the alert

    }

}
