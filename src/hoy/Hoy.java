/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoy;

import java.util.Scanner;
import jugadores.Jugador;

/**
 *
 * @author ADMIN
 */


public class Hoy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        int opcion;
        int contador=0;
        Jugador[] empleados= new Jugador[10];
        do{
            
            System.out.println("Bienvenido");
            System.out.println("***************");
            
            System.out.println("1. Agregar Jugador");
            System.out.println("2. Buscar Jugador");
            System.out.println("3. Mostrar Jugador");
            System.out.println("4. salir");
            System.out.print("Digite una opcion: ");
            opcion=entrada.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Registro de empleado: ");
                    System.out.println("");
                    
                    empleados[contador]=new Jugador();
                    
                    empleados[contador].setId(contador);
                    
                    System.out.println("Digite el nombre: ");
                    empleados[contador].setNombre(entrada.next());
                    
                    //aca pido los otros datos
                    
        
                    
                    contador=contador+1;
                    
                    break;
                case 2:
                    System.out.println("entro opcion 2");
                    break;
                case 3:
                    System.out.println("Base datos empleados");
                    System.out.println("");
                    
                    System.out.println("digita el jugador que quieres buscar");
                    //int buscador=entrada.nextInt();
                    
                    for(int i=0; i<contador;i++){
                        
                        /*if(buscador==empleados[i].getId()){
                            
                        }*/
                        System.out.println(empleados[i].getNombre());
                        
                       //aca cargo los otros datos
                        System.out.println("");
                            
                    }
                    
                    break;
               
                    
                case 4:
                    System.exit(0);
                    break;
                    
                default:
                    break;
                
                    
                
            }
            
            
            
        }while(opcion!=5);
        
        
    }
    
}