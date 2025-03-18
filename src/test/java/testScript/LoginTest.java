package testScript;

import baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseClass {
    @Test
    public void successfulLoginTest()throws Exception{
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.setUserName("standard_user");
        Thread.sleep(2000);
        loginPage.setPassword("secret_sauce");
        Thread.sleep(2000);
        loginPage.clickLoginButton();
        Thread.sleep(2000);

        Assert.assertTrue(homePage.getHomeLogo().isDisplayed(), "El logo de inicio no está visible");

        WebElement element = homePage.getHomeLogo();
        Assert.assertEquals(element.getText(), "Swag Labs");
        System.out.println("Prueba OK..." + element.getText());
        driver.navigate().refresh();
    }

    @Test
    public void unsuccessfulUserLoginTest()throws Exception{
        LoginPage loginPage = new LoginPage(driver);

        loginPage.setUserName("Usuario_invalido");
        Thread.sleep(2000);
        loginPage.setPassword("secret_sauce");
        Thread.sleep(2000);
        loginPage.clickLoginButton();
        Thread.sleep(2000);

        WebElement element = loginPage.getErrorMessage();
        Assert.assertEquals(element.getText(), "Epic sadface: Username and password do not match any user in this service");
        System.out.println("Prueba OK..." + element.getText());
        driver.navigate().refresh();
    }

    @Test
    public void unsuccessfulPasswordLoginTest()throws Exception{
        LoginPage loginPage = new LoginPage(driver);

        loginPage.setUserName("standard_user");
        Thread.sleep(2000);
        loginPage.setPassword("password_incorrect");
        Thread.sleep(2000);
        loginPage.clickLoginButton();
        Thread.sleep(2000);

        WebElement element = loginPage.getErrorMessage();
        Assert.assertEquals(element.getText(), "Epic sadface: Username and password do not match any user in this service");
        System.out.println("Prueba OK..." + element.getText());
        driver.navigate().refresh();
    }

    @Test
    public void unsuccessfulPasswordEmptyTest()throws Exception{
        LoginPage loginPage = new LoginPage(driver);

        loginPage.setUserName("");
        Thread.sleep(2000);
        loginPage.setPassword("");
        Thread.sleep(2000);
        loginPage.clickLoginButton();
        Thread.sleep(2000);

        WebElement element = loginPage.getErrorMessage();
        Assert.assertEquals(element.getText(), "Epic sadface: Username is required");
        System.out.println("Prueba OK..." + element.getText());
        driver.navigate().refresh();
    }
}
