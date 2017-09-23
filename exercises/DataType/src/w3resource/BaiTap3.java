package w3resource;

import java.util.Scanner;

public class BaiTap3 {

	public static void main(String[] args) {
		/*
		 * Nguon: https://www.w3resource.com/java-exercises/datatypes/index.php
		 * Bai tap 3: Viet chuong trinh nhap vao cac so tu 0 - 1000 va cong tat ca cac chu so cua so do
		 * 
		 * Input:
		 * 	Nhap vao so nguyen (0-1000): 565
		 * Output:
		 * 	Tong cac chu so cua 565: 16
		 *    
		 */
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Nhap vao so nguyen (0-1000): ");
		int number = in.nextInt();
		
		int sum = 0;
		
		char[] number_ch = String.valueOf(number).toCharArray();
		for (int i = 0; i < number_ch.length; i++) {
			sum += number_ch[i] - 48;
		}
		System.out.println("Tong cac chu so cua " + number + " : " + sum);
	}
}
