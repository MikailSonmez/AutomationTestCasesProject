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
import org.openqa.selenium.support.ui.Wait;
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
    @Then("Verify that delete {string} is visible and click {string} button")
    public void verify_that_delete_is_visible_and_click_button(String string, String string2) {
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

    @Given("Hover over first product and click {string}")
    public void hover_over_first_product_and_click(String string) {
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        actions.moveToElement(automationExercisePage.firstProductImageAllProducts).perform();
        automationExercisePage.firstProductAddToCart.click();
    }
    @Given("Click continue shopping {string} button")
    public void click_continue_shopping_button(String string) {
        automationExercisePage.continueShopping.click();

    }
    @Then("Hover over second product and click {string}")
    public void hover_over_second_product_and_click(String string) {
        actions.moveToElement(automationExercisePage.secondProductImage).perform();
        automationExercisePage.secondProductAddToCart.click();
    }
    @Given("Click view cart 'View Cart' button")
    public void click_view_cart_view_cart_button() {
        automationExercisePage.cartButton.click();

    }
    @Given("Verify both products are added to Cart")
    public void verify_both_products_are_added_to_cart() {
        automationExercisePage.cartVerifyFirstProduct.isDisplayed();
        automationExercisePage.cartVerifySecondProduct.isDisplayed();

    }
    @Then("Verify their prices, quantity and total price")
    public void verify_their_prices_quantity_and_total_price() {
        automationExercisePage.cartVerifyFirstProductPrice.isEnabled();
        automationExercisePage.cartVerifyFirstProductQuantity.isEnabled();
        automationExercisePage.cartVerifyFirstProductTotalPrice.isEnabled();

        automationExercisePage.cartVerifySecondProductPrice.isEnabled();
        automationExercisePage.cartVerifySecondProductQuantity.isEnabled();
        automationExercisePage.cartVerifySecondProductTotalPrice.isEnabled();

    }

    @Then("Click view product {string} for any product on home page")
    public void click_view_product_for_any_product_on_home_page(String string) {
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        automationExercisePage.homePageThirdProductViewProduct.click();
    }
    @Given("Verify product detail is opened")
    public void verify_product_detail_is_opened() {
        automationExercisePage.thirdProductDetailsVerify.isDisplayed();

    }
    @Given("Increase quantity to {int}")
    public void increase_quantity_to(Integer int1) {
        automationExercisePage.thirdProductIncreaseQuantity.sendKeys("4");

    }
    @Then("Click add to cart {string} button")
    public void click_add_to_cart_button(String string) {
        automationExercisePage.thirdProductAddToCart.click();

    }
    @Given("Click view cart add to cart 'View Cart' button")
    public void click_view_cart_add_to_cart_view_cart_button() {
        automationExercisePage.thirdProductViewCart.click();

    }
    @Then("Verify that product is displayed in cart page with exact quantity")
    public void verify_that_product_is_displayed_in_cart_page_with_exact_quantity() {
        String actualQuatity=automationExercisePage.thirdProductQuantityVerify.getText();
        Assert.assertTrue(actualQuatity.contains("41"));
    }

    @Then("Add products to cart")
    public void add_products_to_cart() {
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        actions.moveToElement(automationExercisePage.secondProductImage).perform();
        automationExercisePage.secondProductAddToCart.click();
        automationExercisePage.continueShopping.click();
        actions.sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP)
                .sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).perform();


    }
    @Given("Verify that cart page is displayed")
    public void verify_that_cart_page_is_displayed() {
        automationExercisePage.cartPageVisibleShoppingCart.isDisplayed();

    }
    @Then("Click proceed to checkout {string} button")
    public void click_proceed_to_checkout_button(String string) {
        automationExercisePage.cartPageProceedToCheckout.click();

    }
    @Given("Click on signup Login cart page {string} button")
    public void click_on_signup_login_cart_page_button(String string) {
        automationExercisePage.cartPageRegisterLogin.click();
    }

    @Given("Fill all details in Signup and create account")
    public void fill_all_details_in_signup_and_create_account() {
        automationExercisePage.newUserNameTextBox.sendKeys("aliasd");
        automationExercisePage.newUserEmailTextBox.sendKeys("asdasdasf@gmail.com");
        automationExercisePage.newUserSignUpButton.click();

        automationExercisePage.titleMr.click();
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("Mikail44584458").sendKeys(Keys.TAB)
                .click().sendKeys("17").sendKeys(Keys.TAB).click().sendKeys("September")
                .click().sendKeys(Keys.TAB).click().sendKeys("2005").click().perform();

        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                        .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                        .perform();


        automationExercisePage.firstNameBox.sendKeys("mikail");
        actions.sendKeys(Keys.TAB)
                .sendKeys("donmez").sendKeys(Keys.TAB).sendKeys("linkedIn").sendKeys(Keys.TAB)
                .sendKeys("yesiltepe").sendKeys(Keys.TAB).sendKeys(Keys.TAB).click()
                .moveToElement(automationExercisePage.singapore).click().sendKeys(Keys.TAB).sendKeys("eastanatolia")
                .sendKeys(Keys.TAB).sendKeys("malatya").sendKeys(Keys.TAB).sendKeys("44000")
                .sendKeys(Keys.TAB).sendKeys("05555564565").perform();

        automationExercisePage.createAccountButton.click();
    }

    @Given("Verify Address Details and Review Your Order")
    public void verify_address_details_and_review_your_order() {
        String deliveryAddressText = automationExercisePage.cartPageYourDeliveryAddress.getText();
        String billingAddressText = automationExercisePage.cartPageYourBillingAddress.getText();
        Assert.assertEquals(deliveryAddressText,billingAddressText);
    }
    @Given("Enter description in comment text area and click place order {string}")
    public void enter_description_in_comment_text_area_and_click_place_order(String string) {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        automationExercisePage.cartPageCommentText.sendKeys("so good!");
        automationExercisePage.cartPageCommentTextPlaceOrder.click();
    }
    @Then("Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void enter_payment_details_name_on_card_card_number_cvc_expiration_date() {
        automationExercisePage.cartPageEnterPaymentDetailsNameOnCard.sendKeys("ali");
        actions.sendKeys(Keys.TAB).sendKeys("12312312312312").sendKeys(Keys.TAB)
                .sendKeys("153").sendKeys(Keys.TAB).sendKeys("30").sendKeys(Keys.TAB)
                .sendKeys("2150").perform();
    }
    @Given("Click pay and confirm order 'Pay and Confirm Order' button")
    public void click_pay_and_confirm_order_pay_and_confirm_order_button() {
        automationExercisePage.cartPagePayAndConfirmOrder.click();

    }
    @Then("Verify success message your order has been placed successfully! {string}")
    public void verify_success_message_your_order_has_been_placed_successfully(String string) {
        automationExercisePage.cartPageVerifyOrderPlacedSuccessfully.isDisplayed();
    }

    @Given("Fill email, password and click login {string} button")
    public void fill_email_password_and_click_login_button(String string) {
        automationExercisePage.loginEmailAdressBox.sendKeys(ConfigReader.getProperty("AutomationExerciseEmail"));
        automationExercisePage.loginPasswordAdressBox.sendKeys(ConfigReader.getProperty("AutomationExercisePassword"));

        automationExercisePage.loginToYourAccountButton.click();

    }
    @Given("Click pay and confirm order {string} button")
    public void click_pay_and_confirm_order_button(String string) {
        automationExercisePage.cartPagePayAndConfirmOrder.click();

    }


}
