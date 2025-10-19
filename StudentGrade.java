package com.codegnan.operatorexamples;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Marks:");
		int marks=new scanner.nextInt();
		char grade=(marks)>=90?'A':
			                  (marks)>=80?'B':
			                	  (marks)>=70?'C':
			                		  (marks)>=60?'D':
			                			  (marks)>=50?'E':'F';
		System.out.println("Student grade by marks:"+grade);	                			  
			                	  
							

	}

}
