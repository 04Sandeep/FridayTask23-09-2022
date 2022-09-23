package PageFactory;

import Pages.LoginPage;
import Pages.AddToCart;
import Pages.LogoutAfterShopping;
import org.openqa.selenium.WebDriver;

public class ObjectPageFactory {

    WebDriver driver;
    private LoginPage loginPage ;
    private AddToCart addToCart;
    private LogoutAfterShopping logout;

    public ObjectPageFactory(WebDriver driver)
    {
        this.driver = driver;
    }

    public LoginPage getLoginPage()
    {

        if(loginPage==null)
        {
            loginPage = new LoginPage(driver);
        }
        return  loginPage;
    }

    public AddToCart getAddToCart()
    {
        if(addToCart == null)
        {
            addToCart = new AddToCart(driver);
        }
        return addToCart;
    }

    public LogoutAfterShopping getLogoutAfterShopping()
    {
        if(logout == null)
        {
            logout = new LogoutAfterShopping(driver);
        }
        return logout;
    }
}
