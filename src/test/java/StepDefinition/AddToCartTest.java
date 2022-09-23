package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddToCartTest extends BaseClass
{

        @Given("^User is on Login Page and enter the Valid Credentials$")
        public void User_is_on_Login_Page_and_enter_the_Valid_Credentials()
        {
            initialization();
            objectPageFactory.getLoginPage().loginPage();
        }

        @Then("^user should add the item to Cart and Checkout$")
        public void user_should_add_the_item_to_Cart_and_Checkout()
        {
            objectPageFactory.getAddToCart().addToCart();
        }

        @When("^user click on Logout$")
        public void user_click_on_Logout()
        {
            objectPageFactory.getLogoutAfterShopping().logout();
        }

        @Then("^user is on Homepage$")
        public void user_is_on_Homepage()
        {
            initialization();
        }
}
