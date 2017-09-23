package w3resource;

import java.util.Scanner;

public class BaiTap1 {

	public static void main(String[] args) {
		/*
		 * Nguon: https://www.w3resource.com/java-exercises/datatypes/index.php
		 * Bai tap 1: Viet chuong trinh chuyen doi tu do F sang do C
		 * 
		 * Input:
		 * 	Nhap vao nhiet do F: 212
		 * Output:
		 * 	Ket qua chuyen doi sang do C: 100.0
		 *    
		 */
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Nhap vao nhiet do F: ");
		double tempF = in.nextDouble();
		
		double tempC = 5.0*(tempF - 32)/9.0;
		
		System.out.print("Ket qua chuyen doi sang do C: " + tempC);
	}
}
