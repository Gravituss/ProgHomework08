package ua.prog.kiev.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class WeatherForecastMainPage extends BasePage {
    public WeatherForecastMainPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = ".//input[@id='location']")
    private WebElement searchField;

    public void typeCity(String cityName){
        searchField.sendKeys(cityName);
    }
    public void selectFirstCity(){
        searchField.sendKeys(Keys.ARROW_DOWN);
        searchField.sendKeys(Keys.RETURN);
    }
}
