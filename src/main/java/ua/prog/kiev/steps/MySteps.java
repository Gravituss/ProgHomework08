package ua.prog.kiev.steps;

import junit.framework.Assert;
import org.jbehave.core.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import ua.prog.kiev.pages.WeatherForecastMainPage;
import ua.prog.kiev.pages.WeatherForecastSomeCityPage;


import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertTrue;

public class MySteps {
    WebDriver driver;
    WeatherForecastMainPage weatherForecastMain;
    WeatherForecastSomeCityPage weatherForecastSomeCity;

    @Given("$browser started")
    public void startDriver (String browser) {
        System.setProperty("webdriver.gecko.driver", "C:\\Temp\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Temp\\chromedriver.exe");
        if (browser.equals("firefox")) driver = new FirefoxDriver();
        if (browser.equals("chrome")) driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("proceed to $url")
    public void goToPage (String url) {
        driver.get(url);
        weatherForecastMain = PageFactory.initElements(driver, WeatherForecastMainPage.class);
    }

    @When("type the $city")
    public void typeCityStep (String city) {
        weatherForecastMain.typeCity(city);
    }

    @Then("open the first element in the list")
    public void checkFirstElement () {
        weatherForecastMain.selectFirstCity();
        weatherForecastSomeCity = PageFactory.initElements(driver, WeatherForecastSomeCityPage.class);
        assertTrue(weatherForecastSomeCity.cityIsRight());
    }

    @Then("quit driver")
    @Alias("русский текст")
    public void driverQuit () {
        driver.quit();
    }
}
