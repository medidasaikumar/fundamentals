package com.codegnan.www;

import java.util.Scanner;

public class CanteenSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int teaPrice=10,cofeePrice=15,samosaPrice=20;
		int teaQty=0,cofeeQty=0,samosaQty=0;
		int choice;
		double taxRate=0.05;
		do {
		   System.out.println("|------------canteen menu-----------------------|");
		   System.out.println("|------------1.view menu------------------------|");
		   System.out.println("|------------2.order items----------------------|");
		   System.out.println("|------------3.view bill------------------------|");
		   System.out.println("|------------4.checkout and Exit----------------|");
		   System.out.println("Enter your choice");
		   choice=sc.nextInt();
		   switch(choice) {
		   case 1:
			   System.out.println("|------------MENU---------------------------|");
			   System.out.println("1.tea-$" + teaPrice);
			   System.out.println("2.cofee-$" + cofeePrice);
			   System.out.println("3.samosa--$" + samosaPrice);
			   break;
		   case 2:
			   System.out.println("Enter item number to order(1-3)");
			   int item =sc.nextInt();
			   System.out.println("Enter Quantity");
			   int qty=sc.nextInt();
			   if(qty<=0) {
				   System.out.println("Quantity must be greater than 0");
				   break;
				   
			   }
			   switch(item) {
			   case 1:
				   teaQty+=qty;
				   System.out.println(qty+"Tea(s) Added");
				   break;
			   case 2:
				   cofeeQty+=qty;
				   System.out.println(qty+"cofee(s) Added");
				   break;
			   case 3:
				   samosaQty+=qty;
				   System.out.println(qty+"samosa(s) Added");
				   break;
				   default:
					   System.out.println("invalid iteam Number pls choose btw (1-3)");
					   break;
			   }
			   break;
		   case 3:
			   int teaTotal=teaQty*teaPrice;
			   int cofeeTotal=cofeeQty*cofeePrice;
			   int samosaTotal=samosaQty&samosaPrice;
			   int subTotal=teaTotal+cofeeTotal+samosaTotal;
			   double tax=subTotal*taxRate;
			   double gradTotal=subTotal+tax;
			   System.out.println("---------------BILL----------------");
			   if(teaQty>0) {
				   System.out.println("tea x"+teaQty+"=$"+teaTotal);
			   }if(cofeeQty>0) {
				   System.out.println("tea x"+cofeeQty+"=$"+cofeeTotal);
			   }if(samosaQty>0) {
				   System.out.println("tea x"+samosaQty+"=$"+samosaTotal);
			   }if(subTotal==0) {
				   System.out.println("No items ordered yet");
			   }else {
				   System.out.println("SubTotal="+ subTotal);
				   System.out.println("tax(5%)="+ tax);
				   System.out.println("grandTotal="+ gradTotal);
				   
			   }
			   break;
		   case 4:
			   System.out.println("Thankyou!! Existing System");
			   break;
			   default:
				   System.out.println("Invalid choice please enter a number 1 to 4");
		   }
			
		}while(choice!=4);
		sc.close();

	}

}
