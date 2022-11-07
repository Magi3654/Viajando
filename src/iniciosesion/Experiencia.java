/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iniciosesion;

import static iniciosesion.Registro.mostrarE;
import java.util.Scanner;
import java.util.Vector;

/**
 *Clase creadora de objeto experiencia
 * @author HP
 */
public class Experiencia extends AltaExperiencia{
    static String nomExperiencia=null, zona=null, diasOperacion=null, maxPax=null, dia=null, mes=null;
    
    
   /* Experiencia(){
        this.nomExperiencia=leer.nextLine();
        this.diasOperacion=leer.nextLine();
        this.zona=leer.nextLine();
        this.maxPax=leer.nextLine();
    }
    
    /**
     * Método para tomar el nombre ingresado por el usuario
     * @return 
     */
    public String getNombreE(){
        return nomExperiencia;
    }
    /**
     * Metodo de asignacion de nombre al nuevo registro de usuario
     * @param nomExperiencia 
     */
    public void setNombreE(String nomExperiencia){
        this.nomExperiencia=nomExperiencia;
    }
    /**
     * Método para tomar el correo electronico nuevo registro del usuario
     * @return 
     */
    public String getZona(){
        return zona;
    }
    /**
     *  Metodo de asignacion de email al registro de usuario
     * @param zona 
     */
    public void setZona(String zona){
        this.zona=zona;
    }
    /**
     * Método para tomar el registro de la contrasenia el usuario ligado al email como entrada
     * @return 
     */
    /*public String getDias(){
        return diasOperacion;
    }*/
    
    public String getDia(){
        return dia;
    }
    /**
     *  Metodo de asignacion de email al registro de usuario
     * @param zona 
     */
    public void setDia(String dia){
        this.dia=dia;
    }
    
    public String getMes(){
        return mes;
    }
    /**
     *  Metodo de asignacion de email al registro de usuario
     * @param zona 
     */
    public void setMes(String mes){
        this.mes=mes;
    }
    /**
     *  Metodo de asignacion de contraseña al nuevo registro de usuario
     * @param diasOperacion 
     */
    /*public void setDias(String diasOperacion){
        this.diasOperacion=diasOperacion;
    }*/
    
    public String getMaxPax(){
        return maxPax;
    }
    public void setMaxPax(String maxPax){
        this.maxPax=maxPax;
    }

    
    public static int verificarExpericenciaNueva(String nomExperiencia){
        //Vector en la clase ListaRegistros
        Vector listaE=mostrarE();
        
        //Registro es el objeto llamado experiencia
        Experiencia experiencia;
        
        //Ciclo for que buscará en el vector si ya está una experiencia para que no se repita
        for(int i=0;i<listaE.size();i++){
            experiencia=(Experiencia) listaE.elementAt(i);
            if(experiencia.getNombreE().equalsIgnoreCase(nomExperiencia)){
                return i;
            }
        } 
        return -1;
    }
    public static Vector mostrarE(){
        return ListaRegistros.mostrarE();
    }
   
}
