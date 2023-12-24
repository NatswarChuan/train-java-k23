package Week4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Cho mảng số nguyên arrA có N phần tử. Tạo ra 2 mảng nguyên arrB và arrC theo
 * quy tắc: mảng arrB gồm các phần tử chẵn của arrA và mảng arrC gồm các phần tử
 * lẻ của arrA.
 * 
 * @author natsw
 *
 */
public class BT4C7 {

	public static void main(String[] args) {
		run();
	}

	public static void run() {
		String input;
		int arrLength;
		int[] arrA;
		int[] arrC;
		int[] arrB;
//		int[][] tempArr;
		
		input = input("Nhap so luong phan tu trong mang: ");
		arrLength = Integer.parseInt(input);
		arrA = inputArray(arrLength);
		
//		tempArr = getArrs(arrA);
		arrB = getArrEven(arrA);
		arrC = getArrOdd(arrA);
		
		System.out.println("Mang so chan: ");
		for (int i : arrB) {
			System.out.println(i);
		}
		System.out.println("Mang so le: ");
		for (int i : arrC) {
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

	public static int[] inputArray(int length) {
		int[] result = new int[length];
		String input;

		for (int i = 0; i < result.length; i++) {
			input = input("Nhap phan tu thu " + i + ": ");
			result[i] = Integer.parseInt(input);
		}

		return result;
	}

	public static int[][] getArrs(int[] arr) {
		int[][] result = new int[2][];
		int[] arrEven = new int[0];
		int[] arrOdd = new int[0];
		int[] arrClone = Arrays.copyOf(arr, arr.length);

		for (int i : arrClone) {
			if (i % 2 == 0) {
				arrEven = Arrays.copyOf(arrEven, arrEven.length + 1);
				arrEven[arrEven.length - 1] = i;
			}else {
				arrOdd = Arrays.copyOf(arrOdd, arrOdd.length + 1);
				arrOdd[arrOdd.length - 1] = i;
			}
		}
		
		result[1] = arrEven;
		result[0] = arrOdd;
		return result;
	}
	
	public static int[] getArrEven(int[] arr) {
		int[] result = new int[0];
		int[] arrClone = Arrays.copyOf(arr, arr.length);

		for (int i : arrClone) {
			if (i % 2 == 0) {
				result = Arrays.copyOf(result, result.length + 1);
				result[result.length - 1] = i;
			}
		}
		return result;
	}
	
	public static int[] getArrOdd(int[] arr) {
		int[] result = new int[0];
		int[] arrClone = Arrays.copyOf(arr, arr.length);

		for (int i : arrClone) {
			if (i % 2 != 0) {
				result = Arrays.copyOf(result, result.length + 1);
				result[result.length - 1] = i;
			}
		}
		return result;
	}
}
