package co.com.choucair.certification.falabella.tasks;

import co.com.choucair.certification.falabella.userinterfaces.IPaginaFalabella;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task {

    private IPaginaFalabella iPaginaFalabella;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(iPaginaFalabella)
        );
    }

    public static AbrirPagina urlWeb() {
        return Tasks.instrumented(AbrirPagina.class);
    }

}
