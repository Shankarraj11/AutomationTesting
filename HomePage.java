package com.CapstoneP2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    
    // Locators for home page
    private By electronicsCategory = By.linkText("Electronics");
    private By clothingCategory = By.linkText("Clothing");
    private By homeAppliancesCategory = By.linkText("Home Appliances");

    // Constructor to initialize WebDriver
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    
    public void goToElectronics() {
        driver.findElement(electronicsCategory).click();
    }
    
    public void goToClothing() {
        driver.findElement(clothingCategory).click();
    }

    public void goToHomeAppliances() {
        driver.findElement(homeAppliancesCategory).click();
    }
}
