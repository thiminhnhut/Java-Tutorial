package w3resource;

import java.util.Scanner;

public class BaiTap6 {

	public static void main(String[] args) {
		/*
		 * Nguon: https://www.w3resource.com/java-exercises/datatypes/index.php
		 * Bai tap 6: Viet chuong trinh nhap vao can nang va chieu cao, roi tinh chi so BMI
		 * 
		 * Input:
		 * 	Chieu cao (m): 1.65
		 * 	Can nang (kg):	41
		 * Output:
		 * 	BMI = 15.059687786960517
		 *    
		 */
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Chieu cao (m): ");
		double height = in.nextDouble();
		
		System.out.print("Can nang (kg): ");
		double weight = in.nextDouble();
		
		double indexBMI = weight/Math.pow(height, 2);
		
		System.out.println("BMI = " + indexBMI);
	}
}