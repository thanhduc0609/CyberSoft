import java.util.Scanner;

public class EX1 {

	public static void main(String[] args) { 	
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		final int CNT = 5 ;
		System.out.println("Tính trung bình năm số nhập: ");
		for(int i =1 ;i <= CNT ;i++) {
			System.out.print("Vui lòng nhập số thứ " + i + ": ");
		int number = sc.nextInt();
			sum += number;
		}
		double avrSum = (double) sum / CNT;
		System.out.println("Trung bình của năm số nhập là: " + avrSum);
		
	}

}
