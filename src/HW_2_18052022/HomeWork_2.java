package HW_2_18052022;

import java.util.Scanner;

public class HomeWork_2 {
	public static void main(String[] args) {

        /*
        1. Write a program that obtains two integers from user and displays (for 500 and 125):
        number1=500   number2=125
        500+125=625
        500-125=375
         */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input number1");
		int number1 = scanner.nextInt();
		System.out.println("Input number2");
		int number2 = scanner.nextInt();
		int sum = number1 + number2;
		int subtraction = number1 - number2;
		
		System.out.print("number1 = " + number1);
		System.out.println(" number2 = " + number2);
		System.out.println(number1 + " + " + number2 + " = " + sum);
		System.out.println(number1 + " - " + number2 + " = " + subtraction);
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*
        Write a program that obtains two integers from user (the sides of rectangle and then displays:
        “The area of the rectangle with side 1 = ….  and side 2 =…… is ……” and the result calculated using the formula side1*side2
         */
		
		System.out.println("Input side1");
		int side1 = scanner.nextInt();
		System.out.println("Input side2");
		int side2 = scanner.nextInt();
		
		System.out.println("The area of the rectangle with side1 = " + side1 + " and side2 = " + side2 + " is " + side1 * side2);
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*
         Write a program that obtains two integers from user and displays (for 12 and 3):
        12+3=15
        12-3=9
         */
		
		System.out.println("Input number3");
		int number3 = scanner.nextInt();
		System.out.println("Input number4");
		int number4 = scanner.nextInt();
		
		System.out.println(number3 + "+" + number4 + "=" + (number3 + number4));
		System.out.println(number3 + "-" + number4 + "=" + (number3 - number4));
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*
        Write a program that obtains a radius from user and then displays:
        “The area of a circle with radius …..” and the result calculated using the formula 3.14rr
         */
		
		System.out.println("Input the radius:");
		int radius = scanner.nextInt();
		final double pi = 3.14;
		
		System.out.println("The area of a circle with radius " + radius + " is " + (pi * radius * radius));
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*
        Write a program that calculates how many extra calories there will be if you’ll buy a pizza with
        a diameter of 28 cm instead of a pizza with a diameter of 24 cm.
        To solve this, let's assume that each square centimeter of pizza is 40 calories.
         */
		
		double areaBig = (pi * 28 * 28) / 4;
		double areaSmall = (pi * 24 * 24) / 4;
		
		double different = areaBig - areaSmall;
		double exCalories = different * 40;
		
		System.out.println("Extra calories there will be " + exCalories);
		
	}
}
