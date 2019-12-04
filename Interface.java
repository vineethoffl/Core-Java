package CoreJava;
interface It1
{
	void method1();
	void method2();
	void method3();
	}
class Interface implements It1
{
	public void method1()
	{
		System.out.println("method 1");
	}
	public void method2()
	{
		System.out.println("method 2");
	}
	public void method3()
	{
		System.out.println("method 3");
	}

//public class Interface {
	public static void main(String[] args) {
		It1 t=new Interface();
		t.method1();
		t.method2();
		t.method3();
	}

}
