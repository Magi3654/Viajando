/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iniciosesion;
import java.util.Vector;
/**
 *Clase donde se reciben los datos y se almancenan en vectores para crear una base de datos de usurarios
 * @author Mayra e Ilse Machado
 */

//El vector nos servirá como un arreglo o base de datos para guardar a los usuarios
public class ListaRegistros {
    
    //El vector contendrá los datos guardados en el objeto Registro
    private static Vector<Registro> datos = new Vector<Registro>();
    /**
     * Método para agregar dato del registro del usuario
     * @param registro 
     */
        public static void agregar (Registro registro){
            datos.addElement(registro);
        }
        /**
         * Método para eliminar dato del registro 
         * @param pos 
         */
        public static void eliminar (int pos){ //pos es Posición
            datos.removeElement(pos);
        }
        /**
         * Método para desplegar dato del registro 
         * @return 
         */
        public static Vector mostrar (){
            return datos;
        }

        
        private static Vector<Pasajero> datosP = new Vector<Pasajero>();
    /**
     * Método para agregar dato del registro del usuario
     * @param registro 
     */
        public static void agregarP (Pasajero pasajero){
            datosP.addElement(pasajero);
        }
        /**
         * Método para eliminar dato del registro 
         * @param pos 
         */
        public static void eliminarP (int pos){ //pos es Posición
            datosP.removeElement(pos);
        }
        /**
         * Método para desplegar dato del registro 
         * @return 
         */
        public static Vector mostrarP (){
            return datosP;
        }
        
        
        private static Vector<Experiencia> datosE = new Vector<Experiencia>();
    /**
     * Método para agregar dato del registro del usuario
     * @param registro 
     */
        public static void agregarE (Experiencia experiencia){
            datosE.addElement(experiencia);
        }
        /**
         * Método para eliminar dato del registro 
         * @param pos 
         */
        public static void eliminarE (int pos){ //pos es Posición
            datosE.removeElement(pos);
        }
        /**
         * Método para desplegar dato del registro 
         * @return 
         */
        public static Vector mostrarE (){
            return datosE;
        }
        
}
