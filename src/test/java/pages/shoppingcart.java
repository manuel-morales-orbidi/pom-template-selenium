package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class shoppingcart extends BasePage {

    // ------------------------------------------Others
    // elements---------------------------------------//
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div[1]/div[2]/div")
    private WebElement applogo;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div[2]/span")
    private WebElement titleyourcart;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div[1]/div[1]")
    private WebElement qtylabel;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div[1]/div[2]")
    private WebElement titledescription;
    // ------------------------------------------shopping_cart---------------------------------------//
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div[1]/div[3]/a")
    private WebElement shoppingcartlink;

    // ------------------------------------------cartquantity---------------------------------------//
    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div[1]/div[3]/div[1]")
    private WebElement cartquantity1;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div[1]/div[4]/div[1]")
    private WebElement cartquantity2;

    // -------------------------------------------Inventory Item
    // Name----------------------------------------//

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div[1]/div[3]/div[2]/a/div")
    private WebElement item1;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div[1]/div[4]/div[2]/a/div")
    private WebElement item2;

    // -------------------------------------------Inventory Item
    // Desc----------------------------------------//

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div[1]/div[3]/div[2]/div[1]")
    private WebElement itemdesc1;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div[1]/div[4]/div[2]/div[1]")
    private WebElement itemdesc2;

    // -------------------------------------------Inventory Item
    // price----------------------------------------//

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div")
    private WebElement itemprice1;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div[1]/div[4]/div[2]/div[2]/div")
    private WebElement itemprice2;

    // -------------------------------------------Buttons----------------------------------------//

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/button")
    private WebElement buttonremove1;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div[1]/div[4]/div[2]/div[2]/button")
    private WebElement buttonremove2;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div[2]/button[1]")
    private WebElement buttoncontinueshop;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div[2]/button[2]")
    private WebElement buttoncheckout;

    // -------------------------------------------Constructor----------------------------------------//

    public shoppingcart(WebDriver driver) {
        super(driver);
    }
    // -------------------------------------------///Action
    // Methods///----------------------------------------//

    // ------------------------------------------Others
    // elements---------------------------------------//

    public String getappLogoText() {
        return applogo.getText();
    }

    public String gettitleyourcartText() {
        return titleyourcart.getText();
    }

    public String getqtylabelText() {
        return qtylabel.getText();
    }

    public String gettitledescriptionText() {
        return titledescription.getText();
    }

    public String getAppLogoText() {
        return applogo.getText();
    }

    // ------------------------------------------shopping_cart---------------------------------------//
    public String getshoppingcartlinkText() {
        return shoppingcartlink.getText();
    }

    // ------------------------------------------cartquantity---------------------------------------//
    public String getcartquantity1Text() {
        return cartquantity1.getText();
    }

    public String getcartquantity2Text() {
        return cartquantity2.getText();
    }

    // -------------------------------------------Inventory Item
    // Name----------------------------------------//

    public String getitem1Text() {
        return item1.getText();
    }

    public String getitem2Text() {
        return item2.getText();
    }

    // -------------------------------------------Inventory Item
    // Desc----------------------------------------//

    public String getitemdesc1Text() {
        return itemdesc1.getText();
    }

    public String itemdesc2Text() {
        return itemdesc2.getText();
    }

    // -------------------------------------------Inventory Item
    // price----------------------------------------//

    public String getitemprice1Text() {
        return itemprice1.getText();
    }

    public String getitemprice2Text() {
        return itemprice2.getText();
    }

    // -------------------------------------------Buttons----------------------------------------//

    public void clickbuttonremove1() {
        buttonremove1.click();
    }

    public void clickbuttonremove2() {
        buttonremove2.click();
    }

    public void clickbuttoncontinueshop() {
        buttoncontinueshop.click();
    }

    public void buttoncheckout() {
        buttoncheckout.click();
    }

}
