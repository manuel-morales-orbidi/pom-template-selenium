package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import pages.InventoryPage;
import pages.LoginPage;
import pages.shoppingcart;

public class ShoppingCartTest extends BaseClass {

    @Test
    public void addItemToCart() throws Exception {

        // Instanciar las clases
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        shoppingcart cart = new shoppingcart(driver);

        // Iniciar sesion
        loginPage.setUserName("standard_user");
        Thread.sleep(2000);
        loginPage.setPassword("secret_sauce");
        Thread.sleep(2000);
        loginPage.clickLoginButton();
        Thread.sleep(2000);

        // Agregar al carrito
        inventoryPage.clickAddToCartBackpackButton();

        // Ir al carrito
        inventoryPage.clickshoppingcartlink();
        Thread.sleep(2000);

        // Obtener el nombre del producto
        String productName = cart.getitem1Text();

        Assert.assertTrue(
                productName.contains("Sauce Labs Backpack"),
                "El producto 'Sauce Labs Backpack' no se encontro en el carrito.");
    }

    @Test
    public void removeItemFromCart() throws Exception {

        // Instanciar las clases
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        shoppingcart cart = new shoppingcart(driver);

        // Iniciar sesion
        loginPage.setUserName("standard_user");
        Thread.sleep(2000);
        loginPage.setPassword("secret_sauce");
        Thread.sleep(2000);
        loginPage.clickLoginButton();
        Thread.sleep(2000);

        // Agregar al carrito
        inventoryPage.clickAddToCartBackpackButton();

        // Ir al carrito
        inventoryPage.clickshoppingcartlink();
        Thread.sleep(2000);

        // Eliminar el producto del carrito
        shoppingcart.clickbuttonremove1();

    }

    @Test
    public void verifyBackpackProduct() throws Exception {
        // Instanciar las clases
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        
        // Iniciar sesion
        loginPage.setUserName("standard_user");
        Thread.sleep(2000);
        loginPage.setPassword("secret_sauce");
        Thread.sleep(2000);
        loginPage.clickLoginButton();
        Thread.sleep(2000);

        // Verificar que la imagen esté visible
        Assert.assertTrue(
                inventoryPage.getImagenBackpack().isDisplayed(),
                "La imagen del producto no se muestra");

        // Verificar que el título del producto sea correcto
        String productTitle = inventoryPage.getTitleBackpack().getText();
        Assert.assertTrue(
                productTitle.contains("Sauce Labs Backpack"),
                "El título del producto no es el esperado");

        // Verificar que la descripción no esté vacía
        String productDescription = inventoryPage.getDescBackpack().getText();
        Assert.assertTrue(
                !productDescription.isEmpty(),
                "La descripción del producto está vacía");

        // Verificar el precio
        String productPrice = inventoryPage.getPriceBackpack().getText();
        Assert.assertTrue(
                productPrice.equals("$29.99"),
                " El precio del producto no es $29.99");

        // Verificar que el botón 'Add to cart' esté visible y habilitado
        Assert.assertTrue(
                inventoryPage.addToCartBackpackButton.isDisplayed(),
                "El botón 'Add to cart' no está visible");

        Assert.assertTrue(
                inventoryPage.addToCartBackpackButton.isEnabled(),
                "El botón 'Add to cart' no está habilitado");
    }

    @Test
    public void returnToInventoryAfterAddingItem() throws Exception {

        // Instanciar las clases
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        shoppingcart cart = new shoppingcart(driver);

        // Iniciar sesión
        loginPage.setUserName("standard_user");
        Thread.sleep(2000);
        loginPage.setPassword("secret_sauce");
        Thread.sleep(2000);
        loginPage.clickLoginButton();
        Thread.sleep(2000);

        // Agregar al carrito
        inventoryPage.clickAddToCartBackpackButton();

        // Ir al carrito
        inventoryPage.clickshoppingcartlink();
        Thread.sleep(2000);

        // Hacer clic en el botón "Continue Shopping"
        cart.clickbuttoncontinueshop();
        Thread.sleep(2000);

        // Verificar que se regresó correctamente a la tienda
        Assert.assertTrue(inventoryPage.getTitleBackpack().isDisplayed(), "No regresó a la página de inventario");
        driver.navigate().refresh();

    }
}
