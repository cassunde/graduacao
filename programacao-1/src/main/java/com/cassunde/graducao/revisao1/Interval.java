package com.cassunde.graducao.revisao1;

import java.util.Scanner;

public class Interval{
    
	public static void main( String[] args ){
    	
		try {
			
			double a;
			
			Scanner read = new Scanner(System.in);
	        
	        System.out.printf("Informe o número para a:\n");
	        a = read.nextDouble();
	        
	        if( a < 0 || a > 100 ) {
	        	System.err.println();
	        	intervalException("Fora do Intervalo");
	        }
	        
	        String interval =  "";
	        
	        if( a > 0 && a <= 25 ) {
	        	interval =  "Intervalo [0,25]";	
	        }
	        
	        if( a > 25 && a <= 50 ) {
	        	interval =  "Intervalo (25,50]";	
	        }
	        
	        if( a > 50 && a <= 75 ) {
	        	interval =  "Intervalo (50,75]";	
	        }
			
	        if( a > 75 && a <= 100 ) {
	        	interval =  "Intervalo (50,100]";	
	        }
	        
	        System.out.println(interval);
	        read.close();
		} catch (Exception e) {
			
			System.err.println("Problema Encontrado: " + e.getMessage() );
		}
    }

	private static void intervalException(String message) throws Exception {
		throw new Exception(message);
	}
}
