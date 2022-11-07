/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iniciosesion;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Viajando {
       static int opcion=0;
    static Scanner leer=new Scanner(System.in);
    static int tamanio=100;
    //arreglos para almacenar objetos 
    static Pasajero[] pasajeros=new Pasajero[tamanio];
    static Experiencia[] experiencia=new Experiencia[tamanio];
    //indice de los arreglos de objetos
    static int indicePasajero=0;
    static int indiceExperiencia=0;
    
    //objeto de la clase actual
    //para llamar a los metodos que no son 
    //estaticos
    static Viajando sistema=new Viajando();
    
    /**
     * Metodo principal de la clase principal
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ciclo selectivo
        do{
            //espera un enter
            //leer.nextLine();//getch()
            System.out.println("Bienvenidos");
            System.out.println("Opciones:");
            System.out.println("1. Alta triangulo");
            System.out.println("2. Alta rectangulo");
            System.out.println("3. El area mayor");
            System.out.println("4. Suma de areas de triangulos");
            System.out.println("5. Lista de area de rectangulos");
            System.out.println("6. Suma de perimetros");
            System.out.println("7. Salir");
            try{
                //leer la opcion
                opcion=leer.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("Tipo de dato incorrecto "+e.toString());
            }
            finally{
               // opcion=0;
               // System.out.println("hola");
               //espera un enter
               leer.nextLine();//getch()
            }
            //condicional multiple
            switch(opcion){
                case 1: 
                    //llamar el metodo
                    sistema.altaPasajero();
                    break;
                case 2:
                    //llamar el metodo 
                    altaExperiencia(); //metodo estatico, se puede llamar directamente
                    break;
              
                case 3:
                    listaPasajeros();
                    break;
                case 4:
                    listaExperiencias();//metodo estatico, se puede llamar directamente
                    break;  

                case 5:
                    System.out.println("Nos vemos");
                    break;
                default:
                    System.out.println("Opcion no valida");
                     
                    
            }//fin de la condicional multiple
            
            
        }while(opcion!=5);
        
    }//fin del metodo main
    
    /**
     * Metodo para dar de alta un triangulo
     */
    public void altaPasajero(){
        //crear el objeto en la posicion
        //correspondiente y guardar
        //en el arreglo de objetos
        pasajeros[indicePasajero]=new Pasajero();
        //incrementar la posicion en el arreglo 
        indicePasajero++;
    
    }//fin del metodo
    
    /**
     * Metodo para dar de alta un rectangulo
     */
    public static void altaExperiencia(){
        //crear el objeto en la posicion
        //correspondiente y guardar
        //en el arreglo de objetos
        experiencia[indiceExperiencia]=new Experiencia();
        //incrementar la posicion en el arreglo 
        indiceExperiencia++;
        
    }//fin del metodo

   
    
    /**
     * Metodo para listar el area de los rectangulos
     */
    public static void listaExperiencias(){
        
        //si ya hay rectangulos dados de alta 
        if(indiceExperiencia >0)
        {
            System.out.println("La lista del area de los triangulos es:");
            for(int i=0;i<indiceExperiencia;i++)
            {
                System.out.println("Experiencia "+(i+1)+" es "+experiencia[i].nomExperiencia);
            }//fin del for
        }
        else
            System.out.println("No has dado de alta experiencia");

    
}
     public static void listaPasajeros(){
        
        //si ya hay rectangulos dados de alta 
        if(indicePasajero >0)
        {
            System.out.println("La lista del area de los triangulos es:");
            for(int i=0;i<indicePasajero;i++)
            {
                System.out.println("Pasajero "+(i+1)+" es "+pasajeros[i].nombreP);
            }//fin del for
        }
        else
            System.out.println("No has dado de alta experiencia");

    
}
}
