package edu.pe.cibertec.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import org.junit.jupiter.api.Assertions;

public class CommonStepDefinitions {

    @Given("the user is on the OpenCart home page")
    public void the_user_is_on_the_opencart_home_page() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Open.url("https://naveenautomationlabs.com/opencart/index.php?route=common/home")
        );
    }

    @Then("the user should see the message {string}")
    public void the_user_should_see_the_message(String expectedMessage) {
        String textoVisible = BrowseTheWeb.as(OnStage.theActorInTheSpotlight())
                .getDriver()
                .findElement(org.openqa.selenium.By.tagName("body"))
                .getText();
        Assertions.assertTrue(
                textoVisible.contains(expectedMessage),
                "No se encontro el mensaje esperado: '" + expectedMessage + "' en la pagina."
        );
    }
}
