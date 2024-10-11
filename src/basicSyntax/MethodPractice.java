package basicSyntax;

public class MethodPractice {



	public static void main(String[] args) {
		int a =10;
		int b =5;
		result(add(a, b));
		result(subtract(a, b));
		result(multiplyt(a, b));
		result(divide(a, b));


	}

	public static int add(int a ,int b) {
		int num = a + b;
		return num;
	}
	public static int subtract(int a ,int b) {
		int num = a - b;
		return num;
	}
	public static int multiplyt(int a ,int b) {
		int num = a * b;
		return num;
	}
	public static int divide(int a ,int b) {
		int num = a / b;
		return num;
	}

	public static void result(int result) {
		System.out.println("計算結果は"+result+"です。");
	}



}
