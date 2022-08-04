package co.com.choucair.certification.falabella.tasks;

import co.com.choucair.certification.falabella.interactions.RellenarDatosFormulario;
import co.com.choucair.certification.falabella.models.RegistroModels;
import co.com.choucair.certification.falabella.utils.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class RegistrarFormulario implements Task {

    private RegistroModels registroModels;

    public RegistrarFormulario(RegistroModels registroModels) {
        this.registroModels = registroModels;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                RellenarDatosFormulario.ejecutar(registroModels),
                Esperar.milisegundos(10)
        );
    }

    public static RegistrarFormulario informacion(RegistroModels registroModels) {
        return Tasks.instrumented(RegistrarFormulario.class, registroModels);
    }
}
