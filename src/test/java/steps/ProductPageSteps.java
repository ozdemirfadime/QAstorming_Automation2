package steps;

import io.cucumber.java.en.Given;
import pages.ProductPage;

public class ProductPageSteps {

    ProductPage productPage = new ProductPage();

    @Given("Check to go to Products page")
    public void checkProductPage() {
        productPage.checkProductPage();
    }

    @Given("Click the Add to Cart button for the first product on the product page")
    public void clickAddToCart() {
        productPage.clickAddToCart(0);
       // productPage.clickAddToCart(1);
    }

    @Given("Click the shopping cart icon in the navigation bar")
    public void clickShoppingCartIcon() {productPage.iconShoppingCart.click();}


}
