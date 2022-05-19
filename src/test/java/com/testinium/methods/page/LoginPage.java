package com.testinium.methods.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class LoginPage {

    Methods methods;
    Logger logger = LogManager.getLogger(LoginPage.class);


    public LoginPage() {
        methods = new Methods();
    }

    public void login() {

        methods.click(By.xpath("//div[@class='menu-top-button login']"));
        methods.waitBySeconds(5);
        methods.sendKeys(By.id("login-email"), "burhan.aydin@testinium.com");
        methods.waitBySeconds(5);
        methods.sendKeys(By.xpath("//input[@id='login-password']"), "1a2s3d4f");
        methods.waitBySeconds(5);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySeconds(5);

    }

}
