package com.cassunde.graduacao.revisao2.evensquare;

import java.util.Scanner;

public class Main{
    
	public static void main( String[] args ){
    	
		Scanner read = new Scanner(System.in);
	     
        int n = read.nextInt();
        
        if( n > 5 && n < 2000 ) {
        	for( int i=1; i <= n; i++ ) {
            	if( i % 2 == 0 ) {
            		System.out.printf("%d^2 = %d\n", i, i*i);
            	}
            }        	
        }
    }
}
