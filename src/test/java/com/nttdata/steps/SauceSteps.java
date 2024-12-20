package com.nttdata.steps;

import com.nttdata.screens.MenuScreen;
import com.nttdata.screens.CarritoScreen;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class SauceSteps {

    MenuScreen menuScreen;
    CarritoScreen carritoScreen;
    private WebDriver driver;

    public void tittleProduct(){
        String titulo = menuScreen.gettitleTexto();
        Assert.assertEquals("Error: El título no coincide", "Products", titulo);
    }

    public void selectedProduct(String producto){
        menuScreen.getProduct(producto);
    }

    public void AddCart(int UNIDADES){
        for(int i = 1; i< UNIDADES; i++){
            carritoScreen.clickAddItem();
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        carritoScreen.clickAddCart();
    }

    public void Cartbutton(){
        carritoScreen.clickCart();
    }

    public void verificarCantidad(int cantidadEsperada){
        int cantidadActual = Integer.parseInt(carritoScreen.getCantidad());
        Assert.assertEquals("Las cantidades no son las esperadas", cantidadEsperada, cantidadActual);
    }

}
