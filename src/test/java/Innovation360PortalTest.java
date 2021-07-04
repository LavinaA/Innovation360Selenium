import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pageObjects.BookAnInnovationTrackRequest;
import pageObjects.InnovationHomePage;
import pageObjects.LoginPage;
import pageObjects.RequestFormPage;
import resources.Base;
import util.Constants;

import java.io.IOException;

public class Innovation360PortalTest extends Base {

    public WebDriver driver;

    @BeforeMethod
    public void initialize() throws IOException {
        driver = initializeDriver();
    }

    @AfterMethod
    public void closeBrowser(){
        driver.close();
        driver = null;
    }

    @Test
    public void testFormSubmission() throws InterruptedException {
        clickStartContinueButton();
        clickClientButton();
        clickBookAnInnovationTrackRequestButton();
        submitFormPage();
        clickAccentureLogo();
        navigateHomePageMenu();
    }

    @Test
    public void testFormText() throws InterruptedException {
        clickStartContinueButton();
        clickClientButton();
        clickBookAnInnovationTrackRequestButton();
        assertFormHeaderText("Request");
    }

    private void assertFormHeaderText(String headerText) {
        RequestFormPage requestFormPage = new RequestFormPage(driver);
        String formHeaderText = requestFormPage.requestFormHeader().getText();
        Assert.assertEquals(headerText,formHeaderText.trim());
    }

    private void clickAccentureLogo() throws InterruptedException {
        BookAnInnovationTrackRequest bookAnInnovationTrackRequest = new BookAnInnovationTrackRequest(driver);
        bookAnInnovationTrackRequest.accentureLogoClick().click();
        Thread.sleep(3000);
    }

    private void navigateHomePageMenu() throws InterruptedException {
        InnovationHomePage innovationHomePage = new InnovationHomePage(driver);
        innovationHomePage.ourOfferings().click();
        Thread.sleep(3000);
        innovationHomePage.ourServices().click();
        Thread.sleep(3000);
        innovationHomePage.trending().click();
        Thread.sleep(3000);
    }

    private void submitFormPage() throws InterruptedException {
        RequestFormPage requestFormPage = new RequestFormPage(driver);
        requestFormPage.name().sendKeys("Lavina Agrawal");
        Thread.sleep(2000);
        requestFormPage.emailId().sendKeys("lavina.vijay.agrawal@accenture.com");
        Thread.sleep(2000);
        requestFormPage.organization().sendKeys("Accenture");
        Thread.sleep(2000);
        requestFormPage.calendar().click();
        int count = requestFormPage.allDaysContainer().size();
        for(int i =0;i<count;i++){
            String text =requestFormPage.allDaysContainer().get(i).getText();
            if(text.equalsIgnoreCase("23")){
                requestFormPage.allDaysContainer().get(i).click();
                break;
            }
        }
        requestFormPage.typeOfWorkshop().click();
        Thread.sleep(2000);
        requestFormPage.workShopDuration().sendKeys("5");
        Thread.sleep(2000);
        requestFormPage.noOfParticipants().sendKeys("5");
        Thread.sleep(2000);
        requestFormPage.problemStatement().sendKeys("Workshop related to Selenium Automation");
        Thread.sleep(2000);
        requestFormPage.submit().click();
        Thread.sleep(4000);
        requestFormPage.closeButton().click();
    }

    private void clickBookAnInnovationTrackRequestButton() throws InterruptedException {
        BookAnInnovationTrackRequest trackRequest = new BookAnInnovationTrackRequest(driver);
        trackRequest.bookAnInnovationExperinceButton().click();
        Thread.sleep(4000);

    }

    private void clickClientButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clientButton().click();
        Thread.sleep(2000);
    }

    private void clickStartContinueButton() throws InterruptedException {
        InnovationHomePage innovationHomePage = new InnovationHomePage(driver);
        innovationHomePage.startContinueButton().click();
        Thread.sleep(2000);
    }


}
