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
public class Hospital {
    
    private String nombreHospital;
    private Ciudad nombreCiudad;
    private int numEspecialidades;
    private Medico[] conjuntoMedicos; 
    private Enfermera [] conjuntoEnfermeras;
    private double totalSueldos;
    private String direccionHospital;
    
    public Hospital(String nombre,String dire, Ciudad ciudad, int num,
            Enfermera[] enfer,Medico[] me){
        nombreHospital = nombre;
        nombreCiudad = ciudad;
        numEspecialidades = num;           
        direccionHospital = dire;
        conjuntoEnfermeras = enfer;
        conjuntoMedicos = me;
                         
    }
    
    public void establecerNombreHospital(String tipo){
        nombreHospital = tipo;
    }
    public void establecerNombreCiudad(Ciudad tipo){
        nombreCiudad = tipo;
    }
    public void establecerNumEspecialidades(int tipo){
        numEspecialidades = tipo;
    }
    public void establecerConjuntoMedicos(Medico[] tipo){
        conjuntoMedicos = tipo;
    }
    public void establecerConjuntoEnfermeras(Enfermera [] tipo){
        conjuntoEnfermeras = tipo;
    }
    public void establecerTotalSueldos(){
        double suma = 0;
        double suma2 = 0;
        for (int i = 0; i < obtenerConjuntoMedicos().length; i++) {
            suma = suma + obtenerConjuntoMedicos()[i].obtenerSueldoMensual();
        }
        for (int i = 0; i < obtenerConjuntoEnfermeras().length; i++) {
            suma = suma + obtenerConjuntoEnfermeras()[i].obtenerSueldoEnfermera();
        }
        
        totalSueldos = suma + suma2;
    }
    public void establecerDireccionHospital(String tipo){
        direccionHospital = tipo;
    }
    
    public String obtenerNombreHospital(){
        return nombreHospital;
    }
    public Ciudad obtenerNombreCiudad(){
        return nombreCiudad;
    }
    public int obtenernumEspecialidades(){
        return numEspecialidades;
    }
    public Medico[] obtenerConjuntoMedicos(){
        return conjuntoMedicos;
    }
    public Enfermera [] obtenerConjuntoEnfermeras(){
        return conjuntoEnfermeras;
    }
    public double obtenerTotalSueldos(){
        return totalSueldos;
    }
    public String obtenerDireccionHospital(){
        return direccionHospital;
    }
    
    @Override
    public String toString(){
        String cadena = "Datos del Hospita\n";
        cadena = String.format("%s%s\nDirección: %s\nCiudad: %s\n"
                + "Provincia: %s\n"
                + "Número de especialidades: %d\n"
                + "Listado de médicos\n",cadena,
                obtenerNombreHospital(),obtenerDireccionHospital(),
                obtenerNombreCiudad().obtenerNombreCiudad(),
                obtenerNombreCiudad().obtenerNombreProvincia(),
                obtenernumEspecialidades());
        
        for (int i=0;i<obtenerConjuntoMedicos().length;i++){
            cadena = String.format("%s-%s - Sueldo: %.2f - %s\n",cadena,
                    obtenerConjuntoMedicos()[i].obtenerNombreDoctor(),
                    obtenerConjuntoMedicos()[i].obtenerSueldoMensual(),
                    obtenerConjuntoMedicos()[i].obtenerEspecialidad());
        }
        cadena = String.format("%sListado de enfermeros(as)\n",cadena);
        for (int i=0;i<obtenerConjuntoEnfermeras().length;i++){
            cadena = String.format("%s-%s - Sueldo: %.2f - %s\n",cadena,
                    obtenerConjuntoEnfermeras()[i].obtenerNombreEnfermera(),
                    obtenerConjuntoEnfermeras()[i].obtenerSueldoEnfermera(),
                    obtenerConjuntoEnfermeras()[i].obtenerContrato());
        }
        
        cadena = String.format("%sTotal de sueldos a pagar por mes: %.2f\n",cadena,
                obtenerTotalSueldos());
        
        return cadena;
    }
    
    
    
}
