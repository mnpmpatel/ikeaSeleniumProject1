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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Mahendra
 */
public class Ikea1Test {

    private WebDriver driver;
    private String baseUrl;

    public Ikea1Test() {
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
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test

    public void testIkea1() throws Exception {
        driver.get("https://www.ikea.com/us/en/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//li[4]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"loyalty-modal-content\"]/div/div/div[3]/ul/li[1]/a")).click();
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("akmselenium@gmail.com");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("ITExps123");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/form/button[1]")).click();
//        driver.findElement(By.linkText("Deals")).click();
//        driver.findElement(By.linkText("New Lower Price")).click();
//        driver.findElement(By.xpath("//*[@id=\"pub__carousel__3b021400-926b-11eb-8481-63ca1ec8fd8a\"]/div[3]/div/div/div/a")).click();
//        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/div[3]/div/div[1]")).click();
//        driver.findElement(By.className("range-revamp-btn__inner")).click();
    }
    
   // @Test
    public void testIkea2() throws Exception {
        driver.get("https://www.ikea.com/us/en/?ref=gwp-start");
        driver.manage().window().maximize(); //maximize window
        driver.findElement(By.linkText("Products")).click();
        driver.findElement(By.linkText("Lighting")).click();
        driver.findElement(By.linkText("LED Light bulbs")).click();
        driver.findElement(By.xpath("//img[@alt='RYET LED bulb E26 470 lumen, globe clear']")).click();
        driver.findElement(By.className("range-revamp-btn__label")).click();
        driver.findElement(By.linkText("Continue to bag")).click();
        driver.findElement(By.cssSelector("div.shoppingbag__sidebar > div.checkout__wrapper > button.cart-ingka-jumbo-btn.cart-ingka-jumbo-btn--emphasised.checkoutButton__default > span.cart-ingka-jumbo-btn__inner > span.cart-ingka-jumbo-btn__icon > svg.cart-ingka-svg-icon")).click();
        driver.findElement(By.xpath("//main[@id='one-checkout']/div[2]/div/div/div/div[2]/div/button/span")).click();

//        driver.findElement(By.id("zipcode")).click();
//        driver.findElement(By.id("zipcode")).clear();
//        driver.findElement(By.id("zipcode")).sendKeys("60192");
//        driver.findElement(By.xpath("//div[@id='active-checkout-step']/div/form/div[2]/button/span/span")).click();
//        driver.findElement(By.id("taskrabbit-late-capture__checkbox")).click();
//        driver.findElement(By.xpath("//div[@id='REGULAR']/div/div/div/div/div[3]/button/span")).click();
//        driver.findElement(By.xpath("//div[@id='active-checkout-step']/div[6]/button/span/span")).click();
//        driver.findElement(By.xpath("//div[@id='active-checkout-step']/form/div[4]/div[2]/button/span/span")).click();
    }
  
   // @Test
    public void testIkea3() throws Exception {
        driver.get("https://www.ikea.com/us/en/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Rooms")).click();
        driver.findElement(By.xpath("//img[@alt='Living room']")).click();
        driver.findElement(By.xpath("//img[@alt='Armchairs & chaises']")).click();
        driver.findElement(By.xpath("//img[@alt='Lounge chairs']")).click();
        driver.findElement(By.xpath("//button[3]/span")).click();
        driver.findElement(By.id("gray")).click();
        driver.findElement(By.xpath("//div[4]/div/div/button/span")).click();
        driver.findElement(By.xpath("//button[4]")).click();
        driver.findElement(By.xpath("//div[@id='SEC_filter-PRICE']/label[2]/div/span")).click();
        driver.findElement(By.xpath("//div[4]/div/div/button/span")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div[3]/div/div/div[4]/div/div[2]/div[2]/div/a/div/span[2]/img")).click();
        driver.findElement(By.xpath("//main[@id='content']/div/div/div/div[2]/div[3]/div/div[3]/div/div/button/span/span")).click();
        driver.findElement(By.linkText("Continue to bag")).click();
        driver.findElement(By.cssSelector("div.shoppingbag__sidebar > div.checkout__wrapper > button.cart-ingka-jumbo-btn.cart-ingka-jumbo-btn--emphasised.checkoutButton__default > span.cart-ingka-jumbo-btn__inner > span.cart-ingka-jumbo-btn__icon > svg.cart-ingka-svg-icon")).click();
        driver.findElement(By.xpath("//main[@id='one-checkout']/div[2]/div/div/div/div[2]/div/button/span")).click();

    }

}
