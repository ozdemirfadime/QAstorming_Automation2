package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utilities;

import java.util.List;

public class ProductPage extends Utilities {

    @FindBy(css = "[class*='woocommerce-LoopProduct-link']")
    public List<WebElement> productList;

    @FindBy(css = "[class*='add_to_cart_button']")
    public List<WebElement> addToCart;

    @FindBy(css = "[class*='added_to_cart']")
    public List<WebElement> viewCart;

    @FindBy(css = "[class*='cart-page-link']")
    public WebElement iconShoppingCart;

    @FindBy(css = "[name='orderby'] option")
    public List<WebElement> orderByProduct;


    public void checkProductPage() {
        String ActualPage = driver.getCurrentUrl();
        String ExpectedPage = "https://training.qastorming.com/shop/";
        Assert.assertEquals(ActualPage, ExpectedPage);
    }

    public void clickShoppingCartIcon() {
        iconShoppingCart.click();
    }

    public void clickAddToCart(int firstAddToCard) {
        addToCart.get(0).click();
    } //addToCart.get(1).click();

    public void clickSortProductOnDropDown(String sortingName) {
        for (WebElement sortElement : orderByProduct) {
            if (sortElement.getText().equalsIgnoreCase(sortingName)) {
                sortElement.click();
                return;
            }
        }
        Assert.fail("No dropdown item called " + sortingName + " could be located on the dropdown.");
    }

    public void clickFirstThreeAddToCart() {
        addToCart.get(0).click();
        addToCart.get(1).click();
        addToCart.get(2).click();
    }

    public void clickViewCart(int viewCard) {
        viewCart.get(0).click();
    }


}


