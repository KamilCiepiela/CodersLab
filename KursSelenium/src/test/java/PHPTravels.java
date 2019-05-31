import jdk.javadoc.internal.doclets.toolkit.util.DocFile;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class PHPTravels {

    private WebDriver driver;
    String url = "https://www.phptravels.net/";
    private DocFile FileUtils;

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
    public void flightReservation() throws Exception {
        driver.get(url);
        WebElement flights = driver.findElement(By.xpath("//a[@href = '#flights']"));
        flights.click();

        driver.findElement(By.xpath("//input[@data-type = 'round']")).click();

        WebElement locationFrom = driver.findElement(By.id("s2id_autogen7"));
        locationFrom.sendKeys("Warsaw Intl Arpt (WAW)");
        locationFrom.click();

        WebElement locationTo = driver.findElement(By.id("s2id_autogen8"));
        locationTo.sendKeys("Monroe Cty Arpt New York (ROC)");
        locationTo.click();

        WebElement departureDate = driver.findElement(By.name("departure"));
        departureDate.sendKeys("0020190624");
        departureDate.click();

        WebElement arrivalDate = driver.findElement(By.name("arrival"));
        arrivalDate.sendKeys("0020190630");
        arrivalDate.click();

        driver.findElement(By.className("btn-primary btn btn-lg btn-block pfb0")).click();

        driver.findElement(By.xpath("//button[@data-setting_id = '202507']")).click();
        assertEquals("PHPTRAVELS | Travel Technology Partner", driver.getTitle());

        driver.findElement(By.name("firstname")).sendKeys("Karol");
        driver.findElement(By.name("lastname")).sendKeys("Kowalski");
        driver.findElement(By.name("email")).sendKeys("karol.kowalski@mailinator.com");
        driver.findElement(By.name("confirmemail")).sendKeys("karol.kowalski@mailinator.com");
        driver.findElement(By.name("phone")).sendKeys("123456789");
        driver.findElement(By.name("address")).sendKeys("Prosta St. 51/69, Warsaw");
        WebElement country = driver.findElement(By.className("select2-input"));
        country.sendKeys("Poland");
        country.click();
        driver.findElement(By.name("guest")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Zamawiam i płacę']")));

        assertEquals("Invoive", driver.getTitle());
        driver.findElement(By.id("downloadInvoice")).click();
//        driver.findElement(By.id("printablediv"));
//        takeScreenShot("PHPInvoice.jpg");
    }

//    private void takeScreenShot(String fname) {
//        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        String imageFileDir = System.getProperty("selenium.screenshot.dir");
//        if (imageFileDir == null)
//            imageFileDir = System.getProperty("java.io.tmpdir");
//        FileUtils.copyFile(scrFile, new File(imageFileDir, fname));
//    }

}
