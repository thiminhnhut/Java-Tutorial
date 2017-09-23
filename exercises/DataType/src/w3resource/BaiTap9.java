package w3resource;

import java.util.Scanner;

public class BaiTap9 {

	public static void main(String[] args) {
		/*
		 * Nguon: https://www.w3resource.com/java-exercises/datatypes/index.php
		 * Bai tap 9: Viet chuong trinh nhap vao 2 so nguyen: tinh tong, hieu, tich, trung binh cong,
		 * khoang cach giua cac so, so lon nhat va so nho nhat
		 * 
		 * Input:
		 * 	Nhap vao so thu nhat: 12
		 * 	Nhap vao so thu hai: 20
		 * Output:
		 * 	Tong 12 va 20: 32
		 * 	Hieu 12 va 20: -8
		 * 	Tich 12 va 20: 240
		 * 	Trung binh cong 12 va 20: 16
		 * 	Khoang cach giua 12 va 20: 8
		 * 	So lon nhat giua 12 va 20: 20
		 * 	So nho nhat giua 12 va 20: 12
		 *    
		 */
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Nhao vao so thu nhat: ");
		int number1 = in.nextInt();
		
		System.out.print("Nhao vao so thu hai: ");
		int number2 = in.nextInt();
		
		System.out.println("Tong " + number1 + " va " + number2 + " = " + (number1 + number2));
		System.out.println("Hieu " + number1 + " va " + number2 + " = " + (number1 - number2));
		System.out.println("Tich " + number1 + " va " + number2 + " = " + (number1 * number2));
		System.out.println("Trung binh cong " + number1 + " va " + number2 + " = " + (number1 + number2)/2);
		System.out.println("Khoang cach giua " + number1 + " va " + number2 + " = " + Math.abs(number1 - number2));
		System.out.println("So lon nhat giua " + number1 + " va " + number2 + " = " + Math.max(number1, number2));
		System.out.println("So nho nhat giua " + number1 + " va " + number2 + " = " + Math.min(number1, number2));
	}
}