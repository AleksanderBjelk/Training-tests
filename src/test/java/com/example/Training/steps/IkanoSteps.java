package com.example.Training.steps;

import com.example.Training.driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class IkanoSteps {

    private static WebDriver driver;

    @Before
    public void setUp() {
        driver = DriverManager.getDriver();
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        DriverManager.quitDriver();
    }

    @Given("jag öppnar startsidan på ikano")
    public void jag_oppnar_startsidan_pa_ikano() {
        driver.get("https://ikanobank.se/");
    }

    @Then("ska jag se rubriken på Ikano {string}")
    public void ska_jag_se_rubriken_ikano(String cssSelector) {
        WebElement heading = driver.findElement(By.cssSelector(cssSelector));
        assertTrue(heading.isDisplayed());
    }

    @And("ska jag se underrubriken på rubriken {string}")
    public void skaJagSeUnderrubrikenPåRubriken(String cssSelector) {
        WebElement subHeading = driver.findElement(By.cssSelector(cssSelector));
        assertTrue(subHeading.isDisplayed());
    }

    @And("jag ska se text om privatlån {string}")
    public void jagSkaSeTextOmPrivatlån(String xpath) throws InterruptedException {
        WebElement privatText = driver.findElement(By.xpath(xpath));
        assertTrue(privatText.isDisplayed());
        Thread.sleep(500);
    }

    @When("cookies fältet kommer upp ska jag godkänna {string}")
    public void cookiesFältetKommerUppSkaJagGodkänna(String cssSelector) {
        WebElement cookie = driver.findElement(By.cssSelector(cssSelector));
        cookie.click();
    }

    @When("jag trycker på knappen räkna på privatlån {string}")
    public void jagTryckerPåKnappenRäknaPåPrivatlån(String cssSelector) {
        WebElement link = driver.findElement(By.cssSelector(cssSelector));
        link.click();
    }

    @And("jag inser att jag tryckte fel så jag backar")
    public void jagInserAttJagTryckteFelSåJagBackar() throws InterruptedException {
        driver.navigate().back();
        Thread.sleep(500);
    }

    @When("jag trycker på rätt länk {string}")
    public void jagTryckerPåRättLänk(String xpath) {
        WebElement link = driver.findElement(By.xpath(xpath));
        link.click();
    }

}
