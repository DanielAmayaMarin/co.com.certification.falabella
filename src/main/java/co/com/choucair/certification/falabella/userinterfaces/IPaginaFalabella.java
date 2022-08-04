package co.com.choucair.certification.falabella.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://www.falabella.com.co/falabella-co")
public class IPaginaFalabella extends PageObject {
    public static final Target BTN_INICIAR_SESION = Target.the("Iniciar sesion").located(By.xpath("//*[@id=\"testId-UserAction-userinfo\"]/div/div[2]"));
    public static final Target BTN_REGISTRO = Target.the("Registrar").located(By.xpath("//*[@id=\"testId-cc-login-form\"]/form/div[3]/p/a"));
}
