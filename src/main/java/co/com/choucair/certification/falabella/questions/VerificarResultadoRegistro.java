package co.com.choucair.certification.falabella.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.certification.falabella.userinterfaces.IFormularioRegistro.LBL_MENSAJE;

public class VerificarResultadoRegistro implements Question {

    private final String resultado;

    public VerificarResultadoRegistro(String resultado) {
        this.resultado = resultado;
    }

    @Override
    public Object answeredBy(Actor actor) {
        String texto = Text.of(LBL_MENSAJE).viewedBy(actor).asString();
        return resultado.equals(texto);
    }

    public static VerificarResultadoRegistro resultado(String resultado) {
        return new VerificarResultadoRegistro(resultado);
    }

}
