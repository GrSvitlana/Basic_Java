/*
1. Implement method “countdown” that prints numbers from 5 to 1, then prints „start“. Implement it using both types
of loop countdown() ->
	5
    4
    3
    2
    1
    Start

2. Given two integers number1 and number2. Implement a method that returns the sum of all numbers between number1 and
number2 that are divisible by 3. Example: getSumDivisibleByThree(20,10) -> 45

3. Implement a program that reads Integers from Scanner and prints the sum of all integers entered.
The program will finish when 0 entered.

4. Given two integers year1 and year2. Implement a method that returns the quantity of leap years between
year1 and year2. Example: getQuantityOfLeapYears (2000,2022) -> 6

5. Implement a method that checks if the given number is prime.
 */

import java.util.Scanner;

public abstract class HomeWork8 {
	public static void main(String[] args) {
		countdown();
		System.out.println(getSumDivisibleByThree(getNumber(), getNumber()));
		printSum();
		getQuantityOfLeapYears();
		checkPrime(getNumber());
	}
	
	static public void countdown() {
		String str = "Start";
		
		// while loop
		int count = 5;
		while (count > 0) {
			System.out.println(count--);
		}
		System.out.println(str + "\n");
		
		// do/while loop
		count = 5;
		do {
			System.out.println(count--);
		} while (count > 0);
		System.out.println(str + "\n");
		
		// for loop
		for (int i = 5; i >= 0; i--) {
			System.out.println(i == 0 ? str : i);
		}
		System.out.println();
	}
	
	public static int getSumDivisibleByThree(int number1, int number2) {
		int sum = 0;
		
		if (number1 > number2) {
			int temp = number2;
			number2 = number1;
			number1 = temp;
		} else if (number1 == number2) System.out.println("Both entered values are equal");
		
		for (int i = number1; i <= number2; i++) {
			
			if (i % 3 == 0) sum += i;
		}
		
		return sum;
	}
	
	public static void printSum() {
		int x, sum = 0;
		
		do {
			x = getNumber();
			sum += x;
		} while (x != 0);
		System.out.println(sum);
	}
	
	public static void getQuantityOfLeapYears() {
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter two years:");
		int years1 = scanner.nextInt();
		int years2 = scanner.nextInt();
		
		if (years1 > years2) {
			int temp = years2;
			years2 = years1;
			years1 = temp;
		} else if (years1 == years2) System.out.println("Both entered values are equal");
		
		for (int i = years1; i <= years2; i++) {
			
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) count++;
		}
		
		System.out.println("The quantity of leap years between\n" + years1 + " and " + years2 + " equals " + count);
	}
	
	public static void checkPrime(int number) {
		boolean check = number > 1;
		
		for (int i = 2; i <= Math.sqrt(number); ++i) {
			if (number % i == 0) {
				check = false;
				break;
			}
		}

		System.out.println(number + (check ? " is a prime number." : " is not a prime number."));
	}
	
	public static int getNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter an integer number:");
		return scanner.nextInt();
	}
}
