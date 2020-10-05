package PageObject;

import CommonElements.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChangeCityPOM extends Driver {
    @FindBy(xpath = "//li[@class='secondary-menu location-container']")
    private WebElement City;
    @FindBy(xpath = "//input[@id='inp_RegionSearch_top']")
    private WebElement CitySearchOption;



    public ChangeCityPOM(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void ClickCity(){
        City.click();
    }
    public void InputCityName(String city){
        CitySearchOption.sendKeys(city);
        CitySearchOption.sendKeys(Keys.ENTER);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='secondary-menu location-container']")));

    }
}

