package HW_3;

import java.util.Scanner;

public class HomeWork_3 {
	public static void main(String[] args) {
		
		System.out.printf("Hello %s!%n", takeName());
		secondTask();
		thirdTask();
		fourthTask();
		fifthTask();
	}
	
	// 1. Write a program that asks the user’s name and displays “Hello …….. !” on the screen.
	public static String takeName() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your name:");
		return scanner.nextLine();
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// 2. Write a program that asks the user’s name and displays “Your name start with char …..” on the screen.
	
	public static void secondTask() {
		System.out.println("Your name start with char " + takeName().charAt(0));
		System.out.print("-".repeat(100));
		System.out.println();
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// 3. Дана длина ребра куба. Найти объем куба и площадь его боковой поверхности.
	
	public static void thirdTask() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the rib length of the cube:");
		double h = scanner.nextDouble();
		System.out.println("The volume of the cube equal " + Math.pow(h, 3));
		System.out.println("The area of the cube equal " + Math.pow(h, 2));
		System.out.print("-".repeat(100));
		System.out.println();
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// 4. Даны два действительных числа. Найти среднее арифметическое этих чисел.
	
	public static void fourthTask() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the first real number:");
		double a = scanner.nextDouble();
		System.out.println("Please enter the second real number:");
		double b = scanner.nextDouble();
		System.out.println("The arithmetic mean of these numbers is " + (a + b) / 2);
		System.out.print("-".repeat(100));
		System.out.println();
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// 5. Даны катеты прямоугольного треугольника. Найти его гипотенузу.
	
	public static void fifthTask() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the length of the first cathetus of the triangle:");
		double cathetus_1 = scanner.nextDouble();
		System.out.println("Please enter the length of the second cathetus of the triangle:");
		double cathetus_2 = scanner.nextDouble();
		System.out.println("The length of the hypotenuse is " + Math.sqrt(Math.pow(cathetus_1, 2) + Math.pow(cathetus_2, 2)));
	}
}

