package edu.pe.cibertec.screenplay.tasks;

import edu.pe.cibertec.screenplay.ui.RegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegistrarseComo implements Task {

    private final String firstName;
    private final String lastName;
    private final String email;
    private final String telephone;
    private final String password;

    public RegistrarseComo(String firstName, String lastName, String email,
                            String telephone, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.telephone = telephone;
        this.password = password;
    }

    public static RegistrarseComo con(String firstName, String lastName, String email,
                                       String telephone, String password) {
        return new RegistrarseComo(firstName, lastName, email, telephone, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(firstName).into(RegistroPage.FIRST_NAME),
                Enter.theValue(lastName).into(RegistroPage.LAST_NAME),
                Enter.theValue(email).into(RegistroPage.EMAIL),
                Enter.theValue(telephone).into(RegistroPage.TELEPHONE),
                Enter.theValue(password).into(RegistroPage.PASSWORD),
                Enter.theValue(password).into(RegistroPage.CONFIRM_PASSWORD)
        );
    }
}
