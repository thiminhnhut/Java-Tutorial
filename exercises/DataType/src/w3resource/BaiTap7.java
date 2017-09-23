package w3resource;

import java.util.Scanner;

public class BaiTap7 {

	public static void main(String[] args) {
		/*
		 * Nguon: https://www.w3resource.com/java-exercises/datatypes/index.php
		 * Bai tap 7: Viet chuong trinh nhap vao quang va thoi gian roi tinh ra van toc
		 * 
		 * Input:
		 * 	Quang duong (m): 2500.0
		 * 	Hour: 5
		 * 	Minute: 56
		 * 	Second: 23
		 * Output:
		 * 	Van toc (m/s): 0.11691530655193377
		 *    
		 */
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Quang duong (m): ");
		double distance = in.nextDouble();
		
		System.out.print("Hour: ");
		int hour= in.nextInt();
		
		System.out.print("Minute: ");
		int minute= in.nextInt();
		
		System.out.print("Second: ");
		int second= in.nextInt();
	
		int totalSecond = hour*3600 + minute*60 + second;
		double speed = distance/totalSecond;
		
		System.out.println("Van toc (m/s): " + speed);
	}
}