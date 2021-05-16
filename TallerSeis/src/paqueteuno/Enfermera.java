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
public class Enfermera {
    
    private String nombreEnfermera;
    private String contrato;
    private double sueldoEnfermera;
    
    public Enfermera(String nom,double sueldo,String con){
        nombreEnfermera = nom;
        sueldoEnfermera = sueldo;
        contrato = con;
    }
    
    public void establecerNombreEnfermera(String tipo){
        nombreEnfermera = tipo;
    }
    public void establecerContrato(String tipo){
        contrato = tipo;
    }
    public void establecerSueldoEnfermera(double tipo){
        sueldoEnfermera = tipo;
    }
    
    public String obtenerNombreEnfermera(){
        return nombreEnfermera;
    }
    public String obtenerContrato(){
        return contrato;
    }
    public double obtenerSueldoEnfermera(){
        return sueldoEnfermera;
    }
}
