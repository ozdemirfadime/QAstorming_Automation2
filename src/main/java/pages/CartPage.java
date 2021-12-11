package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utilities;

public class CartPage extends Utilities {

    // @FindBy(xpath = "//div[text() ='Update cart']")
    @FindBy(css = "[name ='Update cart']")
    public WebElement updateCartButton;

    @FindBy(css = "[inputmode ='numeric']")
    public WebElement productQuantity;
}
