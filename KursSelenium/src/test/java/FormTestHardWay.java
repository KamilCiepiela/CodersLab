import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.google.common.base.Verify.verify;
import static org.junit.Assert.assertEquals;

public class FormTestHardWay {

    private WebDriver driver;
    private static final List<String> LIST = Arrays.asList("'Read books'", "'Take online courses'", "'Contribute to opensource projects'", "'Join tech cons'", "'Read tech blogs'", "'Via discovery and experiment'");
//    private static final String DEV1 = "'Read books'";
//    private static final String DEV2 = "'Take online courses'";
//    private static final String DEV3 = "'Contribute to opensource projects'";
//    private static final String DEV4 = "'Join tech cons'";
//    private static final String DEV5 = "'Read tech blogs'";
//    private static final String DEV6 = "'Via discovery and experiment'";

//    private void sleep (){
//        try{
//            Thread.sleep(3000);
//        } catch (interruptedException e){
//            e.printStackTrace();
//        }
//    }



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
//        try {
//            verify(driver.findElement(By.id("submit-msg")).getText().equals("Successfully submitted!"));
//        } catch (VerifyException e) {
//            e.printStackTrace();
//        }






        WebElement lastName = driver.findElement(By.id("last-name"));
        String name2 = lastName.getAttribute("name");
        String inputLastNameValue = "Kowalski";
        workWithWebElement(lastName, name2, inputLastNameValue);
//        driver.manage().timeouts().wait(500);
//        driver.findElement(By.id("submit")).click();
//        verify(driver.findElement(By.id("submit-msg")).getText().equals("Successfully submitted!"));


        List<WebElement> radioButtons = driver.findElements(By.cssSelector(".radio-inline"));
        radioButtons.get(0).click();

        for (WebElement element : radioButtons) {
            if (element.getText().equals("Male")) {
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

        WebElement roleDropDown = driver.findElement(By.name("role"));
        String nameDropDownRole = roleDropDown.getAttribute("name");
        String chosenOption = "Manager";
        workWithDropdown(roleDropDown, nameDropDownRole, chosenOption);

        WebElement expectationDropDown = driver.findElement(By.name("expectation"));
        String nameDropDownExpectation = expectationDropDown.getAttribute("name");
        String chosenOption1 = "Good teamwork";
        workWithDropdown(expectationDropDown, nameDropDownExpectation, chosenOption1);

//        driver.findElement(By.xpath("//label[text() = 'Take online courses']")).click();
//        driver.findElement(By.xpath("//label[text() = 'Contribute to opensource projects']")).click();
//        driver.findElement(By.xpath("//label[text() = 'Via discovery and experiment']")).click();
//        System.out.println(new StringBuilder().append("development: ").append("Take online courses, ").append("Contribute to opensource projects, ").append("Via discovery and experiment").toString());

        for (String text : LIST) {
            selectProperCheckBox(text);
            System.out.println("development: " + text.substring(1,text.length()-1));
        }



        WebElement comment = driver.findElement(By.id("comment"));
        String comment1 = comment.getAttribute("name");
        String inputCommentValue = "To jest mój pierwszy automat testowy.";
        workWithWebElement(comment, comment1, inputCommentValue);

        driver.findElement(By.id("submit")).click();
        assertEquals("Successfully submitted!", driver.findElement(By.id("submit-msg")).getText());
    }


    private void selectProperCheckBox(String text) {
        driver.findElement(By.xpath("//label[text() =" + text + "]")).click();
    }

    private void workWithDropdown(WebElement webElement, String name, String visibleText) {
        new Select(webElement).selectByVisibleText(visibleText);
        System.out.println(name + ": " + visibleText);
    }

    private void workWithWebElement(WebElement firstName, String name, String inputValue) {
        if (firstName.isDisplayed()) {
            firstName.sendKeys(inputValue);
            System.out.println(name + ": " + inputValue);
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
        assertEquals(Integer.valueOf(8), Integer.valueOf(counter));

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