package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindAll;

public class InventoryPage extends BasePage {

    // ------------------------------------------Find
    // selectors---------------------------------------//

    // -----image--------
    @FindBy(xpath = "//*[@id=\"item_4_img_link\"]/img")
    public WebElement imagenBackpack;

    @FindBy(xpath = "//*[@id=\"item_0_img_link\"]/img")
    public WebElement imagenBikelight;

    @FindBy(xpath = "//*[@id=\"item_1_img_link\"]/img")
    public WebElement imagenBoltshirt;

    @FindBy(xpath = "//*[@id=\"item_5_img_link\"]/img")
    public WebElement imagenFleecejacket;

    @FindBy(xpath = "//*[@id=\"item_2_img_link\"]/img")
    public WebElement imagenLabsonesie;

    @FindBy(xpath = "//*[@id=\"item_3_img_link\"]/img")
    public WebElement imagenAllthethings;

    // -----title --------

    @FindBy(xpath = "//*[@id=\"item_4_title_link\"]/div")
    public WebElement titleBackpack;

    @FindBy(xpath = "//*[@id=\"item_0_title_link\"]/div")
    public WebElement titleBikelight;

    @FindBy(xpath = "//*[@id=\"item_1_title_link\"]/div")
    public WebElement titleBoltshirt;

    @FindBy(xpath = "//*[@id=\"item_5_title_link\"]/div")
    public WebElement titleFleecejacket;

    @FindBy(xpath = "//*[@id=\"item_2_title_link\"]/div")
    public WebElement titleLabsonesie;

    @FindBy(xpath = "//*[@id=\"item_3_title_link\"]/div")
    public WebElement titleAllthethings;

    // -----item desc--------

    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[1]/div")
    public WebElement descBackpack;

    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[2]/div[2]/div[1]/div")
    public WebElement descBikelight;

    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[3]/div[2]/div[1]/div")
    public WebElement descBoltshirt;

    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[4]/div[2]/div[1]/div")
    public WebElement descFleecejacket;

    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[5]/div[2]/div[1]/div")
    public WebElement descLabsonesie;

    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[6]/div[2]/div[1]/div")
    public WebElement descAllthethings;

    // -----item price--------

    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div")
    public WebElement priceBackpack;

    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[2]/div[2]/div[2]/div")
    public WebElement priceBikelight;

    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[3]/div[2]/div[2]/div")
    public WebElement priceBoltshirt;

    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[4]/div[2]/div[2]/div")
    public WebElement priceFleecejacket;

    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[5]/div[2]/div[2]/div")
    public WebElement priceLabsonesie;

    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[6]/div[2]/div[2]/div")
    public WebElement priceAllthethings;

    // -----Button add--------
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement addToCartBackpackButton;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    public WebElement addToCartBikelightButton;

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    public WebElement addToCartBoltshirtButton;

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    public WebElement addToCartFleecejacketButton;

    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    public WebElement addToCartLabsonesieButton;

    @FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    public WebElement addToCartAllthethingsButton;

    // -----Button remove--------
    @FindBy(id = "remove-sauce-labs-backpack")
    public WebElement removeToCartBackpackButton;

    @FindBy(id = "remove-sauce-labs-bike-light")
    public WebElement removeToCartBikelightButton;

    @FindBy(id = "remove-sauce-labs-bolt-t-shirt")
    public WebElement removeToCartBoltshirtButton;

    @FindBy(id = "remove-sauce-labs-fleece-jacket")
    public WebElement removeToCartFleecejacketButton;

    @FindBy(id = "remove-sauce-labs-onesie")
    public WebElement removeToCartLabsonesieButton;

    @FindBy(id = "remove-test.allthethings()-t-shirt-(red)")
    public WebElement removeToCartAllthethingsButton;

    // -------------------------------------------Constructor----------------------------------------//

    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    // ------------------------------------------Actions//// Methods------------------------------------//

    // -----image--------

