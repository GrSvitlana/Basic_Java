import java.util.Arrays;
import java.util.Scanner;

public class HomeWork10 {

/*
1. Implement a method that returns a new array of int. Every element of the array is the next power of two.
The length of the array is given as n (the max value of n is 30. Why do you think?) powerOfTwo (5) -> {1,2,4,8,16}

2. Implement a method that returns the new array that is the given array in reverse order
{10, 3, 3, 5, -9} -> {-9, 5, 3, 3, 10}

3. Implement a method that makes a given array in reverse order. It looks like the previous task, but you should solve
it without a new array
{10, 3, 3, 5, -9} -> {-9, 5, 3, 3, 10}

4. Assume that there are two arrays of numbers, each sorted in ascending order. Implement the method int[]
merge(int[], int[]) that merges these arrays into a single sorted array.
({1,4,6,8},{3,7}) ->{1,3,4,6,7,8}({12,19},{3,7}) ->{3,7,12,19}

5. Try to develop and program an algorithm to sort a one-dimensional array. Learning about known methods and
implement one of them is acceptable.
 */
	public static void main(String[] args) {
		powerOfTwo();
		arrayReverse();
		arrayReverse2();
		arraysMerge();
		bubbleSort();
	}
	
	private static void powerOfTwo() {
		int n = arrayLength();
		int[] intArray = new int[n];
		
		if (n > 30) {
			System.out.println("The int data type is a 32-bit signed. Max positive int value is 2**31-1");
		} else {
			intArray[0] = 1;
			
			for (int i = 1; i < n; i++) {
				intArray[i] = intArray[i - 1] * 2;
			}
			System.out.println(Arrays.toString(intArray));
		}
	}
	
	private static void arrayReverse() {
		int n = arrayLength();
		int[] intArray = readIntArray(n);
		int[] intArrayReverse = new int[n];
		
		for (int i = 0; i < n; i++) {
			intArrayReverse[i] = intArray[n - i - 1];
		}
		
		System.out.print("The given array: ");
		System.out.println(Arrays.toString(intArray));
		
		System.out.print("The given array in reverse order: ");
		System.out.println(Arrays.toString(intArrayReverse));
	}
	
	private static void arrayReverse2() {
		int n = arrayLength();
		int[] intArray = readIntArray(n);
		
		System.out.print("The given array: ");
		System.out.println(Arrays.toString(intArray));
		
		System.out.print("The given array in reverse order: ");
		for (int i = n-1; i >= 0; i--) {
			System.out.print(intArray[i] + " ");
		}
	}
	
	public static void arraysMerge() {
		int n1 = arrayLength();
		int[] intArray1 = readIntArray(n1);
		
		int n2 = arrayLength();
		int[] intArray2 = readIntArray(n2);
		
		int[] intArray3 = new int[n1+n2];
		
		Arrays.sort(intArray1);
		Arrays.sort(intArray2);
		
		int i = 0, j = 0, t = 0;

		while (i < n1 && j < n2) {
			intArray3[t++] = intArray1[i] < intArray2[j] ? intArray1[i++] : intArray2[j++];
		}
		
		while (i < n1)
			intArray3[t++] = intArray1[i++];
		
		while (j < n2)
			intArray3[t++] = intArray2[j++];
		
		System.out.println(Arrays.toString(intArray3));
		
	}
	
	private static void bubbleSort() {
		int n = arrayLength();
		int[] intArray = readIntArray(n);
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (intArray[j] > intArray[j + 1]) {
					int temp = intArray[j];
					intArray[j] = intArray[j + 1];
					intArray[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(intArray));
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
