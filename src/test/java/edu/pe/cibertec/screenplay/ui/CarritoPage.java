package edu.pe.cibertec.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoPage {

    public static final Target CART_HEADER_COUNT =
            Target.the("contador del carrito en el header").locatedBy("#cart-total");

    public static final Target CART_NAV_TOGGLE =
            Target.the("boton para abrir el carrito").locatedBy("#cart > button");

    public static final Target CART_VIEW_CART_LINK =
            Target.the("link ver carrito").locatedBy("#cart a[href*='route=checkout/cart']");

    public static final Target CART_ITEM_NAMES =
            Target.the("nombres de productos en el carrito").locatedBy("#content table.table td.text-left a, .table-responsive td a");
}
