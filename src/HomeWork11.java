import java.util.Random;
import java.util.Scanner;

public class HomeWork11 {
/*
1. In this assignment you should write a program that creates a new array int[n][m],
fill it with random integers and displays it.

2.Implement a method that takes an int[][] array and a row number and checks that the average of the elements in
the row is greater than 0.

3. A square array (same number of rows and columns) filled with zeros is given. Fill both diagonals with ones.
 */
	
	public static void main(String[] args) {
		
		createArray();
		checkAverage(createArray(), rowNumber());
		squareMatrix();
	}
	
	private static int[][] createArray() {
		
		Random random = new Random();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the size of an array[rows][cols]: ");
		System.out.println("rows = ");
		int rows = scanner.nextInt();
		System.out.println("cols = ");
		int cols = scanner.nextInt();
		
		int[][] array = new int[rows][cols];
		if (rows > 0 && cols > 0) {
			
			array = new int[rows][cols];
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[0].length; j++) {
					array[i][j] = random.nextInt();
				}
			}
			
			for (int[] ints : array) {
				for (int j = 0; j < array[0].length; j++) {
					System.out.print(ints[j] + " ");
				}
				System.out.println();
			}
			System.out.println();
			
		} else {
			System.err.println("The array dimension must be greater than 0");
		}
		
		return array;
	}
	
	private static void checkAverage(int[][] array, int rowNumber) {
		
		double sum = 0;
		int numberOfRows = array.length;
		int numberOfColumns = array[0].length;
		String str;
		
		if (rowNumber >= numberOfRows) {
			System.err.println("Error! Row number bigger than array size.");
		} else {
			for (int j = 0; j < numberOfColumns; j++) {
				sum += array[rowNumber][j];
			}
			double average = sum / numberOfColumns;
			if (average > 0) {
				str = " is greater than 0.";
			} else {
				str = " is less than or equal to 0.";
			}
			System.out.println("The average of the elements in row " + rowNumber + str);
		}
	}
	
	private static void squareMatrix() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number of rows of a square array: ");
		int n = scanner.nextInt();
		
		int[][] array = new int[n][n];
		
		int count = n-1;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
						array[i][i] = 1;
						array[count][i] = 1;
					}
			count--;
		}
		print2dArray(array);
	}
	
	private static void print2dArray(int[][] array) {
		for (int[] ints : array) {
			for (int anInt : ints) {
				System.out.print(anInt + " ");
			}
			System.out.println();
		}
	}
	
	private static int rowNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a row number: ");
		return scanner.nextInt();
	}
}
