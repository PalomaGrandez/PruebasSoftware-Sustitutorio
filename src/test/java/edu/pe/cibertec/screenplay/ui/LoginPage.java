package edu.pe.cibertec.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target EMAIL =
            Target.the("campo Email").locatedBy("#input-email");

    public static final Target PASSWORD =
            Target.the("campo Password").locatedBy("#input-password");

    public static final Target LOGIN_BUTTON =
            Target.the("boton Login").locatedBy("css:input[value='Login']");

    public static final Target WARNING_MESSAGE =
            Target.the("mensaje de advertencia").locatedBy(".alert.alert-danger");

    public static final Target EDIT_ACCOUNT_LINK =
            Target.the("link editar cuenta").locatedBy("css:a[href*='route=account/edit']");

    public static final Target FIRST_NAME_FIELD =
            Target.the("campo Nombre en el header/cuenta").locatedBy("#input-firstname");
}
