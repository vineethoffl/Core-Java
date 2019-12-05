package Interface;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Classinher obj=new Classinher();
		int a=s.nextInt();
		int b=s.nextInt();
		obj.add(a, b);
		obj.sub(a, b);
		obj.mul(a, b);
		obj.div(a, b);
		

	}

}
