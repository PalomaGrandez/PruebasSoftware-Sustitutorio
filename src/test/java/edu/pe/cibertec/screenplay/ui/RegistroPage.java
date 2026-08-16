package edu.pe.cibertec.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;

public class RegistroPage {

    public static final Target FIRST_NAME =
            Target.the("campo Nombre").locatedBy("#input-firstname");

    public static final Target LAST_NAME =
            Target.the("campo Apellido").locatedBy("#input-lastname");

    public static final Target EMAIL =
            Target.the("campo Email").locatedBy("#input-email");

    public static final Target TELEPHONE =
            Target.the("campo Telefono").locatedBy("#input-telephone");

    public static final Target PASSWORD =
            Target.the("campo Password").locatedBy("#input-password");

    public static final Target CONFIRM_PASSWORD =
            Target.the("campo Confirmar Password").locatedBy("#input-confirm");

    public static final Target PRIVACY_POLICY =
            Target.the("checkbox Politica de privacidad").locatedBy("css:input[name='agree']");

    public static final Target CONTINUE_BUTTON =
            Target.the("boton Continue").locatedBy("css:input.btn.btn-primary[value='Continue']");

    public static final Target SUCCESS_MESSAGE =
            Target.the("mensaje de exito").locatedBy("#content h1");
}
