package w3resource;

import java.util.Scanner;

public class BaiTap4 {

	public static void main(String[] args) {
		/*
		 * Nguon: https://www.w3resource.com/java-exercises/datatypes/index.php
		 * Bai tap 4: Viet chuong trinh nhap vao so phut va chuyen doi sang so nam so ngay
		 * 
		 * Input:
		 * 	Nhap vao so phut: 3456789
		 * Output:
		 * 	Thoi gian xap xi: 6 nam and 210 ngay
		 *    
		 */
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Nhap vao so phut: ");
		int minutes = in.nextInt();
		
		int mintues_of_one_day = 60*24;
		
		int day_of_minutes = minutes/mintues_of_one_day;
		
		System.out.println("So nam: " + (day_of_minutes/365) + " nam and " + (day_of_minutes%365) + " ngay");
	}
}
