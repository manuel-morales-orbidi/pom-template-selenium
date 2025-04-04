package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    //------------------------------------------Find selectors---------------------------------------//

    @FindBy(className = "login_logo")
    private WebElement logo;

    @FindBy(id = "user-name")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(xpath = "//h3[@data-test='error']")
    private WebElement errorMessage;

    //-------------------------------------------Constructor----------------------------------------//

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //------------------------------------------Actions Methods------------------------------------//

    public WebElement getLogo() {
        return logo;
    }

    public void setUserName(String string) {
        userName.sendKeys(string);
    }

    public void setPassword(String string) {
        password.sendKeys(string);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public WebElement getErrorMessage() {
        errorMessage.getText();
        return errorMessage;
    }
}
