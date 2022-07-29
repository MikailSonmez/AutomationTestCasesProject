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

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")
    public WebElement testCasesButton;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div[1]/div/h2/b")
    public WebElement testCasesText;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")
    public WebElement productsButton;

    @FindBy(xpath = "//*[@id=\"sale_image\"]")
    public WebElement specialOfferBigSaleImage;

    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/h2")
    public WebElement allProductsText;

    @FindBy(xpath = "(//a[@style='color: brown;'])[1]")
    public WebElement productsViewFirstProduct;

    @FindBy(xpath = "/html/body/section/div/div/div[2]/div[2]/div[1]/div/img")
    public WebElement firstProductImage;

    @FindBy(xpath = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/h2")
    public WebElement firstProductName;

    @FindBy(xpath = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[1]")
    public WebElement firstProductCategory;

    @FindBy(xpath = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/span")
    public WebElement firstProductPrice;

    @FindBy(xpath = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[2]/b")
    public WebElement firstProductavailability;

    @FindBy(xpath = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[3]/b")
    public WebElement firstProductcondition;

    @FindBy(xpath = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[4]/b")
    public WebElement firstProductbrand;

    @FindBy(xpath = "//*[@id=\"search_product\"]")
    public WebElement searchProductTextBox;

    @FindBy(xpath = "//*[@id=\"submit_search\"]")
    public WebElement searchProductsTextBoxButton;

    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/h2")
    public WebElement searchProductsTextVisible;

    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div")
    public WebElement searchProductsFeatures;

    @FindBy(xpath = "//*[@id=\"footer\"]/div[1]/div/div/div[2]/div/h2")
    public WebElement subscriptionText;

    @FindBy(xpath = "//*[@id=\"susbscribe_email\"]")
    public WebElement subscriptionYourEmailAddressTextBox;

    @FindBy(xpath = "//*[@id=\"success-subscribe\"]/div")
    public WebElement subscriptionYouSuccessfullySubscribed;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")
    public WebElement cartButton;

    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/img")
    public WebElement firstProductImageAllProducts;

    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/a")
    public WebElement firstProductAddToCart;

    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[1]/img")
    public WebElement secondProductImage;

    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[1]/a")
    public WebElement secondProductAddToCart;

    @FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[3]/button")
    public WebElement continueShopping;

    @FindBy(xpath = "//*[@id=\"product-1\"]/td[2]")
    public WebElement cartVerifyFirstProduct;

    @FindBy(xpath = "//*[@id=\"product-1\"]/td[3]")
    public WebElement cartVerifyFirstProductPrice;

    @FindBy(xpath = "//*[@id=\"product-1\"]/td[4]")
    public WebElement cartVerifyFirstProductQuantity;

    @FindBy(xpath = "//*[@id=\"product-1\"]/td[5]")
    public WebElement cartVerifyFirstProductTotalPrice;

    @FindBy(xpath = "//*[@id=\"product-2\"]/td[2]")
    public WebElement cartVerifySecondProduct;

    @FindBy(xpath = "//*[@id=\"product-2\"]/td[3]")
    public WebElement cartVerifySecondProductPrice;

    @FindBy(xpath = "//*[@id=\"product-1\"]/td[4]")
    public WebElement cartVerifySecondProductQuantity;

    @FindBy(xpath = "//*[@id=\"product-2\"]/td[5]")
    public WebElement cartVerifySecondProductTotalPrice;

    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div[1]/div[4]/div/div[2]/ul/li/a")
    public WebElement homePageThirdProductViewProduct;

    @FindBy(xpath = "/html/body/section/div/div/div[2]/div[2]/div[2]/div")
    public WebElement thirdProductDetailsVerify;

    @FindBy(xpath = "//*[@id=\"quantity\"]")
    public WebElement thirdProductIncreaseQuantity;

    @FindBy(xpath = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")
    public WebElement thirdProductAddToCart;

    @FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u")
    public WebElement productViewCart;

    @FindBy(xpath = "//*[@id=\"product-3\"]/td[4]/button")
    public WebElement thirdProductQuantityVerify;

    @FindBy(xpath = "//*[@id=\"cart_items\"]/div/div[1]/ol/li[2]")
    public WebElement cartPageVisibleShoppingCart;

    @FindBy(xpath = "//*[@id=\"do_action\"]/div[1]/div/div/a\n")
    public WebElement cartPageProceedToCheckout;

    @FindBy(xpath = "//*[@id=\"checkoutModal\"]/div/div/div[2]/p[2]/a/u")
    public WebElement cartPageRegisterLogin;

    @FindBy(xpath = "//*[@id=\"address_delivery\"]")
    public WebElement cartPageYourDeliveryAddress;

    @FindBy(xpath = "//*[@id=\"address_invoice\"]")
    public WebElement cartPageYourBillingAddress;

    @FindBy(xpath = "//*[@id=\"ordermsg\"]/textarea")
    public WebElement cartPageCommentText;

    @FindBy(xpath = "//*[@id=\"cart_items\"]/div/div[7]/a")
    public WebElement cartPageCommentTextPlaceOrder;

    @FindBy(xpath = "//*[@id=\"payment-form\"]/div[1]/div/input")
    public WebElement cartPageEnterPaymentDetailsNameOnCard;

    @FindBy(xpath = "//*[@id=\"submit\"]")
    public WebElement cartPagePayAndConfirmOrder;

    @FindBy(xpath = "//*[@id=\"success_message\"]/div")
    public WebElement cartPageVerifyOrderPlacedSuccessfully;

    @FindBy(xpath = "//*[@id=\"product-2\"]/td[6]/a")
    public WebElement cartPageSecondProductXButton;

    @FindBy(xpath = "//*[@id=\"empty_cart\"]/p/b")
    public WebElement cartPageVerifyProductRemovedFromCart;

    @FindBy(xpath = "/html/body/section[2]/div/div/div[1]/div/h2")
    public WebElement categoryHomePageVisible;

    @FindBy(xpath = "//*[@id=\"accordian\"]/div[1]/div[1]/h4/a")
    public WebElement categoryWomen;

    @FindBy(xpath = "//*[@id=\"Women\"]/div/ul/li[1]/a")
    public WebElement categoryHomePageWomenDress;

    @FindBy(xpath = "/html/body/section/div/div[2]/div[2]/div/h2")
    public WebElement categoryWomenTopsProductsVisible;

    @FindBy(xpath = "//*[@id=\"accordian\"]/div[2]/div[1]/h4/a")
    public WebElement categoryMen;

    @FindBy(xpath = "//*[@id=\"Men\"]/div/ul/li[2]/a")
    public WebElement categoryMenJeans;

    @FindBy(xpath = "/html/body/section/div/div[2]/div[2]/div/h2")
    public WebElement categoryMenJeansProductsVisible;

    @FindBy(xpath = "/html/body/section[2]/div/div/div[1]/div/div[2]/h2")
    public WebElement brandsVisible;

    @FindBy(xpath = "/html/body/section/div/div[2]/div[2]/div")
    public WebElement brandsPolo;

    @FindBy(xpath = "/html/body/section/div/div[2]/div[2]/div/h2/text()")
    public WebElement brandPoloProductsVisible;

    @FindBy(xpath = "/html/body/section[2]/div/div/div[1]/div/div[2]/div/ul/li[2]/a")
    public WebElement brandsHM;

    @FindBy(xpath = "/html/body/section/div/div[2]/div[2]/div")
    public WebElement brandHMProductsVisible;

    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/a")
    public WebElement productsBlueProduct1;

    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[1]/a")
    public WebElement productsBlueProduct2;

    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[4]/div/div[1]/div[1]/a")
    public WebElement productsBlueProduct3;

    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[5]/div/div[1]/div[1]/a")
    public WebElement productsBlueProduct4;

    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[6]/div/div[1]/div[1]/a")
    public WebElement productsBlueProduct5;

    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[7]/div/div[1]/div[1]/a")
    public WebElement productsBlueProduct6;

    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[8]/div/div[1]/div[1]/a")
    public WebElement productsBlueProduct7;

    @FindBy(xpath = "//*[@id=\"product-1\"]")
    public WebElement productsBlueProduct1Visible;

    @FindBy(xpath = "//*[@id=\"product-16\"]")
    public WebElement productsBlueProduct2Visible;

    @FindBy(xpath = "//*[@id=\"product-21\"]")
    public WebElement productsBlueProduct3Visible;

    @FindBy(xpath = "//*[@id=\"product-24\"]")
    public WebElement productsBlueProduct4Visible;

    @FindBy(xpath = "//*[@id=\"product-37\"]")
    public WebElement productsBlueProduct5Visible;

    @FindBy(xpath = "//*[@id=\"product-41\"]")
    public WebElement productsBlueProduct6Visible;

    @FindBy(xpath = "//*[@id=\"product-41\"]")
    public WebElement productsBlueProduct7Visible;

    @FindBy(xpath = "//*[@id=\"name\"]")
    public WebElement productsReviewName;

    @FindBy(xpath = "//*[@id=\"button-review\"]")
    public WebElement productReviewSubmitButton;

    @FindBy(xpath = "//*[@id=\"review-section\"]/div/div/span")
    public WebElement productReviewThankyouforReview;

    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div[2]/h2")
    public WebElement verifyRecommendedItemsVisible;

    @FindBy(xpath = "//*[@id=\"recommended-item-carousel\"]/div/div[2]/div[1]/div/div/div/a")
    public WebElement addToCartRecommendedProduct;

    @FindBy(xpath = "//*[@id=\"product-4\"]")
    public WebElement verifyProductDisplayCartPage;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/a")
    public WebElement orderPlacedDownloadInvoice;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div/a")
    public WebElement orderPlaceContinue;

    @FindBy(xpath = "//*[@id=\"slider-carousel\"]/div/div[2]/div[1]/h2")
    public WebElement homepageFullFledgedAutomationEngineersText;


    // (css = "[onclick=\"addElement()\"]") with css like that





}
