package test;

class A {
	public static void main(String arg[]) {
		B b = (B)new A();
	}
}
class B extends A{
	
}
public class TestProgram1 {

	public TestProgram1() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 0x000A;
		System.out.println("Main method1");
		System.out.println(c);
		main("think");
	}
	public static void main(String arg)
	{
		System.out.println("Test method");
	}

}
