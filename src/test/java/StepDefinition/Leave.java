package StepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.io.IOException;

public class Leave extends BaseClass

    {
        @Given("^navigate to Orange HRM website$")
        public void navigate_to_Orange_HRM_website ()
        {
            initialization();
        }

        @When("^user is on Login Page and enter the Valid Credentials and verify$")
        public void  user_is_on_Login_Page_and_enter_the_Valid_Credentials_and_verify() throws IOException {
            objectPageFactory.getLoginPage().loginPage();
        }

        @Then("user will apply for leave")
        public void userWillApplyForLeave() {
            objectPageFactory.getApplyForLeave().applyForLeave();
        }

        @And("^user will log out$")
       public void user_will_log_out()
       {
            objectPageFactory.getLoginPage().logout();
        }
    }

