package Day_5;

public class BasicOfFunction {

	public static void main(String[] args) {
		System.out.println("Before fun 2");
		fun2();
		System.out.println("After fun 2");
	}

	private static void fun2() {
		System.out.println("Before fun 1");
		fun1();
		System.out.println("After fun 1");
		
	}

	private static void fun1() {
		System.out.println("fun 1");
		
	}

}
