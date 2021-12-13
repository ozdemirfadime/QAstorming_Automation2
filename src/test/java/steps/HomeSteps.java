package steps;

import io.cucumber.java.en.Given;

import pages.HomePage;


public class HomeSteps {

    HomePage homePage = new HomePage();


    @Given("Click the {} button on the banner")
    public void clickShopNowButton(String buttonName) {
        homePage.clickShopNowButton(buttonName);
    }


    @Given("Check to go to homepage or not")
    public void checkHomepageOrNot() { homePage.checkHomepageOrNot();}


    @Given("Scroll down the page")
    public void ScrollPageDown(){homePage.scrollPageDown();}

    @Given("Check scrolled bottom of page")
    public void checkScrollPageDown(){homePage.checkScrollPageDown();}

    @Given("Scroll up the page then check there is top of page or not")
    public void ScrollPageUp(){homePage.ScrollPageUp();}

    @Given("Click menu item called {}")
    public void clickMenuElement(String itemName){ homePage.clickMenuElement(itemName);}



}
