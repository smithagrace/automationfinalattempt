package PageObject;

import CommonElements.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OfferPOM extends Driver {
        @FindBy(xpath = "//a[contains (text(),'Offers')]")
        private WebElement Offer;

        @FindBy(xpath = "//li[@data-id='rewards']")
        private WebElement Reward;
        @FindBy(xpath = "//h4[contains (text(),'Reward Points Redemption')]")
        private WebElement RewardPointRedemption;
        @FindBy(xpath = "//h4[contains (text(),'PAYBACK POINTS')]")
        private WebElement PaybackPoints;
        @FindBy(xpath = "//h4[contains (text(),'SimplyCLICK SBI Card Rewards Offer')]")
        private WebElement SimplyClickSBICardRewardsOffers;


        @FindBy(xpath = "//button[@class='No thanks']")
        private WebElement NotNow;
        @FindBy(xpath = "//span[@class='__dismiss icon-cancel']")
        private WebElement Cross;


        public OfferPOM(WebDriver driver) { PageFactory.initElements(driver, this); }

        public void ClickOffer() {
            Offer.click();
        }

        public void ClickRewards() {
            Reward.click();
        }

        public WebElement ElementFound(){
            return Reward;

        }
        public boolean RewardsPresent() {

            if (RewardPointRedemption.isDisplayed() &&
                    PaybackPoints.isDisplayed() &&
                    SimplyClickSBICardRewardsOffers.isDisplayed()) {

                return RewardPointRedemption.isDisplayed();
            }
            else{
                return false;
            }
        }
}
