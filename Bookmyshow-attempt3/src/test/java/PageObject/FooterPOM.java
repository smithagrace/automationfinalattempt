package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterPOM {
        @FindBy(xpath = "//h4[contains (text(), 'BOOKMYSHOW APP ')]")
        private WebElement BookmyshowApp;
        @FindBy(xpath = "//h4[contains (text(), 'BOOKMYSHOW NEWS')]")
        private WebElement BookmyshowNews;
        @FindBy(xpath = "//h4[contains (text(), 'EXCLUSIVES')]")
        private WebElement Exclusive;
        @FindBy(xpath = "//h4[contains (text(), 'HELP')]")
        private WebElement Help;

        public FooterPOM(WebDriver driver)
        { PageFactory.initElements(driver,this);}
        public boolean Footer(){
            return BookmyshowApp.isDisplayed() && BookmyshowNews.isDisplayed() && Exclusive.isDisplayed() && Help.isDisplayed();
        }
    }

