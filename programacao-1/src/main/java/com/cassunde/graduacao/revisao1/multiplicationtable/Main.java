package com.cassunde.graduacao.revisao1.multiplicationtable;

import java.util.Scanner;

public class Main{
    
	public static void main( String[] args ){
    	
		Scanner scan = new Scanner(System.in);
                
		int a = scan.nextInt();
        
        if( a > 2 && a < 1000 ) {
        	
        	int i = 1;
        	
        	while( i <= 10 ) {
            	System.out.printf("%d x %d = %d\n",i,a,a * i );
            	
            	i++;
            }
        }
    }
}
