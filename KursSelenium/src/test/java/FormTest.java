import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FormTest {

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
    public void fillTest() {
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
        driver.findElement(By.id("first-name")).sendKeys("Karol");
        driver.findElement(By.id("last-name")).sendKeys("Kowalski");

        List<WebElement> elements = driver.findElements(By.cssSelector(".radio-inline"));
        System.out.println(elements.get(0).getText());
        System.out.println(elements.get(1).getText());
        System.out.println(elements.get(2).getText());

        for (WebElement element : elements) {
            if (element.getText().equals ("Male")) {
                element. click();
                break;
            }

        }

        driver.findElement(By.id("dob")).sendKeys("05/22/2010");
        driver.findElement(By.id("address")).sendKeys("Prosta 51");
        driver.findElement(By.id("email")).sendKeys("karol.kowalski@mailinator.com");
        driver.findElement(By.id("password")).sendKeys("Pass123");
        driver.findElement(By.id("company")).sendKeys("Coders Lab");
        Select roleDropDown = new Select(driver.findElement(By.id("role")));
        roleDropDown.selectByVisibleText("Manager");

        Select expectationDropDown = new Select(driver.findElement(By.id("expectation")));
        expectationDropDown.selectByVisibleText("Good teamwork");

        driver.findElement(By.xpath("//label[text() = 'Read books']")).click();
        driver.findElement(By.xpath("//label[text() = 'Take online courses']")).click();

        driver.findElement(By.id("comment")).sendKeys("To jest mój pierwszy automat testowy");

        driver.findElement(By.id("submit")).click();

        String result = driver.findElement(By.id("submit-msg")).getText();

        assertEquals("Successfully submitted!", result);


    }

    @Test
    public void chechErrors() {
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
        driver.findElement(By.id("submit")).click();

    }

    private List<String> getListOfIds() {
        List<String> listId = new ArrayList<>();
        listId.add("first-name");
        listId.add("last-name");
        listId.add("first-name");
        return listId;
    }


}
