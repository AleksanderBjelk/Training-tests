package com.example.Training.steps;

import com.example.Training.driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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
    public void ska_jag_se_rubriken_ikano(String xpath) {
        WebElement heading = driver.findElement(By.xpath(xpath));
        assertTrue(heading.isDisplayed());
    }
}
