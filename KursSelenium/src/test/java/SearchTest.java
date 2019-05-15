import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class SearchTest {

    private WebDriver driver;

    @Before
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "/home/kamil/Pulpit/Tester_Automatyczny/03_Repos/KursSelenium/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void searchTest1() {
        driver.get("https://www.google.pl");
        WebElement input = driver.findElement(By.name("q"));
        input.sendKeys("Testowanie Selenium");
        input.submit();

        String title = driver.getTitle();
        System.out.println(title);

        assertEquals("Testowanie Selenium - Szukaj w Google", title);
    }

    @Test
    public void searchTest2() {
        driver.get("https://www.bing.com");
            WebElement input = driver.findElement(By.name("q"));
            input.sendKeys("Mistrzostwa Świata w piłce nożnej 2018");
            input.submit();

            String title = driver.getTitle();
            System.out.println(title);

            assertEquals("Mistrzostwa Świata w piłce nożnej 2018 - Bing", title);
    }

//    @Test
//    public void searchTest3() {
//        driver.get("https://www.google.pl");
//        WebElement input = driver.findElement(By.id("am-b0"));
//        input.sendKeys("Testowanie Selenium");
//        input.submit();
//
//        String id = driver.get("am-b0");
//        System.out.println(id);
//
//        assertEquals("am-b0", id);
    }