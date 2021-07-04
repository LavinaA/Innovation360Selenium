package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RequestFormPage {

    WebDriver driver;
    By name = By.xpath("//input[@formcontrolname='Name']");
    By emailId = By.xpath("//input[@formcontrolname='EmailId']");
    By organization = By.xpath("//input[@formcontrolname='Organization']");
    By calendar = By.xpath("//*[@class='calendar']");
    By allDaysContainer = By.xpath("//*[@class='btn-light ng-star-inserted']");
    By typeOfWorkshop = By.xpath("//*[@class='radioBtn']");
    By workShopDuration = By.xpath("//input[@formcontrolname='Duration']");
    By noOfParticipants = By.xpath("//input[@formcontrolname='NumberOfParticipants']");
    By problemStatement = By.xpath("//textarea[@formcontrolname='ProblemStatement']");
    By submit = By.xpath("//button[@type='submit']");
    By closeButton = By.xpath("//button[@type='button']");
    By requestFormHeader = By.xpath("//div[@class='formHeading popUpTitle pl-2 ml-1 pb-3']");


    public RequestFormPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement name() {
        return driver.findElement(name);
    }

    public WebElement emailId() {
        return driver.findElement(emailId);
    }

    public WebElement organization() {
        return driver.findElement(organization);
    }

    public WebElement calendar() {
        return driver.findElement(calendar);
    }

    public List<WebElement> allDaysContainer() {
        return driver.findElements(allDaysContainer);
    }

    public WebElement typeOfWorkshop() {
        return driver.findElement(typeOfWorkshop);
    }

    public WebElement workShopDuration() {
        return driver.findElement(workShopDuration);
    }

    public WebElement noOfParticipants() {
        return driver.findElement(noOfParticipants);
    }

    public WebElement problemStatement() {
        return driver.findElement(problemStatement);
    }

    public WebElement submit() {
        return driver.findElement(submit);
    }

    public WebElement closeButton() {
        return driver.findElement(closeButton);
    }

    public WebElement requestFormHeader() {
        return driver.findElement(requestFormHeader);
    }
}
