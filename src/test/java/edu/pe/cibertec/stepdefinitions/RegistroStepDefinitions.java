package edu.pe.cibertec.stepdefinitions;

import edu.pe.cibertec.screenplay.tasks.AceptarPoliticaYContinuar;
import edu.pe.cibertec.screenplay.tasks.RegistrarseComo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

public class RegistroStepDefinitions {

    @Given("the user navigates to the register page")
    public void the_user_navigates_to_the_register_page() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Open.url("https://naveenautomationlabs.com/opencart/index.php?route=account/register")
        );
    }

    @When("the user fills the form with first name {string}, last name {string}, email {string}, phone {string} and password {string}")
    public void the_user_fills_the_form(String firstName, String lastName, String email,
                                         String phone, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                RegistrarseComo.con(firstName, lastName, email, phone, password)
        );
    }

    @And("accepts the privacy policy")
    public void accepts_the_privacy_policy() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AceptarPoliticaYContinuar.aceptarPolitica()
        );
    }

    @And("clicks on continue")
    public void clicks_on_continue() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AceptarPoliticaYContinuar.hacerClicEnContinuar()
        );
    }
}
