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
public class Ikea3Test {

    private WebDriver driver;
    private String baseUrl;

    public Ikea3Test() {
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
        // driver.close();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testIkea3() throws Exception {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://www.ikea.com/us/en/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[10]/div/div[2]/button/span")).click();

        // Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Rooms")));
        // Write code here that turns the phrase above into concrete actions
        ele.click();
        // driver.findElement(By.linkText("Rooms")).click();
        driver.findElement(By.xpath("//img[@alt='Living room']")).click();
        driver.findElement(By.xpath("//img[@alt='Armchairs & chaises']")).click();
        driver.findElement(By.xpath("//img[@alt='Lounge chairs']")).click();
        driver.findElement(By.xpath("//button[3]/span")).click();
        driver.findElement(By.id("gray")).click();
        driver.findElement(By.xpath("//div[4]/div/div/button/span")).click();
        js.executeScript("window.scrollBy(0,1500)");
        driver.findElement(By.xpath("//button[4]")).click();
        js.executeScript("window.scrollBy(0,1500)");

        driver.findElement(By.xpath("//div[@id='SEC_filter-PRICE']/label[2]/div/span")).click();
//        js.executeScript("window.scrollBy(0,1500)");

        driver.findElement(By.xpath("//div[4]/div/div/button/span")).click();
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,200)");

//        System.out.println("Scrolled down.."); 
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div[3]/div/div/div[4]/div/div[2]/div[2]/div/a/div/span[2]/img")).click();
        js.executeScript("window.scrollBy(0,100)");

//        driver.findElement(By.className("range-revamp-aspect-ratio-image__image")).click();
        driver.findElement(By.className("range-revamp-btn__inner")).click();
        js.executeScript("window.scrollBy(0,200)");

//        driver.findElement(By.xpath("//main[@id='content']/div/div/div/div[2]/div[3]/div/div[3]/div/div/button/span/span")).click();
       
     wait = new WebDriverWait(driver, 30);
         ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Continue to bag")));
        // Write code here that turns the phrase above into concrete actions
        ele.click();
        
//driver.findElement(By.linkText("Continue to bag")).click();

        js.executeScript("window.scrollBy(0,200)");

        driver.findElement(By.cssSelector("div.shoppingbag__sidebar > div.checkout__wrapper > button.cart-ingka-jumbo-btn.cart-ingka-jumbo-btn--emphasised.checkoutButton__default > span.cart-ingka-jumbo-btn__inner > span.cart-ingka-jumbo-btn__icon > svg.cart-ingka-svg-icon")).click();
        driver.findElement(By.xpath("//main[@id='one-checkout']/div[2]/div/div/div/div[2]/div/button/span")).click();

    }

}
