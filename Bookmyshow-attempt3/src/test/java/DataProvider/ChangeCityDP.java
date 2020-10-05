package DataProvider;

import org.testng.annotations.DataProvider;

public class ChangeCityDP {
        @DataProvider(name = "citychange")
        public static Object[][] dataprovidercity() {
            return new Object[][]{
                    {"Goa"}
            };
        }
    }

