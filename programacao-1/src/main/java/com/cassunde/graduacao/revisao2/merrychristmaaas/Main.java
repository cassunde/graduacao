package com.cassunde.graduacao.revisao2.merrychristmaaas;

import java.util.Scanner;

public class Main{
    
	public static void main( String[] args ){
    	
		Scanner read = new Scanner(System.in);
        
        int intensity = read.nextInt();
        
        String a = "";
        
        for( int i = 1 ; i <= intensity; i++ ) {
        	
        	a += "a";
        }
        
        System.out.printf("Feliz nat%sl!\n",a);
    }
}