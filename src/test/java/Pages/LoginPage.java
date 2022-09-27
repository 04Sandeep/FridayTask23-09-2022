package Pages;

import StepDefinition.BaseClass;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LoginPage extends BaseClass
{
    WebDriver driver;
    WebDriverWait wait;

    By username = By.name("username");
    By password = By.name("password");
    By loginButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
    By clickOnprofile = By.xpath("//span[@class='oxd-userdropdown-tab']");
    By clickOnLogOut = By.xpath("//a[contains(text(), 'Logout')]");

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        wait = new WebDriverWait(driver,4);
    }

    public void loginPage() throws IOException {

        wait.until(ExpectedConditions.elementToBeClickable(username));
        String path = System.getProperty("user.dir") + "/src/test/java/TestData/Book1.xlsx";
        FileInputStream prop1 = null;
        try {
            prop1 = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        XSSFWorkbook wb = new XSSFWorkbook(prop1);
        XSSFSheet sheet = wb.getSheet("Sheet1");
        String enteruserName = sheet.getRow(1).getCell(0).getStringCellValue();
        String enterPassword = sheet.getRow(1).getCell(1).getStringCellValue();
        driver.findElement(username).sendKeys(enteruserName);
        driver.findElement(password).sendKeys(enterPassword);
        driver.findElement(loginButton).click();
    }
      public void logout()
      {
          driver.findElement(clickOnprofile).click();
           driver.findElement(clickOnLogOut).click();
       }
}

