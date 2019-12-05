package CoreJava;

import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		abstractclass obj=new inheritclass();
				Scanner s=new Scanner(System.in);
				System.out.println("enter the values");
				int a=s.nextInt();
				int b=s.nextInt();
				obj.add(a,b);
				obj.subtract(a, b);
	}
}
