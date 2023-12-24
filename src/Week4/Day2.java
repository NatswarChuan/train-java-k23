package Week4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("-------------------");
		testArr(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}

	public static String input(String message) {
		String result;
		Scanner scanner = new Scanner(System.in);

		System.out.print(message);
		result = scanner.nextLine();

		return result;
	}

	public static void showMenu() {
		String menu = "------------------------------------------------------\n"
				+ "A = Tổng các số lẻ nhỏ hơn hay bằng n\r\n" + "B = Tích các bội số của 3 và nhỏ hơn hoặc bằng n\r\n"
				+ "C = 1 + 1/2 + 1/3 + . . . + 1/n-1.\r\n" + "D = 2 * 4 * 6 * … 2n.\r\n" + "E = N! = 1 * 2 * . . * n.";
		char chosen;
		int n;

		System.out.println(menu);
		chosen = input("lua chon cac phep tinh phi tren:").charAt(0);
		n = Integer.parseInt(input("nhap n: "));

		switch (chosen) {
		case 'a', 'A':
			System.out.println("A = Tổng các số lẻ nhỏ hơn hay bằng n");
			break;
		case 'b', 'B':
			System.out.println("B = Tích các bội số của 3 và nhỏ hơn hoặc bằng n");
			break;
		case 'c', 'C':
			System.out.println("C = 1 + 1/2 + 1/3 + . . . + 1/n-1.");
			break;
		case 'd', 'D':
			System.out.println("D = 2 * 4 * 6 * … 2n.");
			System.out.println("ket qua la: " + getNumberPow(n));
			break;
		case 'e', 'E':
			System.out.println("E = N! = 1 * 2 * . . * n.");
			break;
		default:
			showMenu();
			break;
		}
	}

	public static int getNumberPow(int n) {
		int result = 1;

		for (int i = 1; i < n; i++) {
			result *= 2 * n;
		}

		return result;
	}

	public static int[] inputArray(int length) {
		int[] result = new int[length];
		String input;

		for (int i = 0; i < result.length; i++) {
			input = input("Nhap phan tu thu " + i + ": ");
			result[i] = Integer.parseInt(input);
		}

		return result;
	}

	public static boolean checkEleNum(int n) {
		boolean result = true;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				result = false;
			}
		}

		return result;
	}

	public static void testArr(int[] arr) {
		int[] arrClone = Arrays.copyOf(arr, arr.length);
		arrClone[0] = 9;
		arrClone[8] = 1;
	}
}