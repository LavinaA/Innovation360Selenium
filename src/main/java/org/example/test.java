package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class test {

        public static void main(String[] args) throws InterruptedException {

                System.setProperty("webdriver.chrome.driver","C:\\Users\\lavina.vijay.agrawal\\chromedriver.exe");

                ChromeOptions options = new ChromeOptions();
                options.addArguments("--incognito");
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability(ChromeOptions.CAPABILITY, options);
                options.merge(capabilities);

                WebDriver driver = new ChromeDriver(options);
                driver.get("https://innovation360.ciostage.accenture.com/home");



                driver.findElement(By.xpath("//*[text()='START / CONTINUE']")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//*[@class='headerContent clientButton']")).click();
                //driver.findElement(By.xpath("//div[@class='headericon']")).click();
                Thread.sleep(3000);
                driver.findElement(By.xpath("//*[@class='cardContainer']")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//input[@formcontrolname='Name']")).sendKeys("Lavina Agrawal");
                Thread.sleep(2000);
                driver.findElement(By.xpath("//input[@formcontrolname='EmailId']")).sendKeys("lavina.vijay.agrawal@accenture.com");
                Thread.sleep(2000);
                driver.findElement(By.xpath("//input[@formcontrolname='Organization']")).sendKeys("Accenture");
                //driver.findElement(By.xpath("//input[@formcontrolname='DateOfWorkshop']")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//*[@class='calendar']")).click();

               int count= driver.findElements(By.xpath("//*[@class='btn-light ng-star-inserted']")).size();
                System.out.println(count);


               // String text =driver.findElements(By.xpath("//*[@class='btn-light ng-star-inserted']")).get(5).getText();
                //System.out.println(text);

                for(int i =0;i<count;i++){
                        String text =driver.findElements(By.xpath("//*[@class='btn-light ng-star-inserted']")).get(i).getText();
                        if(text.equalsIgnoreCase("23")){
                                driver.findElements(By.xpath("//*[@class='btn-light ng-star-inserted']")).get(i).click();
                                break;
                        }
                }

                //Enter type of workshop
                driver.findElement(By.xpath("//*[@class='radioBtn']")).click();

                //Enter no of
                driver.findElement(By.xpath("//input[@formcontrolname='Duration']")).sendKeys("7");
                driver.findElement(By.xpath("//input[@formcontrolname='NumberOfParticipants']")).sendKeys("5");
                driver.findElement(By.xpath("//textarea[@formcontrolname='ProblemStatement']")).sendKeys("Workshop for Innovation 360");
                driver.findElement(By.xpath("//button[@type='submit']")).click();
                Thread.sleep(3000);
                driver.findElement(By.xpath("//button[@type='button']")).click();
               driver.findElement(By.xpath("//div[@class='headericon']")).click();
                //driver.findElement(By.xpath("//*[@class='headerMenu']")).click();

                driver.findElement(By.xpath("(//*[@class='headerMenu'])[2]")).click();
                driver.findElement(By.xpath("(//*[@class='headerMenu'])[3]")).click();






        }


}
