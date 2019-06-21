/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_de_pacientes;

import java.io.Serializable;

/**
 *
 * @author ariel
 */
public class Paciente implements Serializable{
    
    private String identifcacion;
    private String nombre;
    private int edad;
    private double peso;
    private double talla;
    private String Sala;

    public Paciente(String identifcacion, String nombre, int edad, double peso, double talla, String Sala) {
        this.identifcacion = identifcacion;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.talla = talla;
        this.Sala = Sala;
    }

    public String getIdentifcacion() {
        return identifcacion;
    }

    public void setIdentifcacion(String identifcacion) {
        this.identifcacion = identifcacion;
    }

  
    public String getNombre() {
        return nombre;
    }

    public void setName(String name) {
        this.nombre = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public String getSala() {
        return Sala;
    }

    public void setSala(String Sala) {
        this.Sala = Sala;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
