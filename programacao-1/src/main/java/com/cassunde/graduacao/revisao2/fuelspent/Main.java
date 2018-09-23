package com.cassunde.graduacao.revisao2.fuelspent;

import java.util.Scanner;

public class Main{
    
	public static void main( String[] args ){
    	
		Scanner read = new Scanner(System.in);
	     
        double consumption = 12;
        
        double spentTime = read.nextDouble();
        double averadeSpeed = read.nextDouble();
        
        double distance = averadeSpeed * spentTime;
        double consumptionFuel = distance / consumption;
        
        System.out.printf("%.3f\n",consumptionFuel);
    }
}
