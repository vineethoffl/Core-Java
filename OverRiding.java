package CoreJava;
 class x {
	 void mul(int a,int b)
	 {
		 int s=a*b*2;
		 System.out.println(s);
	 }
	}
	class y extends x {
		void mul(int a,int b)
		{
			int s=a*b;
			System.out.println(s);
		}
	 }
	public class OverRiding {
	public static void main(String[] args) {
	     x obj=new y();
	     obj.mul(5,10);
	}
	}


