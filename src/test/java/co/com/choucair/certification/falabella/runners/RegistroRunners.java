package co.com.choucair.certification.falabella.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = SnippetType.CAMELCASE,
        features = {
              "src/test/resources/feature/registro.feature"
        },
        glue = {"co.com.choucair.certification.falabella.stepdefinitions"}
)
public class RegistroRunners {
        
}
