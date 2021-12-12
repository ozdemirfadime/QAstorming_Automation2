package steps;
import io.cucumber.java.en.Given;
import pages.ProductPage;

public class ProductPageSteps {

    ProductPage productPage = new ProductPage();

    @Given("Check to go to Products page")
    public void checkProductPage(){productPage.checkProductPage();}

   /* @Given("Click the {} button for the first product on the product page")
    public void clickAddToCart(String firstAddToCard){productPage.clickAddToCart(firstAddToCard);}*/

    @Given("Click the shopping cart icon in the navigation bar")
    public void clickShoppingCartIcon(){productPage.iconShoppingCart.click();}


}
