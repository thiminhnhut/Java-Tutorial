package w3resource;

import java.util.Scanner;

public class BaiTap2 {

	public static void main(String[] args) {
		/*
		 * Nguon: https://www.w3resource.com/java-exercises/datatypes/index.php
		 * Bai tap 2: Viet chuong trinh nhap vao do dai o don vi inches chuyen don vi meters.
		 * 
		 * Input:
		 * 	Do dai don vi Inches: 1000
		 * Output:
		 * 	Chuyen doi sang don vi Meters: 25.4
		 *    
		 */
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Nhap vao do dai don vi Inches: ");
		double inches = in.nextDouble();
		
		double meters = inches*0.0254;
		
		System.out.print("Chuyen doi sang don vi Meters: " + meters);
	}
}
