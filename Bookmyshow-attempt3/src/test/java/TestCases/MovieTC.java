package TestCases;

import CommonElements.Driver;
import DataProvider.MovieSearchDP;
import PageObject.MovieSearchPOM;
import PageObject.OnwardMoviePOM;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MovieTC extends Driver {

        @Test(dataProvider = "moviesearch", dataProviderClass = MovieSearchDP.class)
        public void SearchMovieScenario(String movie,String expected) throws InterruptedException {

            MovieSearchPOM movieSearch = new MovieSearchPOM(driver);
            OnwardMoviePOM onwardMoviesPage=new OnwardMoviePOM(driver);
            movieSearch.EnterMovieName(movie);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            boolean presentmovie = movieSearch.IsMoviePresent();
            Assert.assertEquals(expected == "pass",presentmovie);

        }
}
