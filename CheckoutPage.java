package com.CapstoneP2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    private WebDriver driver;

    // Locators for checkout page
    private By placeOrderButton = By.xpath("//button[text()='Place Order']");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void placeOrder() {
        driver.findElement(placeOrderButton).click();
    }
}
