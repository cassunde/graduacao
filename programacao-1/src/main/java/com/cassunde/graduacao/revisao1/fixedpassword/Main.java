package com.cassunde.graduacao.revisao1.fixedpassword;

import java.util.Scanner;

public class Main{
    
	public static void main( String[] args ){
    	
		int a;
		boolean authentic = false;
		int passCorrcted = 2002;
		
		Scanner read = new Scanner(System.in);
        
		while( !authentic ) {

	        a = read.nextInt();
	        
	        if( a == passCorrcted ) {
	        	
	        	authentic = true;
	        }else {
	        	
	        	System.out.println("Senha Invalida");	
	        }
		}
		
		System.out.println("Acesso Permitido");
    }
}
