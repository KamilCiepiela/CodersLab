import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class CheckAllLinks {

    private WebDriver driver;
    String url = "https://men-men-s-01.codersguru.pl";

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Kamil/Desktop/Tester_Automatyczny/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void linksTest() {
        driver.get(url);
        List<String> list = asList("/", "/#how-it-works", "/cennik", "/login", "/regulations");

        for (String x : list) {
            clickLinkAndTest(x);
            Assert.assertEquals(url + x, clickLinkAndTest(x));

        }
    }

    private String clickLinkAndTest (String name){
        WebElement element = driver.findElement(By.xpath("//a[@href= '" + name + "']"));
        String attribute = element.getAttribute("href");
        element.click();
        System.out.println("Sprawdzono: " + attribute);
        return attribute;
    }

    @Test
    public void codersLabLinkTest() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get(url);
        driver.findElement(By.xpath("//a[@href = 'https://coderslab.pl/pl']")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        String parentWindow = driver.getWindowHandle();
        for (String childWindow : windowHandles) {
            if (!childWindow.equalsIgnoreCase(parentWindow)) {
                driver.switchTo().window(childWindow);
            }
        }
        wait.ignoring(WebDriverException.class).until(ExpectedConditions.elementToBeClickable(By.cssSelector(".leadsPopup__icon"))).click();
        assertEquals("Coders Lab - IT School", driver.getTitle());
    }

    @Test
    public void facebookLinkTest() {
        driver.get(url);
        driver.findElement(By.xpath("//a[@href = 'https://www.facebook.com/codersguru/']")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        String parentWindow = driver.getWindowHandle();
        for (String childWindow : windowHandles) {
            if (!childWindow.equalsIgnoreCase(parentWindow)) {
                driver.switchTo().window(childWindow);
            }
        }
        assertEquals("Facebook", driver.getTitle());
    }

    @Test
    public void createAccount() {
        driver.get(url);
        driver.findElement(By.cssSelector(".main-page-top__email-input-sent")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        String parentWindow = driver.getWindowHandle();
        for (String childWindow : windowHandles) {
            if (!childWindow.equalsIgnoreCase(parentWindow)) {
                driver.switchTo().window(childWindow);
            }
        }
        assertEquals("Zarejestruj się", driver.findElement(By.cssSelector(".registration__header.header")).getText());
    }

//    @Test
//    public void newTabTest() {
//        driver.get(url);
//        assertMainPage();
//        ArrayList<String> newTab = new ArrayList<>(driver.getWindowHandles()); // New list size = new tabs
//        newTab.add("https://docs.google.com/forms/d/e/1FAIpQLSdkSQerDu-SpOquMbNiCMjHFzGAF735jX2R8OIBcnlT_uN0_A/viewform");
//        newTab.add("https://men-men-s-01.codersguru.pl/mailto:kontakt@codersguru.pl");
//        newTab.add("https://www.facebook.com/codersguru/");
//        newTab.add("https://coderslab.pl/pl");
//        // Considering that there is only one tab opened in that point.
//        String mainPage = driver.getWindowHandle();
//        driver.findElement(By.xpath("//a[@href= '" + newTab + "']")).click();
//        newTab.remove(mainPage);
//        // change focus to new tab
//        driver.switchTo().window(newTab.get(0)); // Switch to new tab
//        System.out.println(newTab); // Do what you want here, you are in the new tab
//        driver.close();
//        // change focus back to old tab
//        driver.switchTo().window(mainPage);
//        assertMainPage();
//
//        // Do what you want here, you are in the old tab
//
//        //Mentor - nie robić
//        //https://docs.google.com/forms/d/e/1FAIpQLSdkSQerDu-SpOquMbNiCMjHFzGAF735jX2R8OIBcnlT_uN0_A/viewform
//
//        //Kontakt - nie robić
//        // mailto:kontakt@codersguru.pl
}