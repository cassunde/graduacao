package com.cassunde.graducao.revisao1;

import java.util.Scanner;

public class FixedPassword{
    
	public static void main( String[] args ){
    	
		try {
			
			int a;
			boolean authentic = false;
			int passCorrcted = 2002;
			
			Scanner read = new Scanner(System.in);
	        
			while( !authentic ) {

				System.out.printf("Informe a senha:\n");
		        a = read.nextInt();
		        
		        if( a == passCorrcted ) {
		        	
		        	authentic = true;
		        }else {
		        	
		        	System.out.println("Senha Inválida");	
		        }
			}
			
			System.out.println("Aceso permitido");
			
	        read.close();
		} catch (Exception e) {
			
			System.err.println("Problema Encontrado: " + e.getMessage() );
		}
    }
}
