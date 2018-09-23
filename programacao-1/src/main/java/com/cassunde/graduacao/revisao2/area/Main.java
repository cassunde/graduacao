package com.cassunde.graduacao.revisao2.area;

import java.util.Scanner;

public class Main{
    
	public static void main( String[] args ){
    	
		Scanner read = new Scanner(System.in);
	     
        double pi = 3.14159;
        
        double a = read.nextDouble();
        double b = read.nextDouble();
        double c = read.nextDouble();
        
        double areaRectangledTriangle = ( a * c ) / 2;
        double areaCicle = (c * c) * pi;
        double areaTrapezium = (( a + b ) * c ) / 2; 
        double areaSquare = b * b; 
        double areaRectangle = a * b;
        
        System.out.printf("TRIANGULO: %.3f\n",areaRectangledTriangle);
        System.out.printf("CIRCULO: %.3f\n", areaCicle);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezium);
        System.out.printf("QUADRADO: %.3f\n", areaSquare);
        System.out.printf("RETANGULO: %.3f\n", areaRectangle);
    }
}
