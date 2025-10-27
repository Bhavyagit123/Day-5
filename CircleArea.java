package com.codegnan.fundamentals;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Input radius from user
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate area using the formula: π × r²
        double area = Math.PI * radius * radius;

        // Display the result with 2 decimal places
        System.out.printf("Area of the circle: %.2f\n", area);

        scanner.close();

	}

}
