package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercisePage {

    public AutomationExercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement signupLoginButton;

    @FindBy(xpath= "//h2[contains(text(), 'New User Signup!')]")
    public WebElement newUserSignup;

    @FindBy(xpath= "//input[@type='text']")
    public WebElement newUserNameTextBox;

    @FindBy(xpath= "(//input[@type='email'])[2]")
    public WebElement newUserEmailTextBox;

    @FindBy(xpath= "(//button[@type='submit'])[2]")
    public WebElement newUserSignUpButton;

    @FindBy(xpath= "(//h2[@class='title text-center'])[1]")
    public WebElement enterAccountInformation;

    @FindBy(xpath= "//input[@id='id_gender1']")
    public WebElement titleMr;

    @FindBy(xpath= "//input[@data-qa='first_name']")
    public WebElement firstNameBox;

    @FindBy(xpath= "//option[@value='Singapore']")
    public WebElement singapore;

    @FindBy(xpath= "(//button[@type='submit'])[1]")
    public WebElement createAccountButton;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement accountCreated;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement continueButton;

    @FindBy(xpath= "//a[text()=' Logged in as ']")
    public WebElement loggedInAs;

    @FindBy(xpath= "(//a[@style='color:brown;'])[2]")
    public WebElement deleteAccount;

    @FindBy(xpath = "//div[@class='page-header']")
    public WebElement deleteAccountVisible;

    @FindBy(xpath = "//h2[text()='Login to your account']")
    public WebElement loginToYourAccount;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement loginEmailAdressBox;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement loginPasswordAdressBox;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    public WebElement loginToYourAccountButton;

    @FindBy(xpath = "//p[@style='color: red;']")
    public WebElement verifyErrorIsVisible;

    @FindBy(xpath = "(//a[@style='color:brown;'])[1]")
    public WebElement logoutButton;

    @FindBy(xpath = "//p[contains(text(), 'Email Address already exist!')]")
    public WebElement emailAddressAlreadyExist;

    @FindBy(xpath = "//a[text()=' Contact us']")
    public WebElement contactUsButton;

    @FindBy(xpath = "//h2[text()='Get In Touch']")
    public WebElement getInTouchVisible;

    @FindBy(xpath = "//*[@id=\"contact-us-form\"]/div[1]/input")
    public WebElement getInTouchNameBox;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a")
    public WebElement getInTouchChooseFile;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement getInTouchSubmitButton;

    @FindBy(xpath = "//*[@id=\"contact-page\"]/div[2]/div[1]/div/div[2]")
    public WebElement getInTouchSuccessVisible;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a")
    public WebElement homeButton;


    // (css = "[onclick=\"addElement()\"]") with css like that





}
