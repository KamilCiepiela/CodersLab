import com.google.common.base.Verify;
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

public class FormTest {

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
        String name1 = firstName.getAttribute("name");
        String inputFirstNameValue = "Karol";
        workWithWebElement(firstName, name1, inputFirstNameValue);
//        driver.findElement(By.id("submit")).click();
//        Verify.verify(driver.findElement(By.id("submit-msg")).getText().equals("Successfully submitted!"), )
//        }


        WebElement lastName = driver.findElement(By.id("last-name"));
        String name2 = lastName.getAttribute("name");
        String inputLastNameValue = "Kowalski";
        workWithWebElement(lastName, name2, inputLastNameValue);


        List<WebElement> radioButtons = driver.findElements(By.cssSelector(".radio-inline"));
        radioButtons.get(0).click();

        for (WebElement element : radioButtons) {
            if (element.getText().equals("Male")){
                element.click();
            }
        }

        WebElement dateOfBirth = driver.findElement(By.id("dob"));
        String date = dateOfBirth.getAttribute("name");
        String inputDobValue = "06/06/2018";
        workWithWebElement(dateOfBirth, date, inputDobValue);
        driver.findElement(By.id("address")).click();

        WebElement address = driver.findElement(By.id("address"));
        String address1 = address.getAttribute("name");
        String inputAddressValue = "Prosta 51";
        workWithWebElement(address, address1, inputAddressValue);

        WebElement email = driver.findElement(By.id("email"));
        String email1 = email.getAttribute("name");
        String inputEmailValue = "karol.kowalski@mailinator.com";
        workWithWebElement(email, email1, inputEmailValue);

        WebElement password = driver.findElement(By.id("password"));
        String password1 = password.getAttribute("name");
        String inputPasswordValue = "pass123";
        workWithWebElement(password, password1, inputPasswordValue);

        WebElement company = driver.findElement(By.id("company"));
        String company1 = company.getAttribute("name");
        String inputCompanyValue = "Coderslab";
        workWithWebElement(company, company1, inputCompanyValue);

        Select roleDropDown = new Select(driver.findElement(By.name("role")));
        roleDropDown.selectByVisibleText("Manager");

        Select expectations = new Select(driver.findElement(By.name("expectation")));
        expectations.selectByVisibleText("Good teamwork");

        driver.findElement(By.xpath("//label[text() = 'Read books']")).click();

        WebElement comment = driver.findElement(By.id("comment"));
        String comment1 = comment.getAttribute("name");
        String inputCommentValue = "To jest mój pierwszy automat testowy.";
        workWithWebElement(comment, comment1, inputCommentValue);

        driver.findElement(By.id("submit")).click();
        assertEquals("Successfully submitted!", driver.findElement(By.id("submit-msg")).getText());
    }

    private void workWithWebElement(WebElement firstName, String name, String inputValue) {
        if (firstName.isDisplayed()) {
            firstName.sendKeys(inputValue);
            System.out.println(name + ": " + inputValue);
        }
    }

    private void workWithSelection(WebElement expectation, String name, String getValue) {
        if (expectation.isSelected()) {
            expectation.click();
            System.out.println(name + ": " + getValue);
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
        return listId;
    }
}