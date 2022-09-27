package PageFactory;

import Pages.ApplyForLeave;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class ObjectPageFactory {

        WebDriver driver;
        private LoginPage loginPage ;
        private ApplyForLeave applyForLeave;

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

    public ApplyForLeave getApplyForLeave()
    {
        if(applyForLeave==null)
        {
            applyForLeave = new ApplyForLeave(driver);
        }
        return  applyForLeave;
    }
    }
