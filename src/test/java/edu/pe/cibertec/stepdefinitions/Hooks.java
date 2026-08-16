package edu.pe.cibertec.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class Hooks {

    @Managed
    private WebDriver hisBrowser;

    @Before
    public void ponerEnEscenaAlActor() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Cliente").can(BrowseTheWeb.with(hisBrowser));
    }

    @After
    public void bajarDeEscena() {
        OnStage.drawTheCurtain();
    }
}
