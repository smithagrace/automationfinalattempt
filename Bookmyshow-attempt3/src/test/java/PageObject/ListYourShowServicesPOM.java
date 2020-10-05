package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListYourShowServicesPOM {
        @FindBy(xpath = "//div[contains (text(),'Online Sales & Marketing')]")
        private WebElement OnlineSalesAndMarketing;
        @FindBy(xpath = "//div[contains (text(),'Pricing')]")
        private WebElement Pricing;
        @FindBy(xpath = "//div[contains (text(),'Food & beverages, stalls and the works!')]")
        private WebElement FoodAndBeverageStallsAndTheWorks;
        @FindBy(xpath = "//div[contains (text(),'On ground support  & gate entry management')]")
        private WebElement OnGroundSupportAndEntryManagement;
        @FindBy(xpath = "//div[contains (text(),'Reports & business insights')]")
        private WebElement ReportsAndBusinessInsights;
        @FindBy(xpath = "//div[contains (text(),'POS, RFID, Turnstiles & more...')]")
        private WebElement POSRFIDTurnstilesAndMore;
        @FindBy(xpath = "//div[contains (text(),'In depth reports')]")
        private WebElement IndepthReports;
        @FindBy(xpath = "//div[contains (text(),'Access registration data')]")
        private WebElement AccessRegistrationData;
        @FindBy(xpath = "//div[contains (text(),'behavioural insights')]")
        private WebElement behaviouralinsights;


        public ListYourShowServicesPOM(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }

        public boolean theServicesWeOffer() {
            return OnlineSalesAndMarketing.isDisplayed() &&
                    Pricing.isDisplayed() &&
                    FoodAndBeverageStallsAndTheWorks.isDisplayed() &&
                    OnGroundSupportAndEntryManagement.isDisplayed() &&
                    ReportsAndBusinessInsights.isDisplayed() &&
                    POSRFIDTurnstilesAndMore.isDisplayed();
        }
        public WebElement ElementsFound() {
            return Pricing;

        }
        public WebElement ElementFoundInClickReportInsight() {
            return IndepthReports;

        }
        public void ReportBusinessInsightsClick() {
            ReportsAndBusinessInsights.click();
            // WebDriverWait wait = new WebDriverWait(driver,10);
        }
        public boolean contentPresentInReportBusinessInsightsClick() {
            if (IndepthReports.isDisplayed() &&
                    AccessRegistrationData.isDisplayed() &&
                    behaviouralinsights.isDisplayed()) {

                return IndepthReports.isDisplayed();
            }
            else{
                return false;
            }
        }

    }
