package step_definitions;

import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class MyStepdefs {

    private WebDriver driver;

    @Given("something is done")
    public void somethingIsDone() {
        System.out.println("Udało się skonfigurować ogórka");
    }

    @When("{string} is printed")
    public void isPrinted(String parameter) {
        System.out.println(parameter);
    }

    @And("{int} is printed correctly")
    public void isPrintedCorrectly(int parameter) {
        int i = parameter + 3;
        System.out.println(i);
    }

    @But("we can use a list as well")
    public void weCanUseAListAsWell(List<String> list) {
        list.forEach(System.out::println); //lambda skrócona
//        list.forEach(s -> System.out.println(s); //poprawna lambda pełna
//        for (String animal : list) {
//            System.out.println(animal);
//        }
    }

    @Given("people trying singing")
    public void peopleTryingSinging() {
        System.out.println("***singing***");
    }

    @When("now (.*) trying")
    public void nowPersonTrying(String person) {
        System.out.println("***" + person + "***");

    }

    @Then("sings (.*)")
    public void singsHow(String how) {
        System.out.println("***" + how + "***");
    }

    @Given("an open browser with Google")
    public void anOpenBrowserWithGoogle() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Kamil/Desktop/Tester_Automatyczny/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.pl");
    }

    @When("{string} word has been written into input field and submitted")
    public void wordHasBeenWrittenIntoInputFieldAndSubmitted(String input) {
        WebElement inputField = driver.findElement(By.name("q"));
        inputField.sendKeys(input);
        inputField.submit();
        System.out.println(input);
    }

    @And("close browser")
    public void closeBrowser() {
        driver.quit();
    }

    @Then("the first result contains {string}")
    public void theFirstResultContains(String parameter) {
        System.out.println(parameter);
        List<WebElement> elements = driver.findElements(By.cssSelector(".rc"));
        assertTrue(elements.get(1).getText().contains(parameter));

//        for (WebElement element : elements) {  //podejście 2
//            assertTrue(element.getText().contains(parameter));
//        }

//        elements.forEach((webElement -> assertTrue((webElement.getText().contains(parameter))))); //podejście 3
//        List<Boolean> collect = elements.stream().map(webElement -> WebElement.getText().contains(parameter).collect(Collectors.toList)))); //podejście 4
//        if(collect.equals(false)) {
//            System.out.println();
        }


    @Given("there is browser opened with page {string}")
    public void thereIsBrowserOpenedWithPage(String url) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Kamil/Desktop/Tester_Automatyczny/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @When("user clicks on registration button")
    public void userClicsOnRegistrationButton() {
        driver.findElement(By.cssSelector(".bodytxt a")).click();
    }

    @Then("user is on registration page")
    public void userIsOnRegistrationPage() {
        assertEquals("Add New User", driver.getTitle());
    }

    @When("user fill all mandatory fields")
    public void userFillAllMandatoryFields(List<String> inputValues) {
        driver.findElement(By.name("first_name")).sendKeys(inputValues.get(0));
        driver.findElement(By.name("last_name")).sendKeys(inputValues.get(1));

    }
}