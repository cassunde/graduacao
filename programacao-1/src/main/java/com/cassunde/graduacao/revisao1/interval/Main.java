package com.cassunde.graduacao.revisao1.interval;

import java.util.Scanner;

public class Main{
    
	public static void main( String[] args ){
    	
		Scanner read = new Scanner(System.in);
        
        double a = read.nextDouble();
        
        if( a >= 0 && a <= 100 ) {
        	if( a >= 0 && a <= 25 ) {
            	System.out.println("Intervalo [0,25]");
            }
            if( a > 25 && a <= 50 ) {
            	System.out.println("Intervalo (25,50]");
            }
            if( a > 50 && a <= 75 ) {
            	System.out.println("Intervalo (50,75]");
            }
            if( a > 75 && a <= 100 ) {
            	System.out.println("Intervalo (75,100]");
            }
        }else {
        	System.out.println("Fora de intervalo");
        }
    }
}
