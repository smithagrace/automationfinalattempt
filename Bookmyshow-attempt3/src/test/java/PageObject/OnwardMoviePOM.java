package PageObject;

import CommonElements.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnwardMoviePOM extends Driver {

        @FindBy(xpath = "//div[contains (text(),'CAST')]")
        private WebElement cast;

        public OnwardMoviePOM(WebDriver driver)
        {
            PageFactory.initElements(driver,this);
        }
        public boolean IsPersonPresent(String person){
            try {
                WebElement m1=driver.findElement(By.xpath("//div[@content='"+person+"']"));
                return m1.isDisplayed();
                // return true;
            }
            catch (Exception e){
                return false;
            }
        }
        public WebElement ElementFound(){
            return cast;

        }

    }
