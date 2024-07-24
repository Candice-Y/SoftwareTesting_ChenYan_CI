package Calculate;

public class Caculater {
	public int add(int a, int b) {
		return (a + b);
	}

	public int subtract(int a, int b) {
		return (a - b);
	}

	public int multiply(int a, int b) {
		return (a * b);
	}

	public int divide(int a, int b) {
		if (b == 0) {
			System.out.print("除数不能为0!!");
			return 0;
		} else {

			return (a / b);
		}

	}

	public static void main(String[] args) {
		Caculater c = new Caculater();
		int p = c.add(1, 2);
		System.out.println("运算结果为:" + p);
	}

}
