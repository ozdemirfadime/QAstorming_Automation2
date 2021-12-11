package steps;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utilities;

public class HomeSteps {

    HomePage homePage = new HomePage();

    @Given("Check to go to homepage or not ")
    public void checkHomePage() {homePage.checkHomePage();}

    @Given("Click the {} button on the banner")
    public void clickShopNowButton(String buttonName) {homePage.clickShopNowButton(buttonName);}


}
