package com.nttdata.stepsdefinitions;
import com.nttdata.steps.SauceSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class SauceStepdefs {

    @Steps
    SauceSteps sauceSteps;
    int UNIDADES = 0;

    @Given("estoy en la aplicacion de SauceLabs")
    public void estoyEnLaAplicacionDeSauceLabs() {}

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        sauceSteps.tittleProduct();
    }

    @When("agrego {int} del siguiente producto {string}")
    public void agregoDelSiguienteProducto(int unidad, String producto) {
        sauceSteps.selectedProduct(producto);
        sauceSteps.AddCart(unidad);
        UNIDADES = unidad;
    }

    @Then("valido el carrito de compra actualice correctamente")
    public void validoElCarritoDeCompraActualiceCorrectamente() {
        sauceSteps.Cartbutton();
        sauceSteps.verificarCantidad(UNIDADES);
    }
}
