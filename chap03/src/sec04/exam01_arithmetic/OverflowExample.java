package sec04.exam01_arithmetic;

public class OverflowExample {

	public static void main(String[] args) {
		/*
		 * int x = 1000000;
		 * int y = 1000000;
		 * int z = x * y;
		 * System.out.println(z); 오버 플로우여서 롱을 써야함
		 */
		
		long x = 1000000;
		long y = 1000000;
		long z = x * y;
		System.out.println(z);
	}

}
