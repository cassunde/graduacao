package com.cassunde.graducao.revisao1;

import java.util.Scanner;

public class MultiplicationTable{
    
	public static void main( String[] args ){
    	
		try {
			
			int a;
			
			Scanner read = new Scanner(System.in);
	        
	        System.out.printf("Informe o número para a:\n");
	        a = read.nextInt();
	        
	        if( a < 1 || a > 1000 ) {
	        	System.err.println();
	        	intervalException("Fora do Intervalo");
	        }
	        
	        for( int i = 1; i <= 10; i++ ) {
	        	System.out.println( i + " X " + a +" = " + a * i );
	        }
	        
	        read.close();
		} catch (Exception e) {
			
			System.err.println("Problema Encontrado: " + e.getMessage() );
		}
    }

	private static void intervalException(String message) throws Exception {
		throw new Exception(message);
	}
}
