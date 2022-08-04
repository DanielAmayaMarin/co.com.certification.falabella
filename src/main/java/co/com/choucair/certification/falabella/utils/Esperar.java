package co.com.choucair.certification.falabella.utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Esperar implements Task {

    private long milisegundos;

    public Esperar(long tiempo){
        this.milisegundos = tiempo;
    }

    public static Esperar milisegundos(long tiempo){
        return Tasks.instrumented(Esperar.class,tiempo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        milisegundos = milisegundos * 1000;
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}