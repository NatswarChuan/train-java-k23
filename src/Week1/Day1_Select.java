package Week1;

import java.util.Scanner;

public class Day1_Select {

	public static void main(String[] args) {
		// khai báo hằng trước biến
		// tên của hằng tất cả viết hoa
		// cách nhau bằng dấu _
		//		final double MIN_DIEM_XUAT_SAC = 9.0;
		//		final double MIN_DIEM_GIOI = 8.0;
		//		final double MIN_DIEM_KHA = 6.5;
		//		final double MIN_DIEM_TRUNG_BINH_KHA = 5.0;
		//		final double MIN_DIEM_YEU = 3.0;
		//		final double MIN_DIEM_KEM = 0;
		//		
		//		//khai báo biến
		//		//đặt tên biến theo quy chuẩn của ngôn ngữ lập trình (java: camelCase)
		//		//không đặt tên biến vô nghĩa
		//		//ưu tiên đặt tên biến bằng tiếng anh
		//		Scanner scan = new Scanner(System.in);
		//		double diemTrungBinh = 0;
		//		String input = "";
		//		String result = "";
		//		
		//		//nhập dữ liệu (input)
		//		System.out.print("Nhập điểm trung bình: ");
		//		input = scan.next();
		//		diemTrungBinh = Double.parseDouble(input);
		//		
		//		//xử lý logic
		//		//if -> nếu
		//		if(diemTrungBinh >= MIN_DIEM_XUAT_SAC) {
		//			result = "xuất sắc";
		//		}
		//		//else if -> ngược lại nếu
		//		else if(diemTrungBinh >= MIN_DIEM_GIOI) {
		//			result = "giỏi";
		//		}
		//		else if(diemTrungBinh >= MIN_DIEM_KHA) {
		//			result = "khá";
		//		}
		//		else if(diemTrungBinh >= MIN_DIEM_TRUNG_BINH_KHA) {
		//			result = "trung bình khá";
		//		}
		//		else if(diemTrungBinh >= MIN_DIEM_YEU) {
		//			result = "yếu";
		//		}
		//		else if(diemTrungBinh >= MIN_DIEM_KEM) {
		//			result = "kém";
		//		}
		//		//else -> ngược lại
		//		//		else {
		//		//			result = "kém";
		//		//		}
		//		
		//		//xuất kết quả
		//		System.out.println("học sinh đạt loại " + result);

		// khai báo hằng
		final String BLACK = "BLACK";
		final String BLUE = "BLUE";
		final String GREEN = "GREEN";
		final String RED = "RED";

		// khai báo biến
		Scanner scan = new Scanner(System.in);
		String input = "";
		String color = "";
		String result = "";

		System.out.print("Nhập màu: ");
		input = scan.next();
		color = input;

		// xử lý logic
		// có 1 biến nhưng kiểm tra ở nhiều mệnh đề SO SÁNH BẰNG => swich case
		//		if(color.equals("r") || color.equals("R")) {
		//			result = RED;
		//		}
		//		else if (color.equals("g")|| color.equals("G")) {
		//			result = GREEN;
		//		}
		//		else if (color.equals("b") || color.equals("B")) {
		//			result = BLUE;
		//		}
		//		else {
		//			result = BLACK;
		//		}

		// break áp dụng cho cả vòng lặp
		switch (color) {
		case "r":
		case "R":
			result = RED;
			break;
		case "b":
		case "B":
			result = BLUE;
			break;
		case "g":
		case "G":
			result = GREEN;
			break;
		// nếu các case không đúng sẽ vào default
		default:
			result = BLACK;
			break;
		}

		// xuất kết quả
		System.out.println(result);
	}
}
