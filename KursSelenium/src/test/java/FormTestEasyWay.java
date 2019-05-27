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

import static org.junit.Assert.assertEquals;

public class FormTestEasyWay {

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
    public void shouldFillTheForm() {

        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");

        WebElement firstName = driver.findElement(By.id("first-name"));
        String name = firstName.getAttribute("name");
        String inputValue = "Karol";
        workWithWebElement(firstName, name, inputValue);

        driver.findElement(By.id("last-name")).sendKeys("Kowalski");

        List<WebElement> radioButtons = driver.findElements(By.cssSelector(".radio-inline"));
        radioButtons.get(0).click();

        for (WebElement element : radioButtons) {
            if (element.getText().equals("Male")) {
                element.click();
            }
        }

        driver.findElement(By.id("dob")).sendKeys("06/06/2018");
        driver.findElement(By.id("address")).click();
        driver.findElement(By.id("address")).sendKeys("Prosta 51");
        driver.findElement(By.id("email")).sendKeys("karol.kowalski@mailinator.com");
        driver.findElement(By.id("password")).sendKeys("pass123asdasd");
        driver.findElement(By.id("company")).sendKeys("Coderslab");

        Select roleDropDown = new Select(driver.findElement(By.name("role")));
        roleDropDown.selectByVisibleText("Manager");

        Select jobExpectations = new Select(driver.findElement(By.name("expectation")));
        jobExpectations.selectByVisibleText("Good teamwork");

        driver.findElement(By.xpath("//label[text() = 'Read books']")).click();

        driver.findElement(By.id("submit")).click();

        assertEquals("Successfully submitted!", driver.findElement(By.id("submit-msg")).getText());
    }

    private void workWithWebElement(WebElement firstName, String name, String inputValue) {
        if (firstName.isDisplayed()) {
            firstName.sendKeys(inputValue);
            System.out.println(name + ":" + inputValue);
        }
    }

    @Test
    public void checkErrors() {
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
        driver.findElement(By.id("submit")).click();

        List<String> listOfIds = getLIstOfIds();
        int counter = 0;

        for (String elementLocator : listOfIds) {
            elementLocator = elementLocator + "-error";
            assertEquals("This field is required.", driver.findElement(By.id(elementLocator)).getText());
            counter++;
        }

        System.out.println(counter);

    }

    private List<String> getLIstOfIds() {
        List<String> listId = new ArrayList<>();
        listId.add("first-name");
        listId.add("last-name");
        listId.add("gender");
        listId.add("dob");
        listId.add("address");
        listId.add("email");
        listId.add("password");
        listId.add("company");
        return listId;
    }
}