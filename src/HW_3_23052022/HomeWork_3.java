package HW_3_23052022;

import java.util.Scanner;

public class HomeWork_3 {
	public static void main(String[] args) {
		
		/*
        1. Write a program that asks the user’s name and displays “Hello …….. !” on the screen.
         */
		
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter your name:");
		String name = console.nextLine();
		System.out.println("Hello " + name + "!");
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  
		/*
        2. Write a program that asks the user’s name and displays “Your name start with char …..” on the screen.
         */
		
		System.out.println("Please enter your name:");
		String name1 = console.nextLine();
		System.out.println("Your name start with char " + name1.charAt(0));
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*
        3. Дана длина ребра куба. Найти объем куба и площадь его боковой поверхности.
         */
		
		double h = 4;
		System.out.println("Cube volume is " + Math.pow(h, 3));
		System.out.println("Square area is " + Math.pow(h, 2));
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*
        4. Даны два действительных числа. Найти среднее арифметическое этих чисел.
         */
		
		double a = 2.5;
		double b = 1.5;
		System.out.println("Arithmetic mean is " + (a + b) / 2);
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*
        5. Даны катеты прямоугольного треугольника. Найти его гипотенузу.
         */
		
		double x = 3;
		double y = 4;
		System.out.println("The length of the hypotenuse is " + Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
		
	}
}
