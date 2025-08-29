package com.codegnan.www;

import java.util.Scanner;

public class simpleAndCompoundIntrest{
	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the principle Amount:");
	        double PrincipleAmount = sc.nextDouble();
	        System.out.println("Enter the Time in months:");
	        int timeInMonths = sc.nextInt();
	        System.out.println("Enter the rate of intrest ");
	        int intrest = sc.nextInt();
	        double simpleIntrest =(PrincipleAmount *timeInMonths *intrest) / (100*12) ;
	        int years = timeInMonths/12;
	        double CompoundIntrest=PrincipleAmount*((1+(intrest/100)^years));
	        System.out.println("Simple intrest is :" + simpleIntrest );
	        System.out.println("Compound intrest is :" + CompoundIntrest);
	}

}
