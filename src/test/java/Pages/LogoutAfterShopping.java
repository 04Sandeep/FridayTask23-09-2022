package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutAfterShopping {

    WebDriver driver;

    By selectMenuItem = By.xpath("//button[contains(text(),'Open Menu')]");
    By clickOnLogout = By.xpath("//a[@id='logout_sidebar_link']");

    public LogoutAfterShopping(WebDriver driver) {
        this.driver = driver;
    }

    public void logout()
    {
        driver.findElement(selectMenuItem).click();
        driver.findElement(clickOnLogout).click();
    }
}
