package steps;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.CartPage;

import java.io.IOException;

public class CartPageSteps {
    CartPage cartPage = new CartPage();

    @Given("Check this product has been added to shopping cart or not")
    public void checkAddedProduct() {
        Assert.assertTrue("No product in basket",cartPage.shopTable.isDisplayed());}

    @Given("Update Product quantity as {}")
    public void increaseQuantity(String number){cartPage.increaseQuantity(number);}

    @Given("Click the Update Cart button on the Cart page")
    public void updateCartButton(){cartPage.updateCartButton.click();}

    @Given("Check total cart amount is that correctly increased")
    public void checkTotalCartAmount(){cartPage.checkTotalCartAmount();}

    @Given("Remove this products in shopping cart then check warning message as Your cart is currently empty")
    public void clearCartPage() throws IOException {cartPage.clearCartPage();}

}
