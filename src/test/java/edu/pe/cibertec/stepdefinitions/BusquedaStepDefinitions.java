package edu.pe.cibertec.stepdefinitions;

import edu.pe.cibertec.screenplay.questions.ResultadosDeBusqueda;
import edu.pe.cibertec.screenplay.tasks.BuscarProducto;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class BusquedaStepDefinitions {

    @When("the user searches for the product {string}")
    public void the_user_searches_for_the_product(String productName) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                BuscarProducto.conNombre(productName)
        );
    }

    @Then("the user should see at least one result with the name {string}")
    public void the_user_should_see_at_least_one_result_with_the_name(String expectedName) {
        List<String> resultados = OnStage.theActorInTheSpotlight().asksFor(ResultadosDeBusqueda.mostrados());
        boolean encontrado = resultados.stream().anyMatch(nombre -> nombre.contains(expectedName));
        Assertions.assertTrue(encontrado, "No se encontro el producto: " + expectedName + " en: " + resultados);
    }
}
