package edu.pe.cibertec.stepdefinitions;

import edu.pe.cibertec.screenplay.questions.ContadorDelCarrito;
import edu.pe.cibertec.screenplay.tasks.AgregarAlCarrito;
import edu.pe.cibertec.screenplay.ui.CarritoPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.Text;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class CarritoStepDefinitions {

    @When("the user adds the product {string} to the cart")
    public void the_user_adds_the_product_to_the_cart(String productName) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AgregarAlCarrito.producto(productName)
        );
    }

    @Then("the cart should show {string}")
    public void the_cart_should_show(String expectedText) {
        String textoCarrito = OnStage.theActorInTheSpotlight().asksFor(ContadorDelCarrito.mostrado());
        Assertions.assertTrue(
                textoCarrito.contains(expectedText),
                "Se esperaba que el carrito mostrara: '" + expectedText + "' pero mostro: '" + textoCarrito + "'"
        );
    }

    @And("navigates to the cart")
    public void navigates_to_the_cart() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(CarritoPage.CART_NAV_TOGGLE),
                Click.on(CarritoPage.CART_VIEW_CART_LINK)
        );
    }

    @Then("the user should see the product {string} in the cart list")
    public void the_user_should_see_the_product_in_the_cart_list(String productName) {
        List<String> nombres = new java.util.ArrayList<>(
                Text.ofEach(CarritoPage.CART_ITEM_NAMES).answeredBy(OnStage.theActorInTheSpotlight())
        );
        boolean encontrado = nombres.stream().anyMatch(n -> n.contains(productName));
        Assertions.assertTrue(encontrado, "No se encontro '" + productName + "' en el carrito. Contenido: " + nombres);
    }
}
