package TestCases;

import CommonElements.Driver;
import DataProvider.ChangeCityDP;
import PageObject.ChangeCityPOM;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ChangeLocationTC extends Driver {
        @Test(dataProvider = "CityChange", dataProviderClass = ChangeCityDP.class)
        public void ChooseCity(String City) {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            ChangeCityPOM changeCityGoa=new ChangeCityPOM(driver);
            changeCityGoa.ClickCity();
            changeCityGoa.InputCityName(City);
        }
}

