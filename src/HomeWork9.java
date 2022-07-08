import java.util.Scanner;

public class HomeWork9 {

/*
1. Write a method that takes a String and two chars. As the result it returns the given String,
where each the first char was replaced by the second char. You have to use only length() and charAt() methods
of String class.For example: “I always do my homework”, ‘a’, ‘A’ -> “I AlwAys do my homework”.

2. Implement a method that returns the index of the biggest element of a given array of int{10, 33, 3, 5, -9} -> 1

3. Implement a method that returns the sum of elements of the given array of int{10, 3, 23, 5, -9} -> 32

4. Write method that checks whether a given string is a palindrome. A palindrome is a phrase that reads the same
from the front and the back.
 */
	public static void main(String[] args) {
		changeChars();
		returnBigIndexAndSum();
		checkPalindrome();
		
		checkDoubleArray(); //  Find duplicate elements in an array
		System.out.println(fact(4)); // Iterative Implementation of Factorial
		System.out.println(factRec(3)); // Recursive Definition Implementation of Factorial
	}
	
	private static void changeChars() {
		String string = enterString();
		char firsChar = enterFirstChar();
		char secondChar = enterSecondChar();
		
		for (int i = 0; i < string.length(); i++) {
			System.out.print((string.charAt(i) != firsChar) ? string.charAt(i) : secondChar);
		}
		System.out.println();
	}
	
	private static void returnBigIndexAndSum() {
		int n = arrayLength();
		int[] intArray = readIntArray(n);
		int max = 0;
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			max = intArray[i] > intArray[max] ? i : max;
			sum += intArray[i];
		}
		
		System.out.println("The index of the biggest element of the given array is " + max);
		System.out.println("The sum of all elements of the given array is " + sum);
	}
	
	private static void checkPalindrome() {
		String string = enterString();
		String str = "is";
		int length = string.length();
		
		for (int i = 0; i < length / 2; i++) {
			if (string.charAt(i) != string.charAt(length - i - 1)) {
				str = "isn't";
				break;
			}
		}
		System.out.printf("The given string %s a palindrome", str);
	}
	
	private static void checkDoubleArray() {
		int n = arrayLength();
		int[] intArray = readIntArray(n);
		boolean flag = false;
		
		for (int i = 0; i < intArray.length; i++) {
			for (int j = i + 1; j < intArray.length; j++) {
				if (intArray[i] == intArray[j]) {
					flag = true;
					break;
				}
			}
		}
		System.out.println("This array " + (flag ? "has" : "doesn't have") + " a duplicate element.");
	}
	
	private static int fact(int n) {
		int p = 1;
		for (int i = 1; i <= n; i++) {
			p *= i;
		}
		return p;
	}
	
	private static int factRec(int n) {
		if (n == 1) {
			return 1;
		}
		return factRec(n - 1) * n;
	}
	
	private static String enterString() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your String:");
		return scanner.nextLine();
	}
	
	private static char enterFirstChar() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the first char");
		return scanner.next().charAt(0);
	}
	
	private static char enterSecondChar() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the second char");
		return scanner.next().charAt(0);
	}
	
	private static int arrayLength() throws IllegalStateException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a length of an array:");
		int n = scanner.nextInt();
		if (n <= 0) {
			throw new IllegalStateException("The length of an array can not be under 0 value");
		} else return n;
	}
	
	private static int[] readIntArray(int n) {
		return getInts(n);
	}
	
	public static int[] getInts(int n) {
		int[] array = new int[n];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the array values:");
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}
		return array;
	}
}
