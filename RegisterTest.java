package com.CapstoneP2;



import org.testng.annotations.Test;

public class RegisterTest extends TestBase {
    @Test
    public void testRegister() {
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.register("testUser", "password123");
    }
}
