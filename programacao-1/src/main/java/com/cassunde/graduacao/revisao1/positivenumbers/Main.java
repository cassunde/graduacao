package com.cassunde.graduacao.revisao1.positivenumbers;

import java.util.Scanner;

public class Main{
    
	public static void main( String[] args ){
    	
		Scanner scan = new Scanner(System.in);
		int totalPositive = 0;
		double i = 1;
		while(i <= 6) {
			double a = scan.nextDouble();
	        if(a > 0.0) {
	        	totalPositive ++;
	        }
	        i++;
		}
		System.out.println(totalPositive+" valores positivos");
    }
}
