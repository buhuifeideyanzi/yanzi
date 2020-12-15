package java1214;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		System.out.println("请输入年份");
//		while循环
		while (true) {
			Scanner in=new Scanner(System.in);
			int year=in.nextInt();
			int flay=0; //flay=0:预设值为非闰年
			if (year%4==0) {
			if (year%100!=0) flay=1; 	
			}
			else if (year%400==0) flay=1;
			if (flay==1) 
			System.out.println(year+"是一个闰年");
			else 
			System.out.println(year+"是一个平年");
			
			
		}
		
	}
