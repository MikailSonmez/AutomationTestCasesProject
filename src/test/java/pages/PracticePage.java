package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PracticePage {

    public PracticePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "menu-item-40")
    public WebElement ShopMenu;

    @FindBy(xpath = "//a[text()=\"Home\"]")
    public WebElement Home;

    @FindBy(className = "n2-ss-slider-1 n2-grab")
    public WebElement Slide1;

    @FindBy(className = "n2-ss-slider-2")
    public WebElement Slide2;

    @FindBy(className = "n2-ss-slider-3")
    public WebElement Slide3;

}
