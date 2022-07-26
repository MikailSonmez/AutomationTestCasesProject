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
import utilities.ReusableMethods;

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

    @Then("Click on contact us {string} button")
    public void click_on_contact_us_button(String string) {
        automationExercisePage.contactUsButton.click();

    }
    @Given("Verify get in touch {string} is visible")
    public void verify_get_in_touch_is_visible(String string) {
        automationExercisePage.getInTouchVisible.isDisplayed();

    }
    @Given("Enter name, email, subject and message")
    public void enter_name_email_subject_and_message() {
        automationExercisePage.getInTouchNameBox.click();
        actions.sendKeys("mikail").sendKeys(Keys.TAB)
                .sendKeys("asdas@gmail.com").sendKeys(Keys.TAB).sendKeys("Subject").sendKeys(Keys.TAB)
                .sendKeys("Another Life").perform();

    }
    @Then("Upload file")
    public void upload_file() {
        automationExercisePage.getInTouchChooseFile.sendKeys("C:/Users/mikai/Downloads/asdasdas.txt");


    }
    @Given("Click submit {string} button")
    public void click_submit_button(String string) {
        automationExercisePage.getInTouchSubmitButton.click();

    }
    @Given("Click OK button")
    public void click_ok_button() {
        driver.switchTo().alert().accept();

    }
    @Then("Verify success message {string} is visible")
    public void verify_success_message_is_visible(String string) {
        automationExercisePage.getInTouchSuccessVisible.isDisplayed();

    }
    @Then("Click {string} button and verify that landed to home page successfully")
    public void click_button_and_verify_that_landed_to_home_page_successfully(String string) {
        automationExercisePage.homeButton.click();
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("https://automationexercise.com/"));

    }

    @Then("Click on test cases {string} button")
    public void click_on_test_cases_button(String string) {
        automationExercisePage.testCasesButton.click();
    }
    @Then("Verify user is navigated to test cases page successfully")
    public void verify_user_is_navigated_to_test_cases_page_successfully() {
        automationExercisePage.testCasesText.isDisplayed();
    }

    @Then("Click on products {string} button")
    public void click_on_products_button(String string) {
        automationExercisePage.productsButton.click();

    }
    @Given("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verify_user_is_navigated_to_all_products_page_successfully() {
        automationExercisePage.specialOfferBigSaleImage.isDisplayed();
    }
    @Given("The products list is visible")
    public void the_products_list_is_visible() {
        automationExercisePage.allProductsText.isDisplayed();

    }
    @Then("Click on view product {string} of first product")
    public void click_on_view_product_of_first_product(String string) {
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).perform();
        automationExercisePage.productsViewFirstProduct.click();

    }
    @Given("User is landed to product detail page")
    public void user_is_landed_to_product_detail_page() {
        automationExercisePage.firstProductImage.isDisplayed();

    }
    @Then("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verify_that_detail_detail_is_visible_product_name_category_price_availability_condition_brand() {
        automationExercisePage.firstProductName.isDisplayed();
        automationExercisePage.firstProductCategory.isDisplayed();
        automationExercisePage.firstProductPrice.isDisplayed();
        automationExercisePage.firstProductavailability.isDisplayed();
        automationExercisePage.firstProductcondition.isDisplayed();
        automationExercisePage.firstProductbrand.isDisplayed();


    }

    @Given("Enter product name in search input and click search button")
    public void enter_product_name_in_search_input_and_click_search_button() {
        automationExercisePage.searchProductTextBox.sendKeys("blue");
        automationExercisePage.searchProductsTextBoxButton.click();
    }
    @Given("Verify searched products {string} is visible")
    public void verify_searched_products_is_visible(String string) {
        automationExercisePage.searchProductsTextVisible.isDisplayed();

    }
    @Then("Verify all the products related to search are visible")
    public void verify_all_the_products_related_to_search_are_visible() {
        automationExercisePage.blue.isDisplayed();

    }

    @Then("Scroll down to footer")
    public void scroll_down_to_footer() {
        ReusableMethods.scrollDown(driver);
    }
    @Given("Verify text subscription {string}")
    public void verify_text_subscription(String string) {
        automationExercisePage.subscriptionText.isDisplayed();
    }
    @Given("Enter email address in input and click arrow button")
    public void enter_email_address_in_input_and_click_arrow_button() {
        automationExercisePage.subscriptionYourEmailAddressTextBox.sendKeys("asdas@gmail.com");

    }
    @Then("Verify success message you have been successfully subscribed! {string} is visible")
    public void verify_success_message_you_have_been_successfully_subscribed_is_visible(String string) {
        automationExercisePage.subscriptionYouSuccessfullySubscribed.isDisplayed();
    }

    @Then("Click cart {string} button")
    public void click_cart_button(String string) {
        automationExercisePage.cartButton.click();
    }

}
