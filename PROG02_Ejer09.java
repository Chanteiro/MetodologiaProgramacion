
package prog02_ejer09;

import java.util.Scanner;

/**
 *
 * @author ANTONIO CARTELLE CASAS
 * @class PROG02_Ejer09
 * @description El programa solicita un número de 5 dígitos por pantalla y 
 * lo imprime por consola intercalando un espacio en blanco entre cada uno de sus dígitos
 */
public class PROG02_Ejer09 {

   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int numero;
      String num;
      String blanco=" ";
      System.out.println("Introduzca un número de 5 dígitos");
      numero=sc.nextInt();
      num=Integer.toString(numero);
      if(num.length()==5){
          String[] c=new String[5];
          for(int i =0;i<num.length();i++){
              c[i]=num.charAt(i)+" ";
              System.out.print(c[i]);
            }
            System.out.print("\n");
         
         }else{
          System.out.println("El número no es válido");
      }
    }
    
}
