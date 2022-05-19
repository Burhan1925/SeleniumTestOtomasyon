package com.testinium.methods.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class PointCatalogPage {
    Methods methods;
    Logger logger = LogManager.getLogger(LoginPage.class);

    public PointCatalogPage() {
        methods = new Methods();
    }

    public void point() {


        methods.click(By.cssSelector(".lvl1feature>.lvl1catalog>a"));
        methods.waitBySeconds(5);

        methods.scrollWithAction(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.waitBySeconds(3);

        methods.click(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.waitBySeconds(5);

        methods.selectByText(By.cssSelector(".product-filter-header>div[class=sort]>select"), "Yüksek Oylama");
        methods.waitBySeconds(5);


    }

    public void selectAddRandomProduct() {

        methods.click(By.cssSelector(".lvl2.js-bookCr>.js-ajaxCt.js-bookCt>:nth-child(3)"));
        methods.waitBySeconds(5);
        methods.hover(By.xpath("//*[@class='mn-strong common-sprite' and contains(text(), 'Tüm Kitaplar')]"));
        methods.waitBySeconds(5);
        methods.click(By.xpath("//*[@class='mn-icon icon-angleRight' and contains(text(), 'Hobi')]"));
        methods.waitBySeconds(5);
        clickRandomProduct();
        methods.waitBySeconds(5);
        methods.click(By.cssSelector("#button-cart > span"));
        methods.waitBySeconds(5);

    }

    public void clickRandomProduct() {
        Random rnd = new Random();
        List<WebElement> Products = methods.findElements(By.cssSelector(".pr-img-link"));
        WebElement rndProduct = Products.get(rnd.nextInt(Products.size()));
        rndProduct.click();
        logger.info("Rastgele ürün secildi");

    }

}
