package com.example.Training.steps;

import com.example.Training.driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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

    @And("jag ser rubriken om Ikea lån {string}")
    public void jagSerRubrikenOmIkeaLån(String xpath) {
        WebElement text = driver.findElement(By.xpath(xpath));
        assertTrue(text.isDisplayed());
    }

    @And("jag ska se en lista med frågor {string}")
    public void jagSkaSeEnListaMedFrågor(String cssSelector) {
        WebElement list = driver.findElement(By.cssSelector(cssSelector));
        assertTrue(list.isDisplayed());
    }

    @And("jag ska se näst fråga i listan {string}")
    public void jagSkaSeNästFrågaIListan(String xpath) {
        WebElement listQuestion = driver.findElement(By.xpath(xpath));
        assertTrue(listQuestion.isDisplayed());
    }


    @When("jag klickar på frågan ska jag det dyka upp mer text {string}")
    public void jagKlickarPåFråganSkaJagDetDykaUppMerText(String xpath) throws InterruptedException {
        WebElement clickQuestion = driver.findElement(By.xpath(xpath));
        clickQuestion.click();
        Thread.sleep(500);
    }


    @Then("ska jag se den nya texten {string}")
    public void skaJagSeDenNyaTexten(String xpath) {
        WebElement newText = driver.findElement(By.xpath(xpath));
        assertTrue(newText.isDisplayed());
    }

    @And("jag ska hitta länken till nästa sida {string}")
    public void jagSkaHittaLänkenTillNästaSida(String cssSelector) {
        WebElement link = driver.findElement(By.cssSelector(cssSelector));
        new Actions(driver).moveToElement(link).perform();
        link.isDisplayed();
    }

    @When("jag klickar på länken läs mer om bolån ska jag komma till en ny sida {string}")
    public void jagKlickarPåLänkenLäsMerOmBolånSkaJagKommaTillEnNySida(String cssSelector) {
        WebElement link = driver.findElement(By.cssSelector(cssSelector));
        link.click();
    }

    @When("jag klickar på länken ska jag förflyttas ner på sidan {string}")
    public void jagKlickarPåLänkenSkaJagFörflyttasNerPåSidan(String cssSelector) throws InterruptedException {
        WebElement link = driver.findElement(By.cssSelector(cssSelector));
        link.click();
        Thread.sleep(3000);
    }

    @And("jag klickar på knappen köpa ny bostad \\({string}))")
    public void jagKlickarPåKnappenKöpaNyBostad(String xpath) {
        WebElement button = driver.findElement(By.xpath(xpath));
        button.click();
    }


    @And("jag klickar på fältet för att sätta ett ogiltigt värde {string}")
    public void jagKlickarPåFältetFörAttSättaEttOgiltigtVärde(String cssSelector) throws InterruptedException {
        WebElement housingInput = driver.findElement(By.cssSelector(cssSelector));
        housingInput.sendKeys(Keys.chord(Keys.COMMAND, "a")); //FÖR MACOS
        housingInput.sendKeys(Keys.DELETE);
        housingInput.sendKeys("99000");
        Thread.sleep(2000);
    }
}
