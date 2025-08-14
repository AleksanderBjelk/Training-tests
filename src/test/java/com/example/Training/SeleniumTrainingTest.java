/*
package com.example.Training;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumTrainingTest {

    private WebDriver driver;

    @BeforeEach
    void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

//    @AfterEach
//    void tearDown(){
//        if (driver != null) driver.quit();
//    }

    @AfterEach
    void tearDown() throws InterruptedException {
        if (driver != null) {
            Thread.sleep(5000);
            driver.quit();
        }
    }

    @Test
    void testXPathAndCss(){
        driver.get("http://localhost:8080");

        //XPath
        WebElement heading = driver.findElement(By.xpath("//h1[@id='main-heading']"));
        assertEquals("Välkommen till Testträning", heading.getText());

        WebElement lovisa = driver.findElement(By.xpath("//ul[@class='items']/li[text()='Lovisa']"));
        assertEquals("Lovisa", lovisa.getText());


        //CSS Selector
        WebElement inputField = driver.findElement(By.cssSelector("#name"));
        inputField.sendKeys("Aleksander");

        WebElement submitBtn = driver.findElement(By.cssSelector("button#submit-btn"));
        assertEquals("Skicka", submitBtn.getText());
    }
}
*/
