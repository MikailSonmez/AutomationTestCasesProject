package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.Driver.driver;

public class AutomationExerciseDefinitions {

    AutomationExercisePage automationExercisePage=new AutomationExercisePage();

    @Given("Launch browser Navigate to url {string}")
    public void launch_browser_navigate_to_url(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("AutomationExerciseUrl"));
    }
    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("https://automationexercise.com/"));
    }
    @Given("Click on {string} button")
    public void click_on_button(String SignupLoginButton) {
        automationExercisePage.signupLogin.click();
    }
    @Given("Verify {string} is visible")
    public void verify_is_visible(String string) {
        automationExercisePage.newUserSignup.isDisplayed();
    }
    @Then("Enter name and email address")
    public void enter_name_and_email_address() {
        automationExercisePage.newUserNameTextBox.sendKeys(ConfigReader.getProperty("AutomationExerciseUserName"));
        automationExercisePage.newUserEmailTextBox.sendKeys(ConfigReader.getProperty("AutomationExerciseEmail"));

    }
    @Given("Click signup {string} button")
    public void click_signup_button(String string) {
        automationExercisePage.signUpButton.click();

    }
    @Given("Verify that {string} is visible")
    public void verify_that_is_visible(String string) {
        automationExercisePage.enterAccountInformation.isDisplayed();
    }
    @Then("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() {
        Actions actions = new Actions(driver);
        automationExercisePage.titleMr.click();
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("Mikail4458.").sendKeys(Keys.TAB)
                .click().sendKeys("27").sendKeys(Keys.TAB).click().sendKeys("September")
                .click().sendKeys(Keys.TAB);

    }
    @Given("Select checkbox {string}")
    public void select_checkbox(String string) {

    }
    @Then("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {

    }
    @Given("Click {string}")
    public void click(String string) {

    }
    @Then("Click {string} button")
    public void click_button(String string) {

    }
    @Given("Click delete {string} button")
    public void click_delete_button(String string) {

    }
    @Then("Verify that {string} is visible and click {string} button")
    public void verify_that_is_visible_and_click_button(String string, String string2) {

    }
}
