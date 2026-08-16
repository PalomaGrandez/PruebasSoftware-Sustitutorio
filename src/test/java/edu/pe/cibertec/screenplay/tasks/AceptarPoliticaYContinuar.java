package edu.pe.cibertec.screenplay.tasks;

import edu.pe.cibertec.screenplay.ui.RegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AceptarPoliticaYContinuar implements Task {

    public static AceptarPoliticaYContinuar aceptarPolitica() {
        return new AceptarPoliticaYContinuar(false);
    }

    public static AceptarPoliticaYContinuar hacerClicEnContinuar() {
        return new AceptarPoliticaYContinuar(true);
    }

    private final boolean clicEnContinuar;

    private AceptarPoliticaYContinuar(boolean clicEnContinuar) {
        this.clicEnContinuar = clicEnContinuar;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (clicEnContinuar) {
            actor.attemptsTo(Click.on(RegistroPage.CONTINUE_BUTTON));
        } else {
            actor.attemptsTo(Click.on(RegistroPage.PRIVACY_POLICY));
        }
    }
}
