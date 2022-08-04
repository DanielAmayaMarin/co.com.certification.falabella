package co.com.choucair.certification.falabella.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.Objects;

public class IFormularioRegistro {

    public static final Target INPUT_NOMBRE = Target.the("Input nombre").located(By.id("user"));
    public static final Target INPUT_APELLIDO_PATERNO = Target.the("Input apellido paterno").located(By.id("apellidopaterno"));
    public static final Target INPUT_APELLIDO_MATERNO = Target.the("Input apellido materno").located(By.id("apellidomaterno"));
    public static final Target INPUT_EMAIL = Target.the("Input email").located(By.id("mail"));
    public static final Target INPUT_CLAVE = Target.the("Input clave").located(By.id("clave1"));
    public static final Target INPUT_CONFIRMARCLAVE = Target.the("Input confirmar clave").located(By.id("clave2"));
    public static final Target SELECT_PAIS = Target.the("Select pais de residencia").located(By.id("status"));
    public static final Target SELECT_TIPO_DOCUMENTO = Target.the("Select tipo de documento").located(By.id("cedula"));
    public static final Target INPUT_DOCUMENTO = Target.the("Input documento").located(By.id("cedula_colombia"));
    public static final Target SELECT_DIA = Target.the("Select dia").located(By.id("day"));
    public static final Target SELECT_MES = Target.the("Select mes").located(By.id("month"));
    public static final Target SELECT_ANO = Target.the("Select año").located(By.id("year"));
    public static final Target INPUT_CELULAR = Target.the("Input celular").located(By.id("celular"));
    public static final Target CH_TERMINOS = Target.the("CheckBox Termonos").located(By.id("agreelegaleId"));
    public static final Target BTN_GUARDAR = Target.the("Boton guardar").located(By.id("boton_Ar"));
    public static Target seleccionarGenero(String opcion){
        if(Objects.equals(opcion, "Hombre")){
            return Target.the("opcion seleccionada").located(By.xpath("//body/div[@id='contenedorPrincipal']/div[@id='contRegistro']/div[@id='contRegistroInfo']/form[@id='form51']/div[9]/div[1]/div[1]/label[1]/input[1]"));
        }else {
            return Target.the("opcion seleccionada").located(By.id("//body/div[@id='contenedorPrincipal']/div[@id='contRegistro']/div[@id='contRegistroInfo']/form[@id='form51']/div[9]/div[1]/div[1]/label[2]/input[2]"));
        }
    }
    public static final Target LBL_MENSAJE = Target.the("Mensaje de satisfacción").located(By.xpath("//*[@id=\"contRegistroInfo\"]/div/div[1]/p"));

}
