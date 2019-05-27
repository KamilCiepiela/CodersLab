package step_definitions;
import cucumber.api.java.en.*;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.Assert.assertTrue;


public class MyStepdefs {

    private WebDriver driver;

//    training.feature

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
//        list.forEach(System.out::println); //lambda skrócona
//        list.forEach(s -> System.out.println(s); //poprawna lambda pełna
        for (String animal : list) {
            System.out.println(animal);
        }
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

//    google_search.feature

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
    }

//    formTestSingleList.feature

    @Given("there is browser opened with page {string}")
    public void thereIsBrowserOpenedWithPage(String url) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Kamil/Desktop/Tester_Automatyczny/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @When("user clicks on registration button")
    public void userClicksOnRegistrationButton() {
        driver.findElement(By.cssSelector(".bodytxt a")).click();
    }

    @Then("user is on registration page")
    public void userIsOnRegistrationPage() {
        Assert.assertEquals("Add New User", driver.getTitle());
    }

    @When("user fills all mandatory fields")
    public void userFillAllMandatoryFields(List<String> inputValues) {
        driver.findElement(By.name("first_name")).sendKeys(inputValues.get(0));
        driver.findElement(By.name("last_name")).sendKeys(inputValues.get(1));
        driver.findElement(By.name("email")).sendKeys(inputValues.get(2));
        driver.findElement(By.name("user_name")).sendKeys(inputValues.get(3));
        driver.findElement(By.name("address1")).sendKeys(inputValues.get(4));
        driver.findElement(By.name("city")).sendKeys(inputValues.get(5));
        driver.findElement(By.name("prov")).sendKeys(inputValues.get(6));
        driver.findElement(By.name("zip")).sendKeys(inputValues.get(7));
        driver.findElement(By.name("password")).sendKeys(inputValues.get(8));
    }

    @When("user fills all mandatory fields with values:")
    public void userFillsAllMandatoryFieldsWithValues(DataTable dataTable) {
        List<List<String>> lists = dataTable.asLists();
        System.out.println(lists);

        for (List<String> list : lists) {
            driver.findElement((By.name((list.get(0))))).sendKeys(list.get(1));
        }
    }

//    formTestDoubleList.feature

    @When("input field firstname is field with (.*)")
    public void inputFieldFirstnameIsFieldWithFirstnameparameter(String parameter) {
        driver.findElement(By.name("first_name")).sendKeys(parameter);
    }

    @When("input field lasttname is field with (.*)")
    public void inputFieldLasttnameIsFieldWithLastnameparameter(String parameter) {
        driver.findElement(By.name("last_name")).sendKeys(parameter);
    }

    @When("input field email is field with (.*)")
    public void inputFieldEmailIsFieldWithEmailparameter(String parameter) {
        driver.findElement(By.name("email")).sendKeys(parameter);
    }

    @When("input field username is field with (.*)")
    public void inputFieldUsernameIsFieldWithUsernameparameter(String parameter) {
        driver.findElement(By.name("user_name")).sendKeys(parameter);
    }

    @When("input field address is field with (.*)")
    public void inputFieldAddressIsFieldWithAddressParameter(String parameter) {
        driver.findElement(By.name("address1")).sendKeys(parameter);
    }

    @When("input field city is field with (.*)")
    public void inputFieldCityIsFieldWithCityparameter(String parameter) {
        driver.findElement(By.name("city")).sendKeys(parameter);
    }

    @When("input field prov is field with (.*)")
    public void inputFieldProvIsFieldWithProvparameter(String parameter) {
        driver.findElement(By.name("prov")).sendKeys(parameter);
    }

    @When("input field zip is field with (.*)")
    public void inputFieldZipIsFieldWithZipparameter(String parameter) {
        driver.findElement(By.name("zip")).sendKeys(parameter);
    }

    @When("input field password is field with (.*)")
    public void inputFieldPasswordIsFieldWithPasswordparameter(String parameter) {
        driver.findElement(By.name("password")).sendKeys(parameter);
    }
    @Then("submit the form")
    public void submitTheForm() {
        driver.findElement(By.name("Submit")).click();
    }

    @And("close the browser")
    public void closeTheBrowser() {
        driver.quit();
    }


}



