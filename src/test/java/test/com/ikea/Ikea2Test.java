/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com.ikea;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author deepa
 */
public class Ikea2Test {

    private WebDriver driver;
    private String baseUrl;

    public Ikea2Test() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--window-size=1920,1080");
        options.addArguments("--disable-gpu");
        options.addArguments("--disable-extensions");
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("--proxy-server='direct://'");
        options.addArguments("--proxy-bypass-list=*");
        options.addArguments("--start-maximized");
        options.addArguments("--headless");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        driver.close();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testIkea2() throws Exception {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://www.ikea.com/us/en/?ref=gwp-start");
        driver.manage().window().maximize(); //maximize window

        driver.findElement(By.xpath("/html/body/div[10]/div/div[2]/button/span")).click();

        driver.findElement(By.linkText("Products")).click();

        driver.findElement(By.linkText("Lighting")).click();
        driver.findElement(By.linkText("LED Light bulbs")).click();

        // This  will scroll down the page by  1500 pixel vertical		
        js.executeScript("window.scrollBy(0,1500)");
         Thread.sleep(2000);

        driver.findElement(By.xpath("//img[@alt='RYET LED bulb E26 470 lumen, globe clear']")).click();
        js.executeScript("window.scrollBy(0,1500)");
        driver.findElement(By.className("range-revamp-btn__label")).click();
       // js.executeScript("window.scrollBy(0,1500)");
     Thread.sleep(2000);
        //driver.findElement(By.linkText("Continue to bag")).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
       
        WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Continue to bag")));
        // Write code here that turns the phrase above into concrete actions
        ele.click();

        // This  will scroll down the page by  200 pixel vertical		
        js.executeScript("window.scrollBy(0,200)");

        driver.findElement(By.cssSelector("div.shoppingbag__sidebar > div.checkout__wrapper > button.cart-ingka-jumbo-btn.cart-ingka-jumbo-btn--emphasised.checkoutButton__default > span.cart-ingka-jumbo-btn__inner > span.cart-ingka-jumbo-btn__icon > svg.cart-ingka-svg-icon")).click();
        driver.findElement(By.xpath("//main[@id='one-checkout']/div[2]/div/div/div/div[2]/div/button/span")).click();
    }

}
