package PageObject;

import CommonElements.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListYourShowHostPOM extends Driver {

        @FindBy(xpath = "//div[contains (text(),'Online Streaming')]")
        private WebElement OnlineStreming;
        @FindBy(xpath = "//div[contains (text(),'Performances')]")
        private WebElement Performances;
        @FindBy(xpath = "//div[contains (text(),'Experiences')]")
        private WebElement Experiences;
        @FindBy(xpath = "//div[contains (text(),'Expositions')]")
        private WebElement Expositions;
        @FindBy(xpath = "//div[contains (text(),'Parties')]")
        private WebElement Parties;
        @FindBy(xpath = "//div[contains (text(),'Sports')]")
        private WebElement Sports;
        @FindBy(xpath = "//div[contains (text(),'Conferences')]")
        private WebElement Conferences;
        @FindBy(xpath = "//div[@class='__head']/h3")
        private WebElement Title;

        public ListYourShowHostPOM(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }
        public boolean WhatCanYouHostList() {
            return Title.isDisplayed() && OnlineStreming.isDisplayed() &&
                    Performances.isDisplayed() &&
                    Experiences.isDisplayed() &&
                    Expositions.isDisplayed() &&
                    Parties.isDisplayed() &&
                    Sports.isDisplayed() &&
                    Conferences.isDisplayed();

        }
        public WebElement ElementFoundInList(){
            return Performances;

        }
    }
