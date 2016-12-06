package ua.prog.kiev.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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

    @FindBy(xpath = ".//*[@class='units-cont']//*[contains(@class,'metric')]")
    private WebElement centigradeBtn;

    public WebElement getFarenheitBtn() {
        return farenheitBtn;
    }

    @FindBy(xpath = ".//*[@class='units-cont']//*[contains(@class,'imperial')]")
    private WebElement farenheitBtn;

    public List<WebElement> getTempHighTxtList() {
        return tempHighTxtList;
    }

    @FindBy(xpath = ".//tr[@class='max-temp-row']//td[1]//span")
    private List<WebElement> tempHighTxtList;


    public List<WebElement> getTempLowTxtList() {
        return tempLowTxtList;
    }

    @FindBy(xpath = ".//tr[@class='min-temp-row']//td[1]//span")
    private List<WebElement> tempLowTxtList;

    public boolean cityIsCorrect(String city){
        return cityHeader.getText().contains(city);
    }

}
