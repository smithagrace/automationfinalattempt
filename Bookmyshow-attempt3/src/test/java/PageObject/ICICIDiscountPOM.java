package PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ICICIDiscountPOM {
        @FindBy(xpath = "//input[@type='text' and @placeholder='Search for Offers by Name or Bank']")
        private WebElement SearchBox;
        @FindBy(xpath = "//aside[@id='ICICICC520']")
        private WebElement Discount;
        @FindBy(xpath = "//div[@class='wrapper']//div")
        private WebElement DiscountNotPresent;

        public ICICIDiscountPOM(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }

        public void InputSearchBoxPlusEnter(String s1) {
            SearchBox.sendKeys(s1);
            SearchBox.sendKeys(Keys.ENTER);
        }
        public void InputSearchBox(String s1) {
            SearchBox.sendKeys(s1);
        }
        public boolean IsICICIOfferPresent(){
            try {
                return Discount.isDisplayed();
            } catch (Exception e) {
                return false;
            }
        }
        public boolean IsKotakMahidraOfferPresent(){
            try {
                return DiscountNotPresent.isDisplayed();
            } catch (Exception e) {
                return false;
            }
        }
        public WebElement Element(){
            return Discount;
        }
    }

