package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AddToCart{

    WebDriver driver;
    WebDriverWait wait;

    By selectItem = By.id("add-to-cart-sauce-labs-bike-light");
    By addToCartItem = By.className("shopping_cart_link");
    By checkout = By.id("checkout");
    By enterFirstName = By.name("firstName");
    By enterLastName = By.name("lastName");
    By enterPostalCode = By.name("postalCode");
    By clickOnContinue = By.name("continue");
    By clickOnFinish = By.name("finish");
    By backToHome = By.xpath("//button[@name='back-to-products']");

    public AddToCart(WebDriver driver)
     {
        this.driver = driver;
        wait = new WebDriverWait(driver, 4);
     }

     public void addToCart()
     {

        driver.findElement(selectItem) .click();
        driver.findElement( addToCartItem).click();
        wait.until(ExpectedConditions.elementToBeClickable(checkout));
        driver.findElement(checkout).click();
        driver.findElement(enterFirstName).sendKeys("Sandeep");
        driver.findElement(enterLastName).sendKeys("Kaur");
        driver.findElement(enterPostalCode).sendKeys("125055");
        driver.findElement(clickOnContinue).click();
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='cart_desc_label']")).getText(),"DESCRIPTION");
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnFinish));
        driver.findElement(clickOnFinish).click();
        driver.findElement(backToHome).click();
    }
}




