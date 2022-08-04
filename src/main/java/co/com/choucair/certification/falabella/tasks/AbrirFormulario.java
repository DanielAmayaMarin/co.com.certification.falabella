package co.com.choucair.certification.falabella.tasks;

import co.com.choucair.certification.falabella.interactions.EjecutarIngresoFormulario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class AbrirFormulario implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EjecutarIngresoFormulario.accion()
        );
    }

    public static AbrirFormulario registro() {
        return Tasks.instrumented(AbrirFormulario.class);
    }
}
