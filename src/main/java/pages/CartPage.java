package pages;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utilities;

import java.io.IOException;
import java.sql.SQLOutput;

public class CartPage extends Utilities {

    // @FindBy(xpath = "//div[text() ='Update cart']")
    @FindBy(css = "[name ='update_cart']")
    public WebElement updateCartButton;

    @FindBy(css = "[class*='woocommerce-cart-form']")
    public WebElement shopTable;

    @FindBy(css = "[inputmode ='numeric']")
    public WebElement productQuantity;

     @FindBy(xpath = "//tr[@class=\"cart-subtotal\"]//bdi")
    //tr[@class="cart-subtotal"]//bdi
    public WebElement subtotalPrice;

    @FindBy(xpath = "//tr[@class=\"order-total\"]//bdi")
    public WebElement totalPrice;

    @FindBy(css = "a[class='remove']")
    public WebElement removeProduct;

    @FindBy(css = "[class*='cart-empty']")
    public WebElement emptyCard;


    public void checkAddedProduct() { shopTable.isDisplayed();}

    public void increaseQuantity(String number ){
        productQuantity.sendKeys(Keys.CONTROL + "a");
        productQuantity.sendKeys(Keys.DELETE);
        productQuantity.sendKeys("3");
    }
    public void updateCartButton(){ updateCartButton.click();}

    public void checkTotalCartAmount(){
        String subtotal = subtotalPrice.getText();
        String total  = totalPrice.getText();
        Assert.assertEquals("Total amount didnt correctly increased",subtotal,total);
        System.out.println(subtotal);
        System.out.println(total);
    }
    public void clearCartPage() throws IOException {
        removeProduct.click();
        String value = "Your cart is currently empty.";
        if(emptyCard.getText().contains(value)){
            System.out.println("Cart page has been empyted");
        }
        else{
            throw new IOException("Cart page couldnt be empty");

        }
    }



}


