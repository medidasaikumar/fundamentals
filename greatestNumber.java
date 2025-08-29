package com.codegnan.www;

import java.util.*;
public class greatestNumber
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number-1");
	    int num1 =sc.nextInt();
	    System.out.println("Enter the number-2");
	    int num2 =sc.nextInt();
	    String result = (num1>num2)? "number-1 "  +   num1 + "is Greatest Number": "number-2" +  num2  + "is Greatest Number";
	    System.out.println(result);
	     
	}
}