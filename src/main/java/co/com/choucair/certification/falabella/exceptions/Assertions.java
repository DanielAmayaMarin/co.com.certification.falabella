package co.com.choucair.certification.falabella.exceptions;

public class Assertions extends AssertionError {

    public static final String MENSAJE_NO_ENCONTRADO = "El proceso no culminó exitosamente, La validación del mensaje no fue correcta";

    public Assertions(String message, Throwable cause) {
        super(message, cause);
    }

    public Assertions(String message) {
        super(message);
    }
}
