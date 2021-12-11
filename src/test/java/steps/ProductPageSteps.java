package steps;
import io.cucumber.java.en.Given;
import pages.ProductPage;

public class ProductPageSteps {

    ProductPage productPage = new ProductPage();

    @Given("Check to go to Products page")
    public void checkProductPage(){productPage.checkProductPage();}


    }
