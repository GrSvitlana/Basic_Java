package Practice;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number of the question:");
		int numberQuestion = scanner.nextInt();
		String str = askQuestion(numberQuestion);
		System.out.println(str);
		
		System.out.println("Please enter an age:");
		int age = scanner.nextInt();
		String date = returnDate(age);
		System.out.printf("It is %s%n", date);
	}
	
	public static String askQuestion(int number) {
		if (number == 2) {
			System.out.println("Number = 2");
		} else if (number == 1) {
			System.out.println("Number = 1");
		} else if (number > 1) {
			System.out.println("Number > 1");
		}
		return "Hello, how are you?";
	}
	
	public static String returnDate(int age) {
		if (age > 30) {
			System.out.println("Ivan Ivanov");
		}
		
		if (age == 32) {
			System.out.println("Petr Petrovich");
		}
		
		return null;
	}
}