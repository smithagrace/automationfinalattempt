package DataProvider;

import org.testng.annotations.DataProvider;

public class CastAndCrewOnwardDP {




        @DataProvider(name = "OnwardPositive")
        public static Object[][] DataProviderOnwardP() {
            return new Object[][]{
                    {"OnwardPositive","Tom Holland", "Mychael Danna"}


            };
        }
        @DataProvider(name = "OnwardNegative")
        public static Object[][] DataProviderOnwardN() {
            return new Object[][]{

                    {"OnwardNegative","Tom Cruise","Michael Jackson"}

            };
        }
    }



