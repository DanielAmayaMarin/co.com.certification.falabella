package co.com.choucair.certification.falabella.interactions;

import co.com.choucair.certification.falabella.models.RegistroModels;
import co.com.choucair.certification.falabella.utils.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.choucair.certification.falabella.userinterfaces.IFormularioRegistro.*;

public class RellenarDatosFormulario implements Interaction {

    private RegistroModels registroModels;

    public RellenarDatosFormulario(RegistroModels registroModels) {
        this.registroModels = registroModels;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(registroModels.getNombre()).into(INPUT_NOMBRE),
                Enter.theValue(registroModels.getApellidopaterno()).into(INPUT_APELLIDO_PATERNO),
                Enter.theValue(registroModels.getApellidomaterno()).into(INPUT_APELLIDO_MATERNO),
                Enter.theValue(registroModels.getEmail()).into(INPUT_EMAIL),
                Enter.theValue(registroModels.getClave()).into(INPUT_CLAVE),
                Enter.theValue(registroModels.getConfirmarclave()).into(INPUT_CONFIRMARCLAVE),
                //SelectFromOptions.byVisibleText(registroModels.getPaísderesidencia()).from(SELECT_PAIS),
                //SelectFromOptions.byVisibleText(registroModels.getTipodedocumento()).from(SELECT_TIPO_DOCUMENTO),
                Enter.theValue(registroModels.getNumerodedocumento()).into(INPUT_DOCUMENTO),
                Click.on(seleccionarGenero(registroModels.getGenero())),
                SelectFromOptions.byVisibleText(registroModels.getDia()).from(SELECT_DIA),
                SelectFromOptions.byVisibleText(registroModels.getMes()).from(SELECT_MES),
                SelectFromOptions.byVisibleText(registroModels.getAno()).from(SELECT_ANO),
                Enter.theValue(registroModels.getCelular()).into(INPUT_CELULAR),
                Check.whether(registroModels.isTerminos()).andIfSo(Click.on(CH_TERMINOS)),
                Click.on(BTN_GUARDAR)
        );
    }

    public static RellenarDatosFormulario ejecutar(RegistroModels registroModels) {
        return Tasks.instrumented(RellenarDatosFormulario.class, registroModels);
    }
}
