package CoreJava;
abstract class Person
{
	abstract void learn();
}
 class JavaAnonymousInnerClass 
 {
	 public static void main(String[]args)
	 {
	 Person p=new Person()
		{
		 void learn()
		 {
			 System.out.println("Welcome to DDU-GKY Face kollam");
		 }
		  };
			 p.learn();
		 		 
 }
 }
