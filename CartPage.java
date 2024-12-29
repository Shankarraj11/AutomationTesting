package com.CapstoneP2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;

    // Locators for cart page
    private By checkoutButton = By.linkText("Proceed to checkout");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void proceedToCheckout() {
        driver.findElement(checkoutButton).click();
    }
}
