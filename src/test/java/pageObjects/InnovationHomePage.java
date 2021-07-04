package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InnovationHomePage {

    WebDriver driver;
    By startContinueButton = By.xpath("//*[text()='START / CONTINUE']");
    By ourOfferings = By.xpath("(//*[@class='headerMenu'])[2]");
    By ourServices = By.xpath("(//*[@class='headerMenu'])[3]");
    By trending = By.xpath("(//*[@class='headerMenu'])[4]");


    public InnovationHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement startContinueButton() {
        return driver.findElement(startContinueButton);
    }
    public WebElement ourOfferings() {
        return driver.findElement(ourOfferings);
    }
    public WebElement ourServices() {
        return driver.findElement(ourServices);
    }
    public WebElement trending() {
        return driver.findElement(trending);
    }

}
