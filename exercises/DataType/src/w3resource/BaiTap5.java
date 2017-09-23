package w3resource;

import java.util.Scanner;

public class BaiTap5 {

	public static void main(String[] args) {
		/*
		 * Nguon: https://www.w3resource.com/java-exercises/datatypes/index.php
		 * Bai tap 5: Viet chuong trinh in thoi gian hien tai theo GMT voi mui gio duoc nhap vao
		 * 
		 * Input:
		 * 	Time zone offset to GMT: 256
		 * Output:
		 * 	Current time is 23:40:24
		 *    
		 */
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Time zone offset to GMT: ");
		long time_zone = in.nextLong();
		
		long totalMillis = System.currentTimeMillis();
		long totalSecond = totalMillis/1000;
		long totalMinute = totalSecond/60;
		long totalHour = totalSecond/3600;
		
		long currentSecond = totalSecond % 60;
		long currentMinute = totalMinute % 60;
		long currentHour = (totalHour + time_zone) % 24;
		
		System.out.println("Thoi gian: " + currentHour + ":" + currentMinute + ":" + currentSecond);
	}
}
