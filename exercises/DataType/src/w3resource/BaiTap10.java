package w3resource;

import java.util.Scanner;

public class BaiTap10 {

	public static void main(String[] args) {
		/*
		 * Nguon: https://www.w3resource.com/java-exercises/datatypes/index.php
		 * Bai tap 10: Viet chuong trinh tach cac so nguyen trong mot chuoi thanh cac chu so rieng le
		 * 
		 * Input:
		 * 	123456
		 * Output:
		 * 	1 2 3 4 5 6
		 *    
		 */
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Nhao vao so nguyen: ");
		long number = in.nextLong();
		
		long[] sum = new long[20];
		int i = 0;
		while (number != 0) {
			sum[i++] = number%10;
			number = number/10;
		}
		i--;
		while (i >= 0) {
			System.out.print(sum[i] + " ");
			i--;
		}
	}
}