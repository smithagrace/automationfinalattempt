package PageObject;

import CommonElements.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListYourShowPOM extends Driver {
    @FindBy(xpath="//li[@class='secondary-menu']/a")
    private WebElement listYourShow;

    public ListYourShowPOM(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    public  void ListYourShowEnterAndClick(){
        listYourShow.click();
    }

}
