package co.com.choucair.certification.falabella.stepdefinitions;

import co.com.choucair.certification.falabella.exceptions.Assertions;
import co.com.choucair.certification.falabella.models.RegistroModels;
import co.com.choucair.certification.falabella.questions.VerificarResultadoRegistro;
import co.com.choucair.certification.falabella.tasks.AbrirFormulario;
import co.com.choucair.certification.falabella.tasks.AbrirPagina;
import co.com.choucair.certification.falabella.tasks.RegistrarFormulario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static co.com.choucair.certification.falabella.exceptions.Assertions.MENSAJE_NO_ENCONTRADO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;


public class RegistroStepDefinitions {

    private RegistroModels registroModels;

    @Before
    public void configuracionBase() {
        setTheStage(new OnlineCast());
        registroModels = new RegistroModels();
    }

    @Given("^que el usuario se encuentra en la plataforma$")
    public void queElUsuarioSeEncuentraEnLaPlataforma() throws Exception {
        theActorCalled("Daniel").wasAbleTo(
                AbrirPagina.urlWeb(),
                AbrirFormulario.registro());
    }

    @When("^digita los campos con la información requerida y da clic en el botón Guardar$")
    public void digitaLosCamposConLaInformaciónRequeridaYDaClicEnElBotónGuardar() throws Exception {
        theActorInTheSpotlight().attemptsTo(
                RegistrarFormulario.informacion(registroModels)
        );
    }

    @Then("^Válido el mensaje \"([^\"]*)\"$")
    public void válidoElMensaje(String resultado) throws Exception {
        theActorInTheSpotlight().should(
                seeThat(VerificarResultadoRegistro.resultado(resultado))
                        .orComplainWith(Assertions.class, MENSAJE_NO_ENCONTRADO)
        );
    }
}
