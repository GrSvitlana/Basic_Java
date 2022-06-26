package HW_7;

/*
1. Implement a program that takes an integer from Scanner –
the number of the month. Implement a method that takes this integer value
and returns the String of the month or a message: “illegal argument”.
Example: getMonthString(3) -> March;
 
2. Implement a method that takes the number of the month and returns the season
(winter, spring, summer or autumn) to which the month belongs.

3. Imagine you are writing a program for a store. It should announce the promotion condition:
” You can get the BestWowSomething by the price 89.99$. But if you buy two articles then you
 get a discount of 10% of all and if you buy three and more articles the discount will be 15% of all”.
 Then It should ask the user how many articles the user wants to buy. If the user enters something more
 than 0 the program should print the amount of purchases, else displays “It's a pity. See you next time”.

4. Implement a program that ask the user to enter three integers (using Scanner),
and print the maximum of these three numbers. Implement this using the ternary operator: 19,10,1 ->19
 */

import java.util.Scanner;

public class HomeWork_7 {
	
	public static void main(String[] args) {
		
		firstTask();
		secondTask();
		thirdTask();
		fourthTask();
		
	}
	
	public static void firstTask() {
		
		System.out.println(getMonthString(takeNumberOfMonth()));
		endTask();
	}
	
	public static void secondTask() {
		
		System.out.println(returnSeason(takeNumberOfMonth()));
		endTask();
	}
	
	public static void thirdTask() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many articles do you want to buy:");
		int count = scanner.nextInt();
		double price = 89.99;
		double amount;
		
		if (count <= 0) {
			System.out.println("It's a pity. See you next time");
		} else {
			
			switch (count) {
				case 1 -> amount = price;
				case 2 -> amount = price * 1.8;
				default -> amount = price * count * 0.85;
			}
			
			System.out.printf("The amount of purchase %.2f%n", amount);
		}
		endTask();
	}
	
	public static void fourthTask() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter three integer numbers:");
		int first = scanner.nextInt();
		int second = scanner.nextInt();
		int third = scanner.nextInt();
		
		System.out.printf("The maximum of the three numbers is %d", (first > second ? first : second) > third ? (first > second ? first : second) : third);
	}
	
	public static int takeNumberOfMonth() throws IllegalStateException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number of the month: ");
		int numOfMonth = scanner.nextInt();
		
		if (numOfMonth <= 0 || numOfMonth > 12) {
			throw new IllegalStateException("Illegal argument");
		} else {
			return numOfMonth;
		}
	}
	
	public static String getMonthString(int month) {
		return switch (month) {
			case 1 -> "January";
			case 2 -> "February";
			case 3 -> "March";
			case 4 -> "April";
			case 5 -> "May";
			case 6 -> "June";
			case 7 -> "July";
			case 8 -> "August";
			case 9 -> "September";
			case 10 -> "October";
			case 11 -> "November";
			case 12 -> "December";
			default -> throw new IllegalStateException("Unexpected value: " + month);
		};
	}
	
	public static String returnSeason(int month) {
		return switch (month) {
			case 12, 1, 2 -> "Winter";
			case 3, 4, 5 -> "Spring";
			case 6, 7, 8 -> "Summer";
			case 9, 10, 11 -> "Autumn";
			default -> throw new IllegalStateException("Unexpected value: " + month);
		};
	}
	
	public static void endTask() {
		System.out.print("-".repeat(100));
		System.out.println();
	}
}
