package DataProvider;

import org.testng.annotations.DataProvider;

public class DiscountOfferDP {

     @DataProvider(name = "ICICI")
        public static Object[][] DataProviderICICIOffer() {
            return new Object[][]{
                    {"ICICI Bank 25% offer"},

            };
        }
        @DataProvider(name = "Kotak Mahindra")
        public static Object[][] DataProviderKotakMahindraOffer() {
            return new Object[][]{

                    {"Kotak Mahindra Offer Not Applicable"}
            };
        }
    }

