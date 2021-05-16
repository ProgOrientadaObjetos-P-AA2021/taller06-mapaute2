/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

/**
 *
 * @author usuario
 */
public class Medico {
    
    private String nombreDoctor;
    private String especialidad;
    private double sueldoMensual;

    public Medico(String nom,double sueldo,String espe){
        nombreDoctor = nom;
        especialidad = espe;
        sueldoMensual = sueldo;
    }

    
    public void establecerNombreDoctor(String tipo){
        nombreDoctor = tipo;
    }
    public void establecerEspecialidad(String tipo){
        especialidad = tipo;
    }
    public void establecerSueldoMensual(double tipo){
        sueldoMensual = tipo;
    }
    
    public String obtenerNombreDoctor(){
        return nombreDoctor;
    }
    public String obtenerEspecialidad(){
        return especialidad;
    }
    public double obtenerSueldoMensual(){
        return sueldoMensual;
    }
}
