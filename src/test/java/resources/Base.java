package resources;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import util.Constants;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base {

    public static WebDriver driver;
    public Properties prop;

    public WebDriver initializeDriver() throws IOException {
        loadProperties();
        setSystemProperties();

        ChromeOptions options = getChromeOptions();
        driver = new ChromeDriver(options);
        driver.get(prop.getProperty(Constants.BASE_URL));

        return driver;
    }

    private void setSystemProperties() {
        System.setProperty(prop.getProperty(Constants.DRIVER), prop.getProperty(Constants.CHROME_DRIVER_PATH));
    }

    private ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(capabilities);
        return options;
    }

    private void loadProperties() throws IOException {
        prop=new Properties();
        FileInputStream fis=new FileInputStream("C:\\Users\\lavina.vijay.agrawal\\eclipse-workspace\\Innovation360AutomationFramework\\src\\test\\java\\resources\\data.properties");
        prop.load(fis);
    }

    public static void getScreenshots(String result) throws IOException{
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String filePath = "C:\\Users\\lavina.vijay.agrawal\\eclipse-workspace\\Innovation360AutomationFramework\\target\\"+result+"screens.png";
        System.out.println("*************************8");
        System.out.println(filePath);
        FileUtils.copyFile(src,new File(filePath));
    }
}
