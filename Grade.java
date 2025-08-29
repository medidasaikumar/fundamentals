package com.codegnan.www;
import java.util.*;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the marks");
      double marks = sc.nextDouble();
      String result = (marks>=90 && marks<=100)? " O-Grade" : (marks>=80 && marks<90) ? "s-grade": (marks>=70 && marks<80)? "A-grade" :(marks>=60 && marks<70)? "B-Grade":(marks>=50 && marks<70)?"c-grade"
    		 : (marks>=40 && marks<50)? "D-Grade" : "F-Grade[fail]";
      System.out.println(result);
	}

}
