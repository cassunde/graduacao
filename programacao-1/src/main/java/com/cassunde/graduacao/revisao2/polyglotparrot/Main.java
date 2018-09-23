package com.cassunde.graduacao.revisao2.polyglotparrot;

import java.util.Scanner;

public class Main{
    
	public static void main( String[] args ){
    	
		Scanner read = new Scanner(System.in);
        
        String leg = read.nextLine();
        
        if( leg.equals("esquerda") ) {
        	System.out.println("ingles");
        }else {
        	if( leg.equals("direita") ) {
            	System.out.println("frances");
            }else {
            	if( leg.equals("nenhuma") ) {
                	System.out.println("portugues");
                }else{
                	if( leg.equals("as duas")) {
                    	System.out.println("caiu");
                    }else {
                    	System.out.println("");
                    }        	
                }    	
            }	
        }
    }	
}