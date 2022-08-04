package co.com.choucair.certification.falabella.models;

import co.com.choucair.certification.falabella.utils.MetodoEspecial;

public class RegistroModels {

    private String nombre;
    private String apellidopaterno;
    private String apellidomaterno;
    private String email;
    private String clave;
    private String confirmarclave;
    private String paísderesidencia;
    private String tipodedocumento;
    private String numerodedocumento;
    private String genero;
    private String fechadenacimiento;
    private String mes;
    private String dia;
    private String ano;
    private String celular;
    private boolean terminos;

    public RegistroModels() {
        MetodoEspecial.confPropiedades();
        this.nombre = MetodoEspecial.properties.getProperty("nombre");
        this.apellidopaterno = MetodoEspecial.properties.getProperty("apellidopaterno");
        this.apellidomaterno = MetodoEspecial.properties.getProperty("apellidomaterno");
        this.email = MetodoEspecial.properties.getProperty("email");
        this.clave = MetodoEspecial.properties.getProperty("clave");
        this.confirmarclave = MetodoEspecial.properties.getProperty("confirmarclave");
        this.paísderesidencia = MetodoEspecial.properties.getProperty("paísderesidencia");
        this.tipodedocumento = MetodoEspecial.properties.getProperty("tipodedocumento");
        this.numerodedocumento = MetodoEspecial.properties.getProperty("numerodedocumento");
        this.genero = MetodoEspecial.properties.getProperty("genero");
        this.fechadenacimiento = MetodoEspecial.properties.getProperty("fechadenacimiento");
        this.mes = MetodoEspecial.properties.getProperty("mes");
        this.dia = MetodoEspecial.properties.getProperty("dia");
        this.ano = MetodoEspecial.properties.getProperty("ano");
        this.celular = MetodoEspecial.properties.getProperty("celular");
        this.terminos = Boolean.parseBoolean(MetodoEspecial.properties.getProperty("terminos"));
    }

    public RegistroModels(String email, String clave) {
        this.email = email;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidopaterno() {
        return apellidopaterno;
    }

    public String getApellidomaterno() {
        return apellidomaterno;
    }

    public String getEmail() {
        return email;
    }

    public String getClave() {
        return clave;
    }

    public String getConfirmarclave() {
        return confirmarclave;
    }

    public String getPaísderesidencia() {
        return paísderesidencia;
    }

    public String getTipodedocumento() {
        return tipodedocumento;
    }

    public String getNumerodedocumento() {
        return numerodedocumento;
    }

    public String getGenero() {
        return genero;
    }

    public String getFechadenacimiento() {
        return fechadenacimiento;
    }

    public String getMes() {
        return mes;
    }

    public String getDia() {
        return dia;
    }

    public String getAno() {
        return ano;
    }

    public String getCelular() {
        return celular;
    }

    public boolean isTerminos() {return terminos;}
}
