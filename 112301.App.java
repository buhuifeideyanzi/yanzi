package pac;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入数字");
		while (true) {
			Scanner su=new Scanner(System.in);
			int num=su.nextInt();
			if (num==1) {
				int x=(int)(Math.random()*100);
				int y=(int)(Math.random()*100);
				System.out.println("随机坐标：("+x+","+y+")");
			}else {
				System.out.println("输入数字错误，请输入1");
			}
		}
	}

}
