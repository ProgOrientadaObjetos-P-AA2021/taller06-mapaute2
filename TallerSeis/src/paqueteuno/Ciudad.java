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
public class Ciudad {
    
    private String nombreCiudad;
    private String nombreProvincia;
    
    public Ciudad(String nombre,String provincia){
        nombreCiudad = nombre;
        nombreProvincia = provincia;
    }
    
    public void establcerNombreCiudad(String tipo){
        nombreCiudad = tipo;
    }
    public void establecerNombreProvincia(String tipo){
        nombreProvincia = tipo;
    }
    
    public String obtenerNombreCiudad(){
        return nombreCiudad;
    }
    public String obtenerNombreProvincia(){
        return nombreProvincia;
    }
    
}
