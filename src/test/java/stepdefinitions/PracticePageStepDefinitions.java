package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.PracticePagee;
import utilities.ConfigReader;
import utilities.Driver;

public class PracticePageStepDefinitions {

    PracticePagee practicePage = new PracticePagee();

    @Given("Open the URL Practice Page Site")
    public void open_the_url_practice_page_site() {
        Driver.getDriver().get(ConfigReader.getProperty("PracticePageUrl"));
    }

    @And("Open Shop Menu")
    public void open_shop_menu() {
        practicePage.ShopMenu.click();
    }

    @Then("Now click on Home menu button")
    public void now_click_on_home_menu_button() {
        practicePage.Home.click();
    }

    @And("Test whether the Home page has Three Sliders only")
    public void test_whether_the_home_page_has_three_sliders_only() {
        Assert.assertTrue(practicePage.Slide1.isDisplayed());
        Assert.assertTrue(practicePage.Slide2.isDisplayed());
        Assert.assertTrue(practicePage.Slide3.isDisplayed());
    }

    @Then("The Home page must contains only three sliders")
    public void the_home_page_must_contains_only_three_sliders() {

    }
}


