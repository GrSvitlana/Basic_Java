package HW_4;

import java.util.Scanner;

/* First level:
1. Напишите метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
где a, b, c, d — целочисленные входные параметры этого метода.

2. Напишите метод, которому в качестве параметра передаётся строка,
обозначающая имя. Метод должен вернуть приветственное сообщение:
«Hello, переданное_имя!». Выведи приветствие в консоль.

3. Implement the method that convert the given amount in EUR to amount in USD

4. Implement the method that calculates how many extra calories there will be
if you’ll buy a pizza with a diameter of n cm (parameter of method) instead of
a pizza with a diameter of 24 cm. To solve this, let's assume that each square
centimeter of pizza is 40 calories.

5. Implement the program that prints to screen the results of addition,
subtraction, multiplication and division of two numbers.
Each of the arithmetic operations should be implemented as a separate method.


Second level:
Напишите метод, присваивающий переменной a случайное значение из диапазона
с плавающей точкой, и выведи округлённое до 3 знаков после запятой.

 */

public class HomeWork_4 {
	public static void main(String[] args) {
		
		firstTask();
		secondTask();
		thirdTask();
		fourthTask();
		fifthTask();
		sixthTask();
		
	}
	
	public static void firstTask() {
		
		int[] array = new int[4];
		
		System.out.println("Task 1");
		System.out.println("Please enter integers to calculate:");
		Scanner console = new Scanner(System.in);
		
		for (int i = 1; i < 5; i++) {
			System.out.println("Value " + i + " is: ");
			array[i - 1] = console.nextInt();
		}
		
		calculateExpression(array[0], array[1], array[2], array[3]);
		
	}
	
	public static void calculateExpression(int a, int b, int c, int d) {
		
		int result = a * (b + (c / d));
		
		System.out.println("Calculate expression >> " + a + " * (" + b + " + (" + c + " / " + d + ")) = " + result);
		System.out.print("-".repeat(100));
		System.out.println();
	}
	
	public static void secondTask() {
		System.out.println("Task 2");
		System.out.println("Hello " + writeName() + "!");
		System.out.print("-".repeat(100));
		System.out.println();
		
	}
	
	public static String writeName() {
		
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter your name:");
		String name = console.nextLine();
		
		return name;
	}
	
	public static void thirdTask() {
		System.out.println("Task 3");
		System.out.println("Converted amount in USD is " + convector());
		System.out.print("-".repeat(100));
		System.out.println();
	}
	
	public static double convector() {
		double amountDol;
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter amount in EUR:");
		double amoundEuro = console.nextDouble();
		return amountDol = amoundEuro * 1.1;
	}
	
	public static void fourthTask() {
		System.out.println("Task 4");
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter a diameter (cm) of the pizza:");
		double sizePizza = console.nextDouble();
		
		if (sizePizza > 24) {
			
			System.out.println("Extra calories there will be " + calculateCalories(sizePizza) + " as opposed to a pizza with a diameter of 24 cm");
		} else if (sizePizza == 24) {
			System.out.println("The pizzas are the same with a diameter of 24 cm and the calories are the same " + calculateCalories(1, sizePizza));
		} else if (sizePizza <= 0) {
			System.out.println("Entered data is not correct");
		} else {
			System.out.println("Fewer calories there will be " + (-1 * calculateCalories(sizePizza)) + " as opposed to a pizza with a diameter of 24 cm");
		}
		System.out.print("-".repeat(100));
		System.out.println();
	}
	
	public static double calculateCalories(double diameterPizza) {
		
		double areaBig = (Math.PI * Math.pow(diameterPizza, 2)) / 4;
		double areaSmall = (Math.PI * Math.pow(24, 2)) / 4;
		
		double different = areaBig - areaSmall;
		double exCalories = different * 40;
		
		return exCalories;
	}
	
	public static double calculateCalories(int count, double diameterPizza) {
		double areaPizza = (Math.PI * Math.pow(diameterPizza, 2)) / 4;
		double calories = areaPizza * 40;
		return count * calories;
	}
	
	public static void fifthTask() {
		System.out.println("Task 5");
		
		System.out.println("Please select a number of one of the operations:");
		System.out.println("1. + Addition");
		System.out.println("2. - Subtraction");
		System.out.println("3. * Multiplication");
		System.out.println("4. / Division");
		
		Scanner console = new Scanner(System.in);
		int operation = console.nextInt();
		
		if (operation <= 0 || operation >= 5) {
			System.out.println("This operation does not exist");
			stopMethod();
		} else {
			
			System.out.println("Enter the first number");
			double firstNumber = console.nextDouble();
			System.out.println("Enter the second number");
			double secondNumber = console.nextDouble();
			double result = 0;
			String operationType = null;
			if (operation == 1) {
				result = operationAddition(firstNumber, secondNumber);
				operationType = "addition";
			} else if (operation == 2) {
				result = operationSubtraction(firstNumber, secondNumber);
				operationType = "subtraction";
			} else if (operation == 3) {
				result = operationMultiplication(firstNumber, secondNumber);
				operationType = "multiplication";
			} else if (operation == 4) {
				result = operationDivision(firstNumber, secondNumber);
				operationType = "division";
			}
			
			System.out.println("The results of " + operationType + " two numbers: " + firstNumber + " and " + secondNumber + " is " + result);
			System.out.print("-".repeat(100));
			System.out.println();
		}
	}
	
	private static void stopMethod() {
		return;
	}
	
	public static double operationAddition(double a, double b) {
		return a + b;
	}
	
	public static double operationSubtraction(double a, double b) {
		return a - b;
	}
	
	public static double operationMultiplication(double a, double b) {
		return a * b;
	}
	
	public static double operationDivision(double a, double b) {
		return a / b;
	}
	
	public static void sixthTask() {
		System.out.println("Task 6*");
		double a = valueRandom();
		System.out.printf("Value - a - with 3 digits after decimal point is %.3f ", a);
		System.out.println();
		System.out.print("-".repeat(100));
		System.out.println();
	}
	
	public static double valueRandom() {
		
		Scanner console = new Scanner(System.in);
		
		double max, min, doubleRandom;
		
		System.out.println("Please enter minimum value:");
		min = console.nextDouble();
		System.out.println("Please enter maximal value");
		max = console.nextDouble();
		
		doubleRandom = (Math.random()) * (max - min) + min;
		
		return doubleRandom;
	}
}