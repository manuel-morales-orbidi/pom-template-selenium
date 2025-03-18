package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    //------------------------------------------Find selectors---------------------------------------//

    @FindBy (className = "app_logo")
    public WebElement homeLogo;

    //-------------------------------------------Constructor----------------------------------------//

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //------------------------------------------Actions Methods------------------------------------//

    public WebElement getHomeLogo() {
        homeLogo.getTagName();
        return homeLogo;
    }

}
