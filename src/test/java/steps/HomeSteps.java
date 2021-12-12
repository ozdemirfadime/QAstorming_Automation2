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
}
