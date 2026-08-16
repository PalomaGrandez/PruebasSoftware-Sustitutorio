package edu.pe.cibertec.screenplay.questions;

import edu.pe.cibertec.screenplay.ui.BusquedaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.ArrayList;
import java.util.List;

public class ResultadosDeBusqueda implements Question<List<String>> {

    public static ResultadosDeBusqueda mostrados() {
        return new ResultadosDeBusqueda();
    }

    @Override
    public List<String> answeredBy(Actor actor) {
        return new ArrayList<>(Text.ofEach(BusquedaPage.RESULT_PRODUCT_NAMES).answeredBy(actor));
    }
}
