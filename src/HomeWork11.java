import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
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
					array[i][j] = ThreadLocalRandom.current().nextInt(-100, 100);
				}
			}
			
			print2dArray(array);
			
		} else {
			System.err.println("The array dimension must be greater than 0\n");
		}
		
		return array;
	}
	
	private static void checkAverage(int[][] array, int rowNumber) {
		
		int numberOfRows = array.length;
		int numberOfColumns = array[0].length;
		double sum = 0;
		String str;
		
		if (rowNumber >= numberOfRows) {
			System.err.println("Error! Row number bigger than array size.");
		} else {
			for (int i = 0; i < numberOfColumns; i++) {
				sum += array[rowNumber][i];
			}
			
			if ((sum / numberOfColumns) > 0) {
				str = " is greater than 0.";
			} else {
				str = " is less than or equal to 0.";
			}
			System.out.println("The average of the elements in row " + rowNumber + str + "\n");
		}
	}
	
	private static void squareMatrix() {
		
		int n = HomeWork10.arrayLength();
		
		int[][] array = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			array[i][i] = array[i][n - i - 1] = 1;
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
