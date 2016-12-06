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

    public WebElement getCentigradeBtn() {
        return centigradeBtn;
    }

    @FindBy(xpath = ".//*[@class='units-cont']//*[@class='units metric']")
    private WebElement centigradeBtn;

    public WebElement getFarenheitBtn() {
        return farenheitBtn;
    }

    @FindBy(xpath = ".//*[@class='units-cont']//*[@class='units imperial active']")
    private WebElement farenheitBtn;

    public WebElement getTempHighTxt() {
        return tempHighTxt;
    }

    @FindBy(xpath = ".//tr[@class='max-temp-row']//td[1]//span")
    private WebElement tempHighTxt;


    public WebElement getTempLowTxt() {
        return tempLowTxt;
    }

    @FindBy(xpath = ".//tr[@class='min-temp-row']//td[1]//span")
    private WebElement tempLowTxt;

    public boolean cityIsCorrect(String city){
        return cityHeader.getText().contains(city);
    }

}
