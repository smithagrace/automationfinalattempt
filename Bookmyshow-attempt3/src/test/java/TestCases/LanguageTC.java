package TestCases;

import CommonElements.Driver;
import PageObject.LanguageChangePOM;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LanguageTC extends Driver{

        @Test
        public void SelectLanguage() {
            LanguageChangePOM languageChange = new LanguageChangePOM(driver);
            languageChange.langButtonClick();
            int count = driver.findElements(By.xpath("//div[@class='lang-select']//li")).size();
            Assert.assertEquals(7, count);
        }
    }
