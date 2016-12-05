package ua.prog.kiev.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


//public class AmazonMain extends BasePage {
//    public AmazonMain (WebDriver driver) {
//        super(driver);
//        PageFactory.initElements(driver, this);
//    }
//
//    @FindBy(id = "twotabsearchtextbox")
//    private WebElement searchField;
//    @FindBy(xpath = "//input[@type='submit']")
//    private WebElement searchBtn;
//    @FindBy(css = "h2.a-size-medium.a-color-null")
//    public List<WebElement> searchResults;
//    private final String pageTitle
//            = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
//    private final String pageUrl = "https://www.amazon.com/";
//
//    public void searchGood (String good) {
//        searchField.sendKeys(good);
//        searchBtn.click();
//    }
//}
