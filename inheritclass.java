   package CoreJava;

   public class inheritclass  extends abstractclass {
		 public void add(int a,int b)
		 {
			 System.out.println(a+"+"+b+"="+(a+b));
		 }
		 void subtract(int a,int b)
		 {
			 super.subtract(a,b);
		 }
	}
