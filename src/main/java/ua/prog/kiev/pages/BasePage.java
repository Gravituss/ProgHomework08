package ua.prog.kiev.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    private WebDriver driver;

    public BasePage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


}
