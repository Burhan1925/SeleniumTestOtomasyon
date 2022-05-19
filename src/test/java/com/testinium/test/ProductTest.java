package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.methods.page.LoginPage;
import com.testinium.methods.page.ProductPage;
import org.junit.Test;

public class ProductTest extends BaseTest {

    @Test
    public void searchAndScroll() {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        ProductPage productPage = new ProductPage();
        productPage.searchAndScroll();

    }

    @Test
    public void addFavorites() {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        ProductPage productPage = new ProductPage();
        productPage.addFavorites();

    }

    @Test
    public void addFavoritesControl() {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        ProductPage productPage = new ProductPage();
        productPage.addFavorites();
        productPage.addFavoritesControl();
    }

    @Test
    public void removeFavorites() {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        ProductPage productPage = new ProductPage();
        productPage.addFavorites();
        productPage.removeFavorites();

    }

    @Test
    public void goToCard() {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        ProductPage productPage = new ProductPage();
        productPage.goToCard();
    }

    @Test
    public void productTake() {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        ProductPage productPage = new ProductPage();
        productPage.productTake();

    }

    @Test
    public void getAttributeText() {
        ProductPage productPage = new ProductPage();
        productPage.attributeTest();
    }

}