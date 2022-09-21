/*
Написать метод,
возвращающий целое число
равное двойной строки
принимаемой в качестве аргумента метода.

Пример: hello -> 10

Написать 2 метода: один метод переставляет первую букву в конец строки (abcd-> bcda).
Второй  метод переставляет последнюю букву в начало строки (abcd->dabc)
 */

import java.util.Arrays;

public class mvLetter {
	public static void main(String[] args) {
		String str = "hello";
		System.out.println(str + " -> " + doubleLongOfString(str));
		
		String letters = "abcdefghijklmnpqrsuvwxyz";
		System.out.println(moveLetterR(letters, -1));
		System.out.println(moveLetterR(letters, 3));
	}
	
	private static int doubleLongOfString(String str) {
		int x = str.length() * 2;
		return x;
	}
	
	private static char[] moveLetterR(String str, int k) {
		char[] arr = str.toCharArray();
		char[] arrN = new char[arr.length];
		int j = -arr.length - k;
		while (j < 0) j += arr.length;
		for (int i = 0; i < arr.length; i++) {
			arrN[Math.abs((i + j) % arr.length)] = arr[i];
		}
		return arrN;
	}
}
