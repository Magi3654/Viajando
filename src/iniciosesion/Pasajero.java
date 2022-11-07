/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iniciosesion;

//import static iniciosesion.Registro.mostrarP;
import java.util.Vector;

/**
 *
 * @author HP
 */
public class Pasajero extends AltaPasajeros {
    static String nombreP=null;
    static String emailP=null;
    static String metodoPago=null;
    static String tour=null;
   /* Pasajero(){
        super();
        this.metodoPago=leer.nextLine();
        
    }*/
    
    public String getNombreP(){
        return nombreP;
    }
    public void setNombreP(String nombre){
        this.nombreP=nombreP;
    }
    public String getEmailP(){
        return emailP;
    }
    public void setEmailP(String emailP){
        this.emailP=emailP;
    }
    public String getMetodoPago(){
        return metodoPago;
    }
    public void setMetodoPago(String metodoPago){
        this.metodoPago=metodoPago;
    }
    public String getTour(){
        return tour;
    }
    public void setTour(String tour){
        this.tour=tour;
    }
    
     public static int verificarPasajeroNuevo(String emailP){
        //Vector en la clase ListaRegistros
        Vector listaP=mostrarP();
        
        //Registro es el objeto llamado pasajero
        Pasajero pasajero;
        
        //Ciclo for que buscará en el vector si ya está un email para que no se repita
        for(int i=0;i<listaP.size();i++){
            pasajero=(Pasajero) listaP.elementAt(i);
            if(pasajero.getEmailP().equalsIgnoreCase(emailP)){
                return i;
            }
        } 
        return -1;
    }
     
     public static int tamanoPasajeros(){
        //Vector en la clase ListaRegistros
        Vector listaP=mostrarP();
        //Registro es el objeto llamado pasajero
        int tamanoPasajeros=0;
        Pasajero pasajero;
    
        for(int f=0;f<listaP.size();f++) {
        tamanoPasajeros=listaP.size();
        }
        return tamanoPasajeros;
    }
    
    
    /**
     *
     * @return
     */
     
    /*public String imprimir(){
        super.imprimir();//Se manda llamar el metodo imprimir de la superclase
     
        return "Metodo de pago: "+metodoPago; 
    }*/

    public static Vector mostrarP(){
        return ListaRegistros.mostrarP();
    }
}
