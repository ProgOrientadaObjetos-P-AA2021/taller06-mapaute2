/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetedos;
import java.util.Scanner;
import paqueteuno.Ciudad;
import paqueteuno.Enfermera;
import paqueteuno.Medico;
import paqueteuno.Hospital;
/**
 *
 * @author usuario
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double sueldo,sueldo1;
        String nombreDoctor, especialidad;
        Medico [] medico;
        Enfermera [] enfermera;
        int num,num1,num3;
        String nombreEnfermera, contrato;
        String nombreHospital,direc,provincia,ciudad;
        
        System.out.println("Ingrese el nombre del hospital:");
        nombreHospital = entrada.nextLine();
        System.out.println("Ingrese la direccion del hospital:");
        direc = entrada.nextLine();
        
        
        System.out.println("Ingrese la ciudad del hospital:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese la Provincia del hospital:");
        provincia = entrada.nextLine();
        
        
        Ciudad ciudadd = new Ciudad (ciudad,provincia);
        
        System.out.println("Ingrese el número de especilidades:");
        num3 = entrada.nextInt();
        System.out.println("Ingrese el número de Doctor@s:");
        num = entrada.nextInt();
        System.out.println("Ingrese el número de Enfermer@s:");
        num1 = entrada.nextInt();
        
        entrada.nextLine();

        medico = new Medico[num];
                
        for (int i = 0; i < num; i++) {
            System.out.printf("Ingrese el nombre del doctor/a %d\n", i+1);
            nombreDoctor = entrada.nextLine();
            System.out.printf("Ingrese el sueldo mensual %d\n", i+1);
            sueldo = entrada.nextDouble();
            System.out.printf("Ingrese la especialidad %d\n", i+1);
            especialidad = entrada.nextLine();
            entrada.nextLine();

            Medico me = new Medico(nombreDoctor,sueldo,especialidad);
            
            medico[i] = me;
            
        }
        
        enfermera = new Enfermera[num1];
        
        for (int i = 0; i < num1; i++) {
            System.out.printf("Ingrese el nombre enfermero/a %d\n", i+1);
            nombreEnfermera = entrada.nextLine();
            System.out.printf("Ingrese el sueldo mensual %d\n", i+1);
            sueldo1 = entrada.nextDouble();
            System.out.printf("Ingrese el tipo de contrato %d\n", i+1);
            contrato = entrada.nextLine();
            entrada.nextLine();
        
            Enfermera en = new Enfermera(nombreEnfermera,sueldo1,contrato);
            
            enfermera[i] = en;
        }

        
        Hospital hospital = new Hospital(nombreHospital,direc,ciudadd,num3,enfermera,medico);

        hospital.establecerTotalSueldos();

        System.out.printf("\n%s\n", hospital);
        
    }
}