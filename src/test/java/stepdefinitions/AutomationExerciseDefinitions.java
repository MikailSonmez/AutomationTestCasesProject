package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSutils;

import static utilities.Driver.driver;

public class AutomationExerciseDefinitions {

    AutomationExercisePage automationExercisePage=new AutomationExercisePage();

    Actions actions=new Actions(Driver.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) driver;



    @Given("Launch browser Navigate to url {string}")
    public void launch_browser_navigate_to_url(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("AutomationExerciseUrl"));
    }
    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("https://automationexercise.com/"));
    }

    @Given("Click on signup Login {string} button")
    public void click_on_signup_login_button(String string) {
        automationExercisePage.signupLoginButton.click();
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
        automationExercisePage.newUserSignUpButton.click();

    }
    @Given("Verify that {string} is visible")
    public void verify_that_is_visible(String string) {
        automationExercisePage.enterAccountInformation.isDisplayed();
    }
    @Then("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() {
        automationExercisePage.titleMr.click();
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("Mikail44584458").sendKeys(Keys.TAB)
                .click().sendKeys("17").sendKeys(Keys.TAB).click().sendKeys("September")
                .click().sendKeys(Keys.TAB).click().sendKeys("2005").click().perform();

    }
    @Given("Select checkbox {string}")
    public void select_checkbox(String string) {

    }
    @Then("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() throws InterruptedException {
        automationExercisePage.firstNameBox.click();
        actions.sendKeys("mikail").sendKeys(Keys.TAB)
                .sendKeys("donmez").sendKeys(Keys.TAB).sendKeys("linkedIn").sendKeys(Keys.TAB)
                .sendKeys("yesiltepe").sendKeys(Keys.TAB).sendKeys(Keys.TAB).click()
                .moveToElement(automationExercisePage.singapore).click().sendKeys(Keys.TAB).sendKeys("eastanatolia")
                .sendKeys(Keys.TAB).sendKeys("malatya").sendKeys(Keys.TAB).sendKeys("44000")
                .sendKeys(Keys.TAB).sendKeys("05555564565").perform();
    }
    @Given("Click {string}")
    public void click(String string) {
        automationExercisePage.createAccountButton.click();

    }
    @Then("Click {string} button")
    public void click_button(String string) {
        automationExercisePage.accountCreated.isDisplayed();

    }

    @Then("Click continue {string} button")
    public void click_continue_button(String string) {
        automationExercisePage.continueButton.click();

    }
    @Given("Verify that logged username {string} is visible")
    public void verify_that_logged_username_is_visible(String string) {
        automationExercisePage.loggedInAs.isDisplayed();

    }
    @Given("Click delete {string} button")
    public void click_delete_button(String string) {
        automationExercisePage.deleteAccount.click();

    }
    @Then("Verify that {string} is visible and click {string} button")
    public void verify_that_is_visible_and_click_button(String string, String string2) {
        automationExercisePage.deleteAccountVisible.isDisplayed();

    }

    @Given("Verify login to your account {string} is visible")
    public void verify_login_to_your_account_is_visible(String string) {
        automationExercisePage.loginToYourAccount.isDisplayed();
    }
    @Then("Enter correct email address and password")
    public void enter_correct_email_address_and_password() {
        automationExercisePage.loginEmailAdressBox.sendKeys(ConfigReader.getProperty("AutomationExerciseEmail"));
        automationExercisePage.loginPasswordAdressBox.sendKeys(ConfigReader.getProperty("AutomationExercisePassword"));

    }
    @Given("Click login {string} button")
    public void click_login_button(String string) {
        automationExercisePage.loginToYourAccountButton.click();

    }

    @Given("Enter incorrect email address and password")
    public void enter_incorrect_email_address_and_password() {
        automationExercisePage.loginEmailAdressBox.sendKeys(ConfigReader.getProperty("AutomationExerciseEmailIncorrect"));
        automationExercisePage.loginPasswordAdressBox.sendKeys(ConfigReader.getProperty("AutomationExercisePasswordIncorrect"));
    }
    @Then("Verify error {string} is visible")
    public void verify_error_is_visible(String string) {
        automationExercisePage.verifyErrorIsVisible.isDisplayed();

    }

    @Given("Click logout {string} button")
    public void click_logout_button(String string) {
        automationExercisePage.logoutButton.click();
    }
    @Then("Verify that user is navigated to login page")
    public void verify_that_user_is_navigated_to_login_page() {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("https://automationexercise.com/"));
    }

    @Given("Verify error email adress already exist {string} is visible")
    public void verify_error_email_adress_already_exist_is_visible(String string) {
        automationExercisePage.emailAddressAlreadyExist.isDisplayed();
    }

}
