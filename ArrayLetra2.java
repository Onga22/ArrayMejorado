
package domain;

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayLetra2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    
        System.out.println("Ingresa una cadena:");
        String cadena = sc.nextLine();
        System.out.println("Ingresa una letra para evaluar la cadena:");
        String letraUno = sc.nextLine();
        char letra= letraUno.charAt(0);
        int cont = 0;
        char[] arrayCadena = cadena.toCharArray();
        ArrayList<Integer> arrayPosiciones = new ArrayList();
        int valorAscii=0;           
        int contDos=0;
        
        for (int i = 0; i < letraUno.length(); i++) {
            contDos++;
            if(contDos>1){
                System.out.println("Error, ingreso mas de un caracter");
            }
            
        }
       
        for (int i = 0; i < arrayCadena.length; i++) {
            valorAscii= (int) letra;
           
             if(valorAscii<96||valorAscii>123){
            System.out.println("Error, el caracter ingresado no corresponde a una letra");
            break;
             }
             
             if (arrayCadena[i]==letra){
                 cont++;
                 arrayPosiciones.add(i);
                  System.out.println("La letra " + letra + " se repite " + cont + " veces y se encuentra en la posicion " + arrayPosiciones.toString());
                  break;
                 }
        }
               
                }
        
        }
        
    


    
       
             
             


             
        
        
        
    

