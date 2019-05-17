import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SearchTest {

    private WebDriver driver;

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
    public void searchTest() {
        driver.get("http://www.google.com");
        WebElement input = driver.findElement(By.name("q"));
        input.sendKeys("Testowanie Selenium");
        input.submit();

        String title = driver.getTitle();
        System.out.println(title);

        assertEquals("Testowanie Selenium - Szukaj w Google", title);
    }

    @Test
    public void checkErrors() {
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
        driver.findElement(By.id("submit")).click();

//        List<String> listOfIds = getListOfIds();
        List<String> listOfIds = Arrays.asList("first-name", "last-name", "gender");
        int counter = 0;

        for (String elementLocator : listOfIds) {
            elementLocator = elementLocator + "-error";
            assertEquals("This field is required.", driver.findElement(By.id(elementLocator)).getText());
            counter++;
        }
        System.out.println(counter);

    }

}
//    private List<String> getListOfIds() {
//        List<String> listId = new ArrayList<>();
//        listId.add("first-name");
//        listId.add("last-name");
//        listId.add("gender");
//        return listId;
//    }

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
