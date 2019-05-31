package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

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

    @When("user clicks on {string} button")
    public void userClicksOnButton() {
        driver.findElement(By.cssSelector(".link.main-page-top__email-input-sent")).click();
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

    @When("user chooses classes while being logged in")
    public void userChoosesClassesWhileBeingLoggedIn() {
        driver.findElement(By.className("select-text-desktop")).click();
        driver.findElement(By.xpath("//li[text()='CSS']")).click();
        driver.findElement(By.xpath("//input[@class = 'link main-page-top__select-btn']")).click();
    }

    @When("user is logged in")
    public void userIsLoggedIn() {
        driver.findElement(By.cssSelector(".header__button")).click();
        driver.findElement(By.id("username")).sendKeys("karol.kowalski@mailinator.com");
        driver.findElement(By.id("password")).sendKeys("Pass123");
        driver.findElement(By.id("_submit")).click();
    }

    @And("selects a mentor")
    public void selectsAMentor() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//button[text() = 'Rezerwuj']"), 0));
        driver.findElements(By.xpath("//button[text() = 'Rezerwuj']")).get(2).click();
    }

    @Then("makes a reservation")
    public void makesAReservation() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Zamawiam i płacę']")));
        driver.findElement(By.className("reservation__modal-textarea")).sendKeys("My problem is ...");
        driver.findElement(By.xpath("//li[text()='18.05']")).click();
        driver.findElement(By.xpath("//li[text()='20:00']")).click();
    }

    @When("user pays for classes")
    public void userPaysForClasses() {
        driver.findElement(By.xpath("//button[@class = 'reservation-modal__summary-button button']")).click();
    }

    @Then("is transferred to PayU webpage")
    public void isTransferredToPayUWebpage() {
        driver.findElement(By.xpath("//a[@href = 'https://secure.payu.com/api/v2_1/orders']")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        String parentWindow = driver.getWindowHandle();
        for (String childWindow : windowHandles) {
            if (!childWindow.equalsIgnoreCase(parentWindow)) {
                driver.switchTo().window(childWindow);
            }
        }
        assertEquals("PayU", driver.getTitle());
    }

    @And("closes the browser")
    public void closeTheBrowser() {
        driver.quit();
    }
}