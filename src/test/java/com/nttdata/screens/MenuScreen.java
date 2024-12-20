package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MenuScreen extends PageObject {

    private WebDriver driver;
    public MenuScreen(WebDriver driver) {
        this.driver = driver;
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement lblTitulo;

    public String gettitleTexto(){
        waitFor(ExpectedConditions.visibilityOf(lblTitulo));
        return lblTitulo.getText();
    }

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    private WebElement producto1;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bolt T-Shirt\"]")
    private WebElement producto2;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bike Light\"]")
    private WebElement producto3;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Fleece Jacket\"]")
    private WebElement producto4;

    //void para la seleccion del producto
    public void getProduct(String producto) {

        if(producto.equals("Sauce Labs Backpack")){
            waitFor(ExpectedConditions.visibilityOf(producto1));
            producto1.click();
        }

        if(producto.equals("Sauce Labs Bolt T-Shirt")){
            waitFor(ExpectedConditions.visibilityOf(producto2));
            producto2.click();
        }

        if(producto.equals("Sauce Labs Bike Light")){
            waitFor(ExpectedConditions.visibilityOf(producto3));
            producto3.click();
        }

        if(producto.equals("Sauce Labs Fleece Jacket")){
            waitFor(ExpectedConditions.visibilityOf(producto4));
            producto4.click();
}
}

}
