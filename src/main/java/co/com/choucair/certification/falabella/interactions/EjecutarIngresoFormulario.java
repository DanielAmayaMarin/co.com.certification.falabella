package co.com.choucair.certification.falabella.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.choucair.certification.falabella.userinterfaces.IPaginaFalabella.BTN_INICIAR_SESION;
import static co.com.choucair.certification.falabella.userinterfaces.IPaginaFalabella.BTN_REGISTRO;

public class EjecutarIngresoFormulario implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_INICIAR_SESION),
                Click.on(BTN_REGISTRO)
        );
    }

    public static EjecutarIngresoFormulario accion() {

        return Tasks.instrumented(EjecutarIngresoFormulario.class);
    }
}
