package com.CapstoneP2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;

    // Locators for product page
    private By addToCartButton = By.linkText("Add to cart");
    
    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCart() {
        driver.findElement(addToCartButton).click();
    }
}
