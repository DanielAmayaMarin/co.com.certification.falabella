package co.com.choucair.certification.falabella.utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class MetodoEspecial {

    public static Properties properties;

    public static void confPropiedades(){
        properties = new Properties();
        try {
            properties.load(new FileReader("conf.properties"));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
