package com.CapstoneP2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    private WebDriver driver;

    // Locators for registration form
    private By usernameField = By.id("sign-username");
    private By passwordField = By.id("sign-password");
    private By signUpButton = By.xpath("//button[text()='Sign up']");
    
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public void register(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(signUpButton).click();
    }
}
