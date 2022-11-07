/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iniciosesion;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Persona {
    String nombreP=null,emailP=null;
    int edad=0;
    Scanner leer=new Scanner(System.in);
    
    Persona(){
        this.nombreP=leer.nextLine();
        this.edad=leer.nextInt();
        this.emailP=leer.nextLine();
    }

    public String imprimir(){
        //System.out.println("-------------------------------------------");
        //System.out.println("Los datos del pax es: ");
        
        //String[] apellidos =new String[]{"\nNombre del político: "+this.apellidoP+" "+this.apellidoM+" "+this.nombre}; No le hagas caso a esto xD
        //Arrays.sort(apellidos);
        //System.out.println(apellidos);
       return "Nombre del Pax: "+nombreP+"email: "+emailP;
        
}
}

