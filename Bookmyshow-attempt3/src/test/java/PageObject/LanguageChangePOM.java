package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LanguageChangePOM {
        @FindBy(xpath = "//a[@onclick='BMS.Header.switchLangDropDown();']")
        private WebElement lang;
        public LanguageChangePOM(WebDriver driver) {

            PageFactory.initElements(driver, this);
        }
        public void langButtonClick() {
            lang.click();
        }

    }


