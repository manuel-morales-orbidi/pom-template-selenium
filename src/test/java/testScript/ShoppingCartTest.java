package testScript;
import baseClass.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InventoryPage;
import pages.LoginPage;
import pages.shoppingcart;

public class ShoppingCartTest extends BaseClass {

    @Test
    public void addItemToCart() throws Exception {

        //Instanciar las clases
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        shoppingcart cart = new shoppingcart(driver);

        //Iniciar sesion
        loginPage.setUserName("standard_user");
        Thread.sleep(2000);
        loginPage.setPassword("secret_sauce");
        Thread.sleep(2000);
        loginPage.clickLoginButton();
        Thread.sleep(2000);

        //Agregar al carrito
        inventoryPage.clickAddToCartBackpackButton();

        //Ir al carrito
        inventoryPage.clickshoppingcartlink();
        Thread.sleep(2000);

        //Obtener el nombre del producto
        String productName = cart.getitem1Text();

        Assert.assertTrue(
                productName.contains("Sauce Labs Backpack"),
                "El producto 'Sauce Labs Backpack' no se encontro en el carrito."
        );
    }

    @Test
    public void removeItemFromCart() throws Exception {

        //Instanciar las clases
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        shoppingcart cart = new shoppingcart(driver);

        //Iniciar sesion
        loginPage.setUserName("standard_user");
        Thread.sleep(2000);
        loginPage.setPassword("secret_sauce");
        Thread.sleep(2000);
        loginPage.clickLoginButton();
        Thread.sleep(2000);

        //Agregar al carrito
        inventoryPage.clickAddToCartBackpackButton();

        //Ir al carrito
        inventoryPage.clickshoppingcartlink();
        Thread.sleep(2000);

        //Eliminar el producto del carrito
        shoppingcart.clickbuttonremove1();

        //Verificar que el carrito este vacio
        String emptyCartMessage = cart.getcartquantity1Text();

        Assert.assertTrue(
                emptyCartMessage.contains("Your cart is empty"),
                "El carrito no esta vacio."
        );
    }
}
