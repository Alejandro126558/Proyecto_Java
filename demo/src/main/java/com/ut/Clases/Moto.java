package com.ut.Clases;

public class Moto {
    //Atributos de clase//
    private Boolean combustible;
    private String cilindraje;
    private String marca;
    private String color;
    private Integer año;
    private Boolean estado;

    
    //constructor//
    public Moto(){
        combustible = true;
        cilindraje = "100";
        marca = "yamaha";
        color = "rojo";
        año = 2001;
        estado = false;
    }
    public Moto(Boolean combustible){
        this.combustible = combustible;
    }
    
}
