package TestCases;

import CommonElements.Driver;
import PageObject.ListYourShowHostPOM;
import PageObject.ListYourShowPOM;
import PageObject.ListYourShowServicesPOM;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ListYourShowTC extends Driver {

        @Test(priority = 0)
        public void ListYourShowWhatcanyouHost() {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            ListYourShowPOM ListYourShow= new ListYourShowPOM(driver);
            ListYourShow.ListYourShowEnterAndClick();
            ListYourShowHostPOM ListYourShowHost = new ListYourShowHostPOM(driver);
            boolean flag1 = ListYourShowHost.WhatCanYouHostList();
            Assert.assertEquals(true, flag1);
            WebElement element=ListYourShowHost.ElementFoundInList();
            js.executeScript("arguments[0].scrollIntoView();", element);
        }
        @Test(priority = 1)
        //   List Your Show-What are the services we offer?
        public void ListYourShowWhataretheServicesWeOffer() {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            ListYourShowPOM listurshow = new ListYourShowPOM(driver);
            listurshow.ListYourShowEnterAndClick();
            ListYourShowServicesPOM listurshowpageservices= new ListYourShowServicesPOM(driver);
            boolean flag2 = listurshowpageservices.theServicesWeOffer();
            Assert.assertEquals(true, flag2);
            WebElement element=listurshowpageservices.ElementsFound();
            js.executeScript("arguments[0].scrollIntoView();", element);
        }
        @Test(priority = 2)
        //List Your Show-Reports & Business insights details
        public void ListYourShowReports_BusinessInsightsDetails() {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            ListYourShowPOM listurshow = new ListYourShowPOM(driver);
            listurshow.ListYourShowEnterAndClick();
            ListYourShowServicesPOM listurshowpageservices= new ListYourShowServicesPOM(driver);
            listurshowpageservices.ReportBusinessInsightsClick();
            WebElement element= listurshowpageservices.ElementFoundInClickReportInsight();
            js.executeScript("arguments[0].scrollIntoView();", element);


        }

    }
