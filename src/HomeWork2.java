import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[] args) {
		
		firstTask();
		secondTask();
		thirdTask();
		fourthTask();
		fifthTask();
	}

        /*
        1. Write a program that obtains two integers from user and displays (for 500 and 125):
        number1=500   number2=125
        500+125=625
        500-125=375
         */
	
	public static void firstTask() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input number1");
		int number1 = scanner.nextInt();
		System.out.println("Input number2");
		int number2 = scanner.nextInt();
		int sum = number1 + number2;
		int subtraction = number1 - number2;
		
		System.out.print("number1 = " + number1);
		System.out.println(" number2 = " + number2);
		System.out.println(number1 + " + " + number2 + " = " + sum);
		System.out.println(number1 + " - " + number2 + " = " + subtraction);
		System.out.print("-".repeat(100));
		System.out.println();
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*
        Write a program that obtains two integers from user (the sides of rectangle and then displays:
        “The area of the rectangle with side 1 = ….  and side 2 =…… is ……” and the result calculated using the formula side1*side2
         */
	
	public static void secondTask() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input side1");
		int side1 = scanner.nextInt();
		System.out.println("Input side2");
		int side2 = scanner.nextInt();
		
		System.out.println("The area of the rectangle with side1 = " + side1 + " and side2 = " + side2 + " is " + side1 * side2);
		System.out.print("-".repeat(100));
		System.out.println();
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*
        3. Write a program that obtains two integers from user and displays (for 12 and 3):
        12+3=15
        12-3=9
         */
	public static void thirdTask() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input number3");
		int number3 = scanner.nextInt();
		System.out.println("Input number4");
		int number4 = scanner.nextInt();
		
		System.out.println(number3 + "+" + number4 + "=" + (number3 + number4));
		System.out.println(number3 + "-" + number4 + "=" + (number3 - number4));
		System.out.print("-".repeat(100));
		System.out.println();
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*
        4. Write a program that obtains a radius from user and then displays:
        “The area of a circle with radius …..” and the result calculated using the formula 3.14rr
         */
	public static void fourthTask() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the radius:");
		int radius = scanner.nextInt();
		
		System.out.println("The area of a circle with radius " + radius + " is " + (Math.PI * Math.pow(radius, 2)));
		System.out.print("-".repeat(100));
		System.out.println();
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*
        5. Write a program that calculates how many extra calories there will be if you’ll buy a pizza with
        a diameter of 28 cm instead of a pizza with a diameter of 24 cm.
        To solve this, let's assume that each square centimeter of pizza is 40 calories.
         */
	public static void fifthTask() {
		double areaBig = (Math.PI * 28 * 28) / 4;
		double areaSmall = (Math.PI * 24 * 24) / 4;
		
		double different = areaBig - areaSmall;
		double exCalories = different * 40;
		
		System.out.println("Extra calories there will be " + exCalories);
		
	}
}
