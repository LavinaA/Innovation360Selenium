package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookAnInnovationTrackRequest {

    WebDriver driver;
    By bookAnInnovationExperienceButton = By.xpath("//*[@class='cardContainer']");
    By accentureLogoClick = By.xpath("//div[@class='headericon']");

    public BookAnInnovationTrackRequest(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement bookAnInnovationExperinceButton() {
        return driver.findElement(bookAnInnovationExperienceButton);
    }

    public WebElement accentureLogoClick() {
        return driver.findElement(accentureLogoClick);
    }

}
