package com.cartelle.antonio;

import java.util.Scanner;

public class CalculaDistancia {
	Punto puntoA=new Punto();
	Punto puntoB=new Punto();
	
	


public double calcDistancia() {
	double resultado;
	Scanner sc=new Scanner(System.in);
	System.out.println("Introduzca la coordenada x del punto A");
	puntoA.x=sc.nextDouble();
	System.out.println("Introduzca la coordenada y del punto A");
	puntoA.y=sc.nextDouble();
	System.out.println("Introduzca la coordenada x del punto B");
	puntoB.x=sc.nextDouble();
	System.out.println("Introduzca la coordenada y del punto B");
	puntoB.y=sc.nextDouble();
	double op1=Math.pow((puntoB.x-puntoA.x),2);
	double op2=Math.pow((puntoB.y-puntoA.y),2);
	resultado=Math.sqrt((op1+op2));
	return resultado;
}

}
