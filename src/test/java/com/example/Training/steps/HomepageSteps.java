package com.example.Training.steps;

import com.example.Training.driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomepageSteps {

    private WebDriver driver;

   /* @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }*/

    @Before
    public void setUp(){
        driver = DriverManager.getDriver();
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        DriverManager.quitDriver();
    }

    @Given("jag öppnar startsidan")
    public void jag_oppnar_startsidan(){
        driver.get("http://localhost:8080");
    }

    @Then("ska jag se rubriken {string}")
    public void ska_jag_se_rubriken(String expectedHeading) throws InterruptedException {
        WebElement heading = driver.findElement(By.id("main-heading"));
        assertEquals(expectedHeading, heading.getText());
        //Thread.sleep(500);

    }

    @Then("ska jag se listobjektet {string}")
    public void ska_jag_se_listobjekten(String item) throws InterruptedException {
        WebElement listItem = driver.findElement(By.xpath("//ul[@class='items']/li[text()='" + item + "']"));
        assertEquals(item, listItem.getText());
        //Thread.sleep(500);

    }

    @When("jag väljer frukten {string}")
    public void jag_valjer_frukten(String fruit) throws InterruptedException {
        Select dropdown = new Select(driver.findElement(By.cssSelector("#fruit-select")));
        dropdown.selectByVisibleText(fruit);
        //Thread.sleep(500);

    }

//    @When("jag markerar intresset {string}")
//    public void jag_markerar_intresset(String interest){
//        String value = interest.equalsIgnoreCase("Musik") ? "music" : interest.toLowerCase();
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        WebElement checkbox = wait.until(ExpectedConditions.visibilityOfElementLocated(
//                By.cssSelector("input[type='checkbox'][value='" + value + "']"))
//        );
//
//        if (!checkbox.isSelected()){
//            checkbox.click();
//        }
//    }

    @Then("ska tabellen innehålla personen {string} med ålder {string} och stad {string}")
    public void ska_tabellen_innehalla_personen(String name, String age, String city) throws InterruptedException {
        WebElement row = driver.findElement(By.xpath("//table[@id='data-table']/tbody/tr[td[text()='" + name + "']]"));
        String actualName = row.findElement(By.xpath("./td[1]")).getText();
        String actualAge = row.findElement(By.xpath("./td[2]")).getText();
        String actualCity = row.findElement(By.xpath("./td[3]")).getText();

        assertEquals(name, actualName);
        assertEquals(age, actualAge);
        assertEquals(city, actualCity);
        //Thread.sleep(500);

    }

    @When("jag klickar på knappen {string}")
    public void jag_klickar_pa_knappen(String buttonText) throws InterruptedException {
        WebElement button = driver. findElement(By.xpath("//button[text()='" + buttonText + "']"));
        button.click();
        //Thread.sleep(500);

    }

    @Then("ska jag se rubriken på page2 {string}")
    public void ska_jag_se_rubriken_på_page2(String expectedHeading) {
        WebElement heading = driver.findElement(By.tagName("h1"));
        assertEquals(expectedHeading, heading.getText());
    }


    @When("jag klickar på input{int} {string}")
    public void jagKlickarPåInput(int inputNum, String text) throws InterruptedException {
        String id = "name";
        switch(inputNum) {
            case 1: id = "name"; break;
            case 2: id = "password"; break;
            case 3: id = "name2"; break;
            case 4: id = "password2"; break;
            case 5: id = "name3"; break;
            case 6: id = "password3"; break;
            case 7: id = "name4"; break;
            case 8: id = "password4"; break;
        }
        WebElement input = driver.findElement(By.id(id));
        input.clear();
        input.sendKeys(text);
        //Thread.sleep(500);
    }

    @When("jag klickar på knappen för att logga in {string}")
    public void jagKlickarPåKnappenFörAttLoggaIn(String buttonText) {
        WebElement button = driver. findElement(By.xpath("//button[text()='" + buttonText + "']"));
        button.click();
    }

    @When("jag klickar knappen för att byta färg {string}")
    public void jagKlickarKnappenFörAttBytaFärg(String color) throws InterruptedException {
        String id = "";
        switch(color.toLowerCase()) {
            case "grön": id = "color-green"; break;
            case "röd": id = "color-red"; break;
            case "blå": id = "color-blue"; break;
            case "gul": id = "color-yellow"; break;
        }
        driver.findElement(By.id(id)).click();
        //Thread.sleep(500);

    }
}




 /*       if (System.getenv("GITHUB_ACTIONS") != null) {
            options.addArguments("--headless=new");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--disable-gpu");
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("--user-data-dir=/tmp/chrome-" + System.currentTimeMillis());
        }*/
