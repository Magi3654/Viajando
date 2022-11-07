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
public class Guia extends Persona {
    String ruta=null, diasTrabajo=null;
    Scanner leer=new Scanner(System.in);
    
    Guia(){
        super();
        this.ruta=leer.nextLine();
        this.diasTrabajo=leer.nextLine();
        
    }
    @Override
    public String imprimir(){
        super.imprimir();//Se manda llamar el metodo imprimir de la superclase
    
        return "Ruta: "+ruta+"Dias de Trabajo: "+diasTrabajo;
}
}
