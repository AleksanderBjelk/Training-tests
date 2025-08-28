//package com.example.Training.stepdefs;
//
//import com.example.Training.driver.DriverManager;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import org.openqa.selenium.WebDriver;
//import com.example.Training.steplibs.iStepLibs;
//
//public class iStepDefs {
//
//    private static WebDriver driver;
//
//    @Before
//    public void setUp() {
//        driver = DriverManager.getDriver();
//    }
//
//    @Given("User navigates to Ikano {string} first page")
//    public void userNavigatesToIkanoFirstPage(){
//        driver.get("https://ikanobank.se/");
//    }
//
//    @Then("User should see starting page for Sweden")
//    public void userShouldSeeStartingPageSweden(){
//        iStepLibs.userSeesStartingPageSweden()
//    }
//
//}
