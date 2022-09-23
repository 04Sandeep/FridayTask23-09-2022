package Pages;

import StepDefinition.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseClass
{
    WebDriver driver;

    By username = By.name("user-name");
    By password = By.name("password");
    By loginButton = By.name("login-button");

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void loginPage() {

        driver.findElement(username).sendKeys(prop.getProperty("username"));
        driver.findElement(password).sendKeys(prop.getProperty("password"));
        driver.findElement(loginButton).click();
    }
}

