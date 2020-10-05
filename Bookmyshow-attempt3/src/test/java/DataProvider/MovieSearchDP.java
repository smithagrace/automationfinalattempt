package DataProvider;

import org.testng.annotations.DataProvider;

public class MovieSearchDP {




        @DataProvider(name = "MovieSearch")
        public static Object[][] DataProviderMovieSearch() {
            return new Object[][]{
                    {"Fantasy Island","Movie Search Test Pass"},
                    {"qq","Movie Search Test Fail"}
            };
        }

    }

