package Week1;

/**
 * thứ 7 ngày 25/11/2023
 * 
 * @author natsw
 *
 */
public class Day1_Basic {
	public static void main(String[] args) {
		//hằng
		final double PI = 3.14;
		//biến
		int number1 = 1;
		
		// có kiểu dữ liệu chính 
		// 1. kiểu số (number, int, double, long,...)
		// 		1.1 số nguyên (số không có phẩy. VD: int, long)
		//		1.2 số thực (số có phẩy. VD: float, double)
		// 		1.3 đúng sai
		// 2. kiểu chữ (string, char, text)
		// 3. đối tượng
		
		// toán tử 3 ngôi: mệnh đề ? {đúng} : {sai}
		
		// AND (&&): cả 2 mệnh đề đều phải đúng là đúng. Chỉ cần 1 mệnh đề sai là sai
		// OR (||): chỉ cần 1 mệnh đề đúng là đúng. Cả 2 mệnh đề sai mới sai
		// phủ định (!): Đúng thành sai. Sai thành đúng.
		
		boolean check1 = false;
		boolean check2 = true;
		boolean check3 = false;
		System.out.println(check1 || !(check2 && check3));
	}
}
