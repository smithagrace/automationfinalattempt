package PageObject;

import CommonElements.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MovieSearchPOM extends Driver {

        @FindBy(name = "inputSearchBox")
        private WebElement Movie;
        @FindBy(id = "eventTitle")
        private WebElement IsMoviePresent;
        @FindBy(xpath = "//button[@class='No thanks']")
        private WebElement NotNow;

        public MovieSearchPOM(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }

        public void EnterMovieName(String m1) throws InterruptedException {
            Movie.sendKeys(m1);
            Thread.sleep(4000);
            Movie.sendKeys(Keys.ENTER);
        }
        public boolean IsMoviePresent() {
            {
                try {
                    return IsMoviePresent.isDisplayed();
                } catch (Exception e) {
                    return false;
                }
            }

        }

    }
