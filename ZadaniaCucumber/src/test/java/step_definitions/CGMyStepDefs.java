package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class CGMyStepDefs {

    private WebDriver driver;
    private String firstname;
    private String nip;

    @Given("an open browser with page {string}")
    public void anOpenBrowserWithPage(String url) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Kamil/Desktop/Tester_Automatyczny/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @When("copy NIP no")
    public void copyNIPNo() {
        nip = driver.findElement(By.id("nipBox")).getText();
        System.out.println("NIP no: " + nip);
        driver.quit();
    }

    @Then("switch to page {string}")
    public void switchToPage(String url) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Kamil/Desktop/Tester_Automatyczny/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @When("user clicks on register button")
    public void userClicksOnButton() {
        driver.findElement(By.cssSelector(".link main-page-top__email-input-sent")).submit();
        assertEquals("Zarejestruj się", driver.findElement(By.cssSelector(".registration__header header")));
    }

    @Then("user moves to registration subpage")
    public void userMovesToRegistrationSubpage() {
        assertEquals("Zarejestruj się", driver.findElement(By.cssSelector(".registration__header.header")).getText());
    }

    @When("user clicks on company button")
    public void userClicksOnCompanyButton() {
        driver.findElement(By.id("company")).click();
    }

    @Then("inputs field email with field (.*)")
    public void inputFieldEmailWithFieldEmailparameter(String parameter) {
        driver.findElement(By.id("fos_user_registration_form_email")).sendKeys(parameter);
    }

    @Then("inputs field firstname with field (.*)")
    public void inputFieldFirstnameWithFieldFirstnameparameter(String parameter) {
        driver.findElement(By.id("fos_user_registration_form_name")).sendKeys(parameter);
        firstname = parameter;
    }

    @Then("inputs field lastname with field (.*)")
    public void inputFieldLasttnameWithFieldLastnameparameter(String parameter) {
        driver.findElement(By.id("fos_user_registration_form_lastname")).sendKeys(parameter);
    }

    @Then("inputs field password with field (.*)")
    public void inputFieldPasswordWithFieldPasswordparameter(String parameter) {
        driver.findElement(By.id("fos_user_registration_form_plainPassword_first")).sendKeys(parameter);
    }

    @Then("inputs field repeat password with field (.*)")
    public void inputFieldRepeatPasswordWithFieldRepeatpasswordparameter(String parameter) {
        driver.findElement(By.id("fos_user_registration_form_plainPassword_second")).sendKeys(parameter);
    }

    @Then("inputs field city with field (.*)")
    public void inputFieldCityWithFieldCityparameter(String parameter) {
        driver.findElement(By.id("form_city")).sendKeys(parameter);
    }

    @Then("inputs field zip with field (.*)")
    public void inputFieldZipWithFieldZipparameter(String parameter) {
        driver.findElement(By.id("form_postal_code")).sendKeys(parameter);
    }

    @Then("inputs field street with field (.*)")
    public void inputFieldStreetWithFieldAddressparameter(String parameter) {
        driver.findElement(By.id("form_street")).sendKeys(parameter);
    }

    @Then("inputs field appartment with field (.*)")
    public void inputFieldAppartmentWithFieldAppartmentparameter(String parameter) {
        driver.findElement(By.id("form_number")).sendKeys(parameter);
    }

    @Then("inputs field company with field (.*)")
    public void inputsFieldCompanyWithFieldCompanyparameter(String parameter) {
        driver.findElement(By.id("fos_user_registration_form_company_name")).sendKeys(parameter);
    }

    @Then("inputs copied NIP no to the NIP field")
    public void inputsCopiedNIPNoToTheNIPField() {
        driver.findElement(By.id("fos_user_registration_form_nip")).sendKeys(nip);
    }

    @When("user fills checkbox with regulations agreement")
    public void fillCheckboxWithRegulationsAgreement() {
        driver.findElement(By.xpath("//input[@type = 'checkbox']")).click();
    }

    @Then("submits the filled form and confirms logging in")
    public void submitTheForm() {
        driver.findElement(By.id("register-submit-btn")).click();
        assertEquals(firstname, driver.findElement(By.id("user-name")).getText());
    }

    @And("closes the browser")
    public void closeTheBrowser() {
        driver.quit();
    }

    @When("user clicks on {string} button")
    public void userClicksOnButton(String parameter) {
        driver.findElement(By.cssSelector(".link.main-page-top__email-input-sent")).click();
    }


}