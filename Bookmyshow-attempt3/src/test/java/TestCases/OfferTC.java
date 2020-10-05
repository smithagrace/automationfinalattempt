package TestCases;

import CommonElements.Driver;
import PageObject.OfferPOM;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OfferTC extends Driver {
        @Test
        //  Check Offers(Reward Points Redemption/Payback Points/Simple Click SBI Card Redemption)
        public void CheckOffers() {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            OfferPOM offer = new OfferPOM(driver);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            offer.ClickOffer();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            offer.ClickRewards();
            boolean flag=offer.RewardsPresent();
            Assert.assertEquals(true,flag);
            WebElement element=offer.ElementFound();
            js.executeScript("arguments[0].scrollIntoView();", element);

        }
}
