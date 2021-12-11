package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert;
import utils.Utilities;
import java.util.List;

public class HomePage extends Utilities {

    @FindBy(css = "[class*='custom-logo']")
    public WebElement homePage;

    @FindBy(xpath = "//span[text() ='SHOP NOW']")
    public WebElement ShopNowButton;

    @FindBy(css = "[class*='menu-primary']")
    public List<WebElement> topMenuCard;


    public void checkHomePage() {
        String ActualPage = driver.getCurrentUrl();
        String ExpectedPage = "https://training.qastorming.com/shop/";
        Assert.assertEquals(ActualPage, ExpectedPage);
    }

    public void clickShopNowButton(String buttonName) {
        ShopNowButton.click();
    }
}




