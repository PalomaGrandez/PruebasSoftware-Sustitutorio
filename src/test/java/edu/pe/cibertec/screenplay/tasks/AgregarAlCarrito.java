package edu.pe.cibertec.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class AgregarAlCarrito implements Task {

    private final String nombreProducto;

    public AgregarAlCarrito(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public static AgregarAlCarrito producto(String nombreProducto) {
        return new AgregarAlCarrito(nombreProducto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Target botonDelProducto = Target.the("boton agregar al carrito de " + nombreProducto)
                .locatedBy(
                        "//div[contains(@class,'product-layout')][.//h4/a[contains(text(),'" + nombreProducto + "')]]" +
                        "//button[contains(@onclick,'cart.add')]"
                );
        actor.attemptsTo(Click.on(botonDelProducto));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
