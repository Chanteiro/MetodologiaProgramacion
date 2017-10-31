
package prog02_ejer08;

import java.util.Scanner;

/**
 *
 * @author ANTONIO CARTELLE CASAS
 * @class PROG02_Ejer08
 * @description Operaciones matemáticas básicas sobre dos números introducidos por teclado
 */
public class PROG02_Ejer08 {

  
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       float x,y;
       
       System.out.println("Introduzca el primer operando: ");
       x=s.nextFloat();
       System.out.println("Introduzca el segundo operando: ");
       y=s.nextFloat();
       System.out.println("x= "+x+" y= "+y);
       System.out.println("x + y = " +(x+y));
       System.out.println("x - y = " +(x-y));
       System.out.println("x * y = " +(x*y));
       System.out.println("x / y = " +(x/y));
       System.out.println("x ^ 2 = " +(Math.pow(x, 2.0)));
       System.out.println("\u221Ax = "+ Math.sqrt(x));
    }
    
}
