package edu.pe.cibertec.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;

public class BusquedaPage {

    public static final Target SEARCH_INPUT =
            Target.the("campo de busqueda").locatedBy("#search input[name='search']");

    public static final Target SEARCH_BUTTON =
            Target.the("boton de busqueda").locatedBy("#search button");

    public static final Target RESULT_PRODUCT_NAMES =
            Target.the("nombres de productos resultado").locatedBy(".product-layout .caption h4 a");

    public static final Target NO_RESULTS_MESSAGE =
            Target.the("mensaje sin resultados").locatedBy("#content p");
}
