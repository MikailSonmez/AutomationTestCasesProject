package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercisePage {

    public AutomationExercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signupLogin;

    @FindBy(xpath= "//h2[contains(text(), 'New User Signup!')]")
    public WebElement newUserSignup;

    @FindBy(xpath= "//input[@type='text']")
    public WebElement newUserNameTextBox;

    @FindBy(xpath= "(//input[@type='email'])[2]")
    public WebElement newUserEmailTextBox;

    @FindBy(xpath= "(//button[@type='submit'])[2]")
    public WebElement signUpButton;

    @FindBy(xpath= "(//h2[@class='title text-center'])[1]")
    public WebElement enterAccountInformation;

    @FindBy(xpath= "//input[@id='id_gender1']")
    public WebElement titleMr;




}
