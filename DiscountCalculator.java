package com.codegnan.www;
import java.util.*;

public class DiscountCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
	    System.out.println("Enter the purchase Amount");
	    int purchaseAmount = sc.nextInt();
		String result = (purchaseAmount<50)? "no discount":(purchaseAmount>=50 && purchaseAmount<100)? "10% Disount" :( purchaseAmount>=100)? "20% discount":" ";
	    System.out.println(result);
	    sc.close();

	}

}
