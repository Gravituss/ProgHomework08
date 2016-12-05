package ua.prog.kiev.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WeatherForecastSomeCityPage extends WeatherForecastMainPage {
    public WeatherForecastSomeCityPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = ".//nav[@class='tabs-outer']//h1")
    private WebElement cityHeader;

    public boolean cityIsRight(String city){
        return cityHeader.getText().contains(city);
    }




}
