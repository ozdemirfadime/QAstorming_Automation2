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

    @FindBy(css = "[class*='.added_to_cart']")
    public List<WebElement> viewCart;

    @FindBy(css = "[class*='cart-page-link']")
    public WebElement iconShoppingCart;

    public void checkProductPage() {
        String ActualPage = driver.getCurrentUrl();
        String ExpectedPage = "https://training.qastorming.com/shop/";
        Assert.assertEquals(ActualPage, ExpectedPage);}

    public void clickShoppingCartIcon() {iconShoppingCart.click();}

    public void clickAddToCart(int firstAddToCard) {addToCart.get(0).click();}
        //addToCart.get(1).click();



}


