package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert;
import utils.Utilities;

import java.security.PublicKey;
import java.util.List;

public class HomePage extends Utilities {

    @FindBy(css = "[class*='custom-logo']")
    public WebElement homePage;

    @FindBy(xpath = "//span[text() ='SHOP NOW']")
    public WebElement ShopNowButton;

    @FindBy(css = "[id='site-navigation'] li ")
    public List<WebElement> menuCards;

    @FindBy(xpath = "//h2[text()='CONTACT INFO']")
    public WebElement contactInfo;

    @FindBy(css = "a[id='tg-scroll-to-top']")
    public WebElement scrollUp;

    @FindBy(css = "[class*='tg-site-header-top']")
    public WebElement topSite;

    public void checkHomepageOrNot() {
        String ActualPage = driver.getCurrentUrl();
        String ExpectedPage = "https://training.qastorming.com/";
        Assert.assertEquals(ActualPage, ExpectedPage);
    }

    public void clickShopNowButton(String buttonName) {
        ShopNowButton.click();
    }

    public void checkScrollPageDown() {
        if (contactInfo.isDisplayed()) {
            System.out.println(" Contact Info element visible on the bottom of home page ");
        }
        else {Assert.fail(" Contact Info element doesnt visible on the bottom of" +
                " home page");}
    }
    public void ScrollPageUp(){
        scrollUp.click();

        if (topSite.isDisplayed()) {
            System.out.println(" Page Header element visible on the top of  page ");
        }
        else {Assert.fail(" Page Header element doesnt visible on the top of page");}

    }

    public void clickMenuElement(String itemName){
        for (WebElement menuElement:menuCards) {
            if (menuElement.getText().equalsIgnoreCase(itemName)){
                clickElement(menuElement);
                return;
            }
        }
        Assert.fail("No menu item called "+itemName+" could be located on the navigation bar.");
    }

}




