package TestCases;

import CommonElements.Driver;
import DataProvider.DiscountOfferDP;
import PageObject.ICICIDiscountPOM;
import PageObject.OfferPOM;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ICICIBankTC extends Driver {

        @Test(dataProvider = "reduction", dataProviderClass = DiscountOfferDP.class)
        public void SearchOffersPositiveScenario(String s1) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            OfferPOM Offer = new OfferPOM(driver);
            Offer.ClickOffer();
            ICICIDiscountPOM ICICIDiscount=new ICICIDiscountPOM(driver);
            ICICIDiscount.InputSearchBoxPlusEnter(s1);
            boolean flag=ICICIDiscount.IsICICIOfferPresent();
            Assert.assertEquals(true,flag);
            WebElement element=ICICIDiscount.Element();
            js.executeScript("arguments[0].scrollIntoView();", element);

        }
        @Test(dataProvider = "Kotak Mahindra Offer", dataProviderClass = DiscountOfferDP.class)
        public void SearchOffersNegativeScenario(String s1) {
            OfferPOM Offer = new OfferPOM(driver);
            Offer.ClickOffer();
            ICICIDiscountPOM ICICIDiscount =new ICICIDiscountPOM(driver);
           ICICIDiscount.InputSearchBox(s1);
            boolean flag=ICICIDiscount.IsKotakMahidraOfferPresent();
            Assert.assertEquals(true,flag);
        }
        }

