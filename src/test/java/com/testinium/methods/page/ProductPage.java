package com.testinium.methods.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class ProductPage {
    Methods methods;
    Logger logger = LogManager.getLogger(LoginPage.class);

    public ProductPage() {
        methods = new Methods();
    }

    public void searchAndScroll() {
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("search-input"), "oyuncak");
        methods.waitBySeconds(5);
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(5);
        methods.scrollWithAction(By.xpath("//*[@class='product-cr'][7]"));
        methods.waitBySeconds(5);

    }

    public void addFavorites() {
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("search-input"), "oyuncak");
        methods.waitBySeconds(5);
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(5);
        methods.scrollWithAction(By.xpath("//*[@class='product-cr'][7]"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//div[@class='product-cr'][7]//a[@class='add-to-favorites']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//div[@class='product-cr'][6]//a[@class='add-to-favorites']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//div[@class='product-cr'][5]//a[@class='add-to-favorites']"));
        methods.waitBySeconds(3);
        methods.scrollWithAction(By.xpath("//*[@class='product-cr'][4]"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//div[@class='product-cr'][4]//a[@class='add-to-favorites']"));
        methods.waitBySeconds(3);

    }

    public void addFavoritesControl() {

        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".menu.top.my-list"));
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".menu.top.my-list>ul>li>div>ul>li>a"));
        methods.waitBySeconds(3);
        methods.scrollWithAction(By.xpath("//*[@id='product-494781']"));
        methods.waitBySeconds(3);
        methods.turnBack();
        methods.waitBySeconds(3);

    }

    public void removeFavorites() {

        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".menu.top.my-list"));
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".menu.top.my-list>ul>li>div>ul>li>a"));
        methods.waitBySeconds(3);
        methods.scrollWithAction(By.xpath("//*[@id='product-494781']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//*[@id='product-494781']/div[2]/div[3]/a[3]/i"));
        methods.waitBySeconds(5);
    }

    public void goToCard() {

        methods.waitBySeconds(3);
        methods.click(By.cssSelector("#cart>div.heading"));
        methods.waitBySeconds(3);

        methods.click(By.id("js-cart"));
        methods.waitBySeconds(3);

    }

    public void productTake() {

        methods.waitBySeconds(3);
        methods.click(By.cssSelector("#cart>div.heading"));
        methods.waitBySeconds(3);

        methods.click(By.id("js-cart"));
        methods.waitBySeconds(3);

        methods.click(By.xpath("//*[@id='cart_module']/div[4]/div[1]/a"));
        methods.waitBySeconds(3);


    }

    public void attributeTest() {
        String attribute = methods.getAttribute(By.cssSelector(".logo-text>a>img"), "title");
        System.out.println("Alinan text:" + attribute);
        logger.info("Alinan text:" + attribute);
        methods.waitBySeconds(3);

    }

}