package Week2;

import java.util.Iterator;
import java.util.Scanner;

//vòng lặp là lặp đi lặp lại 1 đoạn code với số lần
public class Day1_Loop {
	public static void main(String[] args) {
		// trong vòng for có 3 phần
		// phần đầu: biến được lặp
		// phần giữa: điều kiện lặp, biểu thức so sánh
		// phần cuối: bước nhảy
		// for là 1 biến thể của while
//		int i = 0;
//		for (; i < 100 && i + 10 == 0; ++i) {
//			System.out.println("trong vòng lặp i=" + i);
//		}
//		System.out.println("sau vòng lặp i="+i);

		// Tổng các số lẻ nhỏ hơn hay bằng n.
		Scanner scan = new Scanner(System.in);
		String input = "";
		int n = Integer.MIN_VALUE;
		int num = Integer.MIN_VALUE;
//		int result = 0;
		String result = "";

		System.out.print("Nhập n: ");
		input = scan.next();
		n = Integer.parseInt(input);
//
//		for (int i = 1; i < n; i++) {
////			if (i % 2 != 0) {
////				result += i;
////			}
//			result = i % 2 != 0 ? result + i : result;
//		}
//		System.out.println("Tổng các số lẻ nhỏ hơn hay bằng " + n + ": " + result);

		// while cần có điều kiện dừng
		// while sẽ kiểm tra điều kiện trước khi chạy
//		while (n > 10 || n < 0) {
//			System.out.print("Nhập n: ");
//			input = scan.next();
//			n = Integer.parseInt(input);
//		}
//		System.out.println(n);

		// do...while giống while
		// do...while sẽ chạy trước kiểm tra sau
//		do {
//			System.out.print("Nhập n: ");
//			input = scan.next();
//			n = Integer.parseInt(input);
//		} while (n > 10 || n < 0);
//
//		System.out.println(n);

		// foreach dùng để duyệt mảng
//		for (char c : "vu minh chuan".toCharArray()) {
//			System.out.println(c);
//		}

		// Viết chương trình vẽ các tam giác vuông cân n dòng bằng các dấu *.
//		System.out.print("Nhập n: ");
//		input = scan.next();
//		n = Integer.parseInt(input);
//		
//		while (n > 10000 || n < 0) {
//			System.out.print("Nhập lại n: ");
//			input = scan.next();
//			n = Integer.parseInt(input);
//		};
//
//		for (int i = 0; i < n; i++) {
//			input = "";
//			for (int j = n; j > i; j--) {
//				input += " ";
//			}
//			for (int j = 0; j <= i; j++) {
//				input += "* ";
//			}
//			result += input + "\n";
//		}
//		
//		System.out.println(result);
//		456 => 654 => ['4','5','6']
//		for (int i = 0; i < input.length(); i++) {
//			result = input.toCharArray()[i] + result; 
//		}

//		for (char c : input.toCharArray()) {
//			result = c + result; 
//		}
//		num = Integer.parseInt(result);
//		
//		System.out.println(n == num);

		// Tìm và in lên màn hình tất cả các số nguyên trong phạm vi từ 10 đến n sao
		// cho tích của các chữ số bằng 2 lần tổng của các chữ số đó.
		int tong = 0;
		int tich = 1;
		for (int i = 10; i <= n; i++) {
			tong = 0;
			tich = 1;
			for (char c : ("" + i).toCharArray()) {
				num = Integer.parseInt(c + "");
				tong += num;
				tich *= num;
			}
			result = tong * 2 == tich ? result + " " + i : result ; 
		}

		System.out.println(result);
	}

}
