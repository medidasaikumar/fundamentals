package com.codegnan.www;

import java.util.Scanner;

public class incomeTax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the income tax amount");
		int income = sc.nextInt();
		double result = (income<300000)? income*0.95 :(income>=300000) ? income*0.90 :(income>1000000) ? 0.85*income : (income>2000000)? 0.84*income : 0.85*income;
		System.out.println(result);	

	}

}
