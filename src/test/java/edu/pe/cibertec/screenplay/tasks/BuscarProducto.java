package edu.pe.cibertec.screenplay.tasks;

import edu.pe.cibertec.screenplay.ui.BusquedaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class BuscarProducto implements Task {

    private final String nombreProducto;

    public BuscarProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public static BuscarProducto conNombre(String nombreProducto) {
        return new BuscarProducto(nombreProducto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombreProducto).into(BusquedaPage.SEARCH_INPUT),
                Click.on(BusquedaPage.SEARCH_BUTTON)
        );
    }
}
