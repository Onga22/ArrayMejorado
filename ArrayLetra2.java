
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
        int contDos=0;
        int contUno=1;
        boolean imp = true;
        
        for (int i = 0; i < letraUno.length(); i++) {
            contDos++;
            if(contDos>contUno){
            imp=false;
                System.out.println("Error, ingreso mas de un caracter. Por favor vuelva a intentarlo!! ");
                break;
            }
         }
       
        for (int i = 0; i < arrayCadena.length; i++) {
             int valorAscii= (int) letra;
           
             if(valorAscii<96||valorAscii>123){
                 imp=false;
            System.out.println("Error, ingreso un valor numerico, un carecter en  mayuscula o  algun signo. Por favor vuelva a intentarlo!! ");
            break;
             }
            if (arrayCadena[i]==letra){
                 cont++;
                 arrayPosiciones.add(i);
                           }
              }
        
            if(imp==true){
               System.out.println("La letra " + letra + " se repite " + cont + " veces y se encuentra en la posicion " + arrayPosiciones.toString());
        
                }
    
        }
}
    


    
       
             
             


             
        
        
        
    

