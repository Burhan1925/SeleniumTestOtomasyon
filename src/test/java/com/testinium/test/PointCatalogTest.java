package com.testinium.test;

import com.testinium.driver.BaseTest;

import com.testinium.methods.page.LoginPage;
import com.testinium.methods.page.PointCatalogPage;
import org.junit.Test;

public class PointCatalogTest extends BaseTest {

    @Test
    public void pointCatalogTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.login();

        PointCatalogPage pointCatalogPage = new PointCatalogPage();
        pointCatalogPage.point();
    }

    @Test
    public void selectAddRandomProductTest() {

        LoginPage loginPage = new LoginPage();
        loginPage.login();

        PointCatalogPage pointCatalogPage = new PointCatalogPage();
        pointCatalogPage.selectAddRandomProduct();
    }

}