    public WebElement getImagenBackpack() {
        imagenBackpack.getTagName();
        return imagenBackpack;
    }
    public WebElement getImagenBikelight() {
        imagenBikelight.getTagName();
        return imagenBikelight;
    }
    public WebElement getImagenBoltshirt() {
        imagenBoltshirt.getTagName();
        return imagenBoltshirt;
    }
    public WebElement getImagenFleecejacket() {
        imagenFleecejacket.getTagName();
        return imagenFleecejacket;
    }
    public WebElement getImagenLabsonesie() {
        imagenLabsonesie.getTagName();
        return imagenLabsonesie;
    }
    public WebElement getImagenAllthethings() {
        imagenBackpack.getTagName();
        return imagenAllthethings;
    }




    // -----title --------

    public WebElement getTitleBackpack() {
        titleBackpack.getText();
        return titleBackpack;
    }

    public WebElement getTitleBikelight() {
        titleBikelight.getText();
        return titleBikelight;
    }
    public WebElement getTitleBoltshirt() {
        titleBoltshirt.getText();
        return titleBoltshirt;
    }
    public WebElement getTitleFleecejacket() {
        titleFleecejacket.getText();
        return titleFleecejacket;
    }
    public WebElement getTitleLabsonesie() {
        titleLabsonesie.getText();
        return titleLabsonesie;
    }
    public WebElement getTitleAllthethings() {
        titleAllthethings.getText();
        return titleAllthethings;
    }
    // -----item desc--------

    public WebElement getDescBackpack() {
        descBackpack.getText();
        return descBackpack;
    }

    public WebElement getDescBikelight() {
        descBikelight.getText();
        return descBikelight;
    }
    public WebElement getDescBoltshirt() {
        descBoltshirt.getText();
        return descBoltshirt;
    }
    public WebElement getDescFleecejacket() {
        descFleecejacket.getText();
        return descFleecejacket;
    }
    public WebElement getDescLabsonesie() {
        descLabsonesie.getText();
        return descLabsonesie;
    }
    public WebElement getDescAllthethings() {
        descAllthethings.getText();
        return descAllthethings;
    }

    // -----item price--------

    public WebElement getPriceBackpack() {
        priceBackpack.getText();
        return priceBackpack;
    }

    public WebElement getPriceBikelight() {
        priceBikelight.getText();
        return priceBikelight;
    }
    public WebElement getPriceBoltshirt() {
        priceBoltshirt.getText();
        return priceBoltshirt;
    }
    public WebElement getPriceFleecejacket() {
        priceFleecejacket.getText();
        return priceFleecejacket;
    }
    public WebElement getPriceLabsonesie() {
        priceLabsonesie.getText();
        return priceLabsonesie;
    }
    public WebElement getPriceAllthethings() {
        priceAllthethings.getText();
        return priceAllthethings;
    }

    // -----Button add--------
    public void clickAddToCartBackpackButton() {
        addToCartBackpackButton.click();
    }

    public void clickAddToCartBikelightButton() {
        addToCartBikelightButton.click();
    }

    public void clickAddToCartBoltshirtButton() {
        addToCartBoltshirtButton.click();
    }

    public void clickAddToCartFleecejacketButton() {
        addToCartFleecejacketButton.click();
    }

    public void clickAddToCartLabsonesieButton() {
        addToCartLabsonesieButton.click();
    }

    public void clickAddToAllthethingsButton() {
        addToCartAllthethingsButton.click();
    }

    // -----Button remove--------

    public void clickRemoveToCartBackpackButton() {
        removeToCartBackpackButton.click();
    }

    public void clickRemoveToCartBikelightButton() {
        addToCartBikelightButton.click();
    }

    public void clickRemoveToCartBoltshirtButton() {
        removeToCartBoltshirtButton.click();
    }

    public void clickRemoveToCartFleecejacketButton() {
        removeToCartFleecejacketButton.click();
    }

    public void clickRemoveToCartLabsonesieButton() {
        removeToCartLabsonesieButton.click();
    }

    public void clickRemoveToAllthethingsButton() {
        removeToCartAllthethingsButton.click();
    }



}
