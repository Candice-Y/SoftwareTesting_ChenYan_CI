package Calculate;

public class test {
	public static void main(String[] args) {
		Caculater test = new Caculater();
		System.out.println("加法运算结果是:" + test.add(12, 13));
		System.out.println("减法运算结果是:" + test.subtract(18, 2));
		System.out.println("乘法运算结果是:" + test.multiply(2, 6));
		System.out.println("除法运算结果是:" + test.divide(4, 4));
	}
}
