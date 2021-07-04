package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;
    By clientButton = By.xpath("//*[@class='headerContent clientButton']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement clientButton() {
        return driver.findElement(clientButton);
    }

}
