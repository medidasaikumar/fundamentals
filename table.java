package com.codegnan.www;

import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any table to print");
        int num=sc.nextInt();
        for(int i=20;i>=1;i--) {
        	System.out.println(num +"x" + i +"="+ num*i);
        }
        sc.close();
        
	}

}
