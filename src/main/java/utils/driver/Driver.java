package utils.driver;

import com.github.webdriverextensions.WebComponent;
import org.openqa.selenium.WebDriver;

public abstract class Driver extends WebComponent {

    public static WebDriver driver;

    public void initialize(){driver = DriverFactory.getDriver("chrome");}

    public void terminate(){driver.quit();}

    public abstract void scrollPageDown();

    public abstract void iconShoppingCart();
}