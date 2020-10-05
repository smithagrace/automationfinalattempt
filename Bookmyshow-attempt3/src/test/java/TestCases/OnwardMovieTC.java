package TestCases;

import CommonElements.Driver;
import DataProvider.CastAndCrewOnwardDP;
import PageObject.MovieSearchPOM;
import PageObject.OnwardMoviePOM;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OnwardMovieTC extends Driver {
        @Test(dataProvider = "onward", dataProviderClass = CastAndCrewOnwardDP.class)
        public void SearchforCastandCrewPostiveScenario(String movie,String actor,String musician) throws InterruptedException {

            JavascriptExecutor js = (JavascriptExecutor) driver;
            OnwardMoviePOM onwardMoviesPage=new OnwardMoviePOM(driver);
            MovieSearchPOM movieSearch = new MovieSearchPOM(driver);
            movieSearch.EnterMovieName(movie);
            boolean flag2 =onwardMoviesPage.IsPersonPresent(actor);
            Assert.assertEquals(true,flag2);
            boolean flag3 =onwardMoviesPage.IsPersonPresent(musician);
            Assert.assertEquals(true,flag3);
            WebElement element=onwardMoviesPage.ElementFound();
            js.executeScript("arguments[0].scrollIntoView();", element);

        }
        @Test(dataProvider = "Onward", dataProviderClass = CastAndCrewOnwardDP.class)
        public void SearchforCastandCrewNegativeScenario(String movie,String actor,String musician) throws InterruptedException {
            MovieSearchPOM movieSearch = new MovieSearchPOM(driver);
            OnwardMoviePOM onwardMoviesPage=new OnwardMoviePOM(driver);
            movieSearch.EnterMovieName(movie);
            boolean flag2 =onwardMoviesPage.IsPersonPresent(actor);
            Assert.assertEquals(false,flag2);
            boolean flag3 =onwardMoviesPage.IsPersonPresent(musician);
            Assert.assertEquals(false,flag3);

        }
}
