/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iniciosesion;

import java.util.Vector;

/**
 *Clase subclase que permite el registro y lanzara los valores a un vector de información 
 * @author mayme
 */
public class Registro extends IngresarCuenta{
    //Inicialización de variables
    private String nombre=null;
    private String email=null;
    private String contra=null;
    private String guia=null;
    
    //get y set para asignar un valor y retornar su contenido para que funcione la validación
    /**
     * Método para tomar el nombre ingresado por el usuario
     * @return 
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Metodo de asignacion de nombre al nuevo registro de usuario
     * @param nombre 
     */
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    /**
     * Método para tomar el correo electronico nuevo registro del usuario
     * @return 
     */
    public String getEmail(){
        return email;
    }
    /**
     *  Metodo de asignacion de email al registro de usuario
     * @param email 
     */
    public void setEmail(String email){
        this.email=email;
    }
    /**
     * Método para tomar el registro de la contrasenia el usuario ligado al email como entrada
     * @return 
     */
    public String getContra(){
        return contra;
    }
    /**
     *  Metodo de asignacion de contraseña al nuevo registro de usuario
     * @param contra 
     */
    public void setContra(String contra){
        this.contra=contra;
    }
    /**
     * Metodo para tomar el registro del numero identificador de guia / usuario
     * @return 
     */
    public String getGuia(){
        return guia;
    }
    /**
     *  Metodo de asignacion de numero de guia al nuevo registro de usuario
     * @param guia 
     */
    public void setGuia(String guia){
        this.guia=guia;
    }
    
    /**
     * Método para que no se registre el mismo correo 2 veces
     * @param email
     * @return 
     */
    public static int verificarUsuarioNuevo(String email){
        //Vector en la clase ListaRegistros
        Vector lista=mostrar();
        
        //Registro es el objeto llamado registro
        Registro registro;
        
        //Ciclo for que buscará en el vector si ya está un email para que no se repita
        for(int i=0;i<lista.size();i++){
            registro=(Registro) lista.elementAt(i);
            if(registro.getEmail().equalsIgnoreCase(email)){
                return i;
            }
        } 
        return -1;
    }
    
    /**
     * Método para dar ingreso al usuario
     * @param email
     * @param contra
     * @return 
     */
    public static int verificarInicio(String email, String contra){
        Vector lista=mostrar();
        Registro registro;
        
        //Contador for que buscará en el vector si el email y la contraseña coinciden
        for(int i=0;i<lista.size();i++){
            registro=(Registro) lista.elementAt(i);
            if(registro.getEmail().equalsIgnoreCase(email) && registro.getContra().equalsIgnoreCase(contra)){
                return i;
            }
        } 
        return -1;
    }
    
    
    /**
     * Metodo en donde permite ver la lista de los registros de usuario
     * @return 
     */
    public static Vector mostrar(){
        return ListaRegistros.mostrar();
    }
    public static Vector mostrarP(){
        return ListaRegistros.mostrarP();
    }
    public static Vector mostrarE(){
        return ListaRegistros.mostrarE();
    }
}
