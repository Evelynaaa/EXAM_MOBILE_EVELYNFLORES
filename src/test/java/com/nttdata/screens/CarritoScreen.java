package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CarritoScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    private WebElement botonAddCart;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Increase item quantity\"]")
    private WebElement botonAddMore;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Displays number of items in your cart\"]")
    private WebElement btnCart;

    public void clickAddCart(){
        botonAddCart.click();
    }

    public void clickAddItem(){
        waitFor(ExpectedConditions.visibilityOf(botonAddMore));
        botonAddMore.click();
    }

    public void clickCart(){
        btnCart.click();
    }


    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/titleTV\"]")
    private WebElement titleProduct;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/noTV\"]")
    private WebElement unitProduct;

    public String getTituloProduct(){
        waitFor(ExpectedConditions.visibilityOf(titleProduct));
        return titleProduct.getText();
    }

    public String getCantidad(){
        waitFor(ExpectedConditions.visibilityOf(unitProduct));
        return unitProduct.getText();
    }


}
