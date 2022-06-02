package HW_5_31052022;

import java.util.Calendar;
import java.util.Scanner;

/*
First level:
1. Create two variables isWeekend and isRain. Create the variable canWalk whose
value should be true if it's a day off (isWeekend=true) and it's not raining (isRain=false).

2. Create two variables isEdekaOpen and isReweOpen, the values of which depend on the fact if the stores open or not.
Implements a method boolean canBuy, that returns true.
The value of this variable must be true if at least one store is open,
otherwise false. Display the string “I can buy the food It’s ……“ and the value.

3. Let’s imagine that we have a device, which has two flasks.
The device works correct if temperature of the first flask is above 100 degrees
and the temperature of the second flask is less than 100 degree.
You should write the method that checks this device.
Your program has to variables temperature1 and temperature2.
As a result it prints the message true or false.

Second level:
Написать метод, который в качестве параметра принимает номер года и
возвращает true, если год високосный и false, если год невисокосный.
 */
public class HomeWork_5 {
	public static void main(String[] args) {
		
		firstTask();
		secondTask();
		thirdTask();
		fourthTask();
		
	}
	
	// firstTask -------------------------------------------------------------------------------------------------------
	public static void firstTask() {
		String walking, rain;
		boolean canWalk;
		
		if (isRain()) rain = "";
		else rain = " no";
		
		if (isWeekend() && isRain() == false) {
			canWalk = true;
			walking = "can";
			System.out.printf("You %s go for a walk because today is %s and there is%s rain %n%n", walking, writeDay(dayOfWeek()), rain);
		} else {
			canWalk = false;
			walking = "can not";
			System.out.printf("You %s go for a walk because today is %s and there is%s rain %n%n", walking, writeDay(dayOfWeek()), rain);
		}
		System.out.println("Can walk is " + canWalk);
		System.out.print("-".repeat(100));
		System.out.println();
	}
	
	public static boolean isRain() {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Please enter Y if it is rains today or N if it doesn't %n");
		String yesno = (scanner.nextLine()).toLowerCase();
		
		boolean isRain = false;
		
		if (yesno.equals("y")) {
			isRain = true;
		} else if (yesno.equals("n")) {
			isRain = false;
		} else {
			System.out.println("Input date is not correct");
		}
		
		return isRain;
	}
	
	public static boolean isWeekend() {
		boolean isWeekend = false;
		
		int day = dayOfWeek();
		
		if (day >= 1 && day <= 5) isWeekend = false;
		else if (day == 0 || day == 6) isWeekend = true;
		else System.out.println("Input date is not correct");
		
		return isWeekend;
	}
	
	public static int dayOfWeek() {
		Calendar c = Calendar.getInstance();
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		return dayOfWeek - 1;
	}
	
	public static String writeDay(int day) {
		switch (day) {
			case 1:
				return "Monday";
			case 2:
				return "Tuesday";
			case 3:
				return "Wednesday";
			case 4:
				return "Thursday";
			case 5:
				return "Friday";
			default:
				return "Weekend";
		}
	}
	
	// secondTask ------------------------------------------------------------------------------------------------------
	
	public static void secondTask() {
		boolean canBuy;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tell me please is Edeka open? True or false");
		boolean isEdekaOpen = scanner.nextBoolean();
		System.out.println("Tell me please is Rewe open? True or false");
		boolean isReweOpen = scanner.nextBoolean();
		
		if (isEdekaOpen == true || isReweOpen) canBuy = true;
		else canBuy = false;
		
		System.out.println("I can buy the food It is " + canBuy);
		System.out.print("-".repeat(100));
		System.out.println();
	}
	
	// thirdTask -------------------------------------------------------------------------------------------------------
	
	public static void thirdTask() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the temperature of the first flask:");
		double temperature1 = scanner.nextDouble();
		System.out.println("Please enter the temperature of the second flask:");
		double temperature2 = scanner.nextDouble();
		boolean correct;
		
		if (temperature1 > 100 && temperature2 < 100) {
			correct = true;
		} else {
			correct = false;
		}
		
		System.out.println("The device works correct is " + correct);
		System.out.print("-".repeat(100));
		System.out.println();
	}
	
	// fourthTask ------------------------------------------------------------------------------------------------------
	
	public static void fourthTask() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the year you are checking:");
		int year = scanner.nextInt();
		System.out.printf("%d year is a leap year - %s%n", year, leapYear(year));
	}
	
	public static boolean leapYear(int a) {
		
		if (((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0))) return true;
		else return false;
	}
}

