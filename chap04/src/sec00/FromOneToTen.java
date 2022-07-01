package sec00;

public class FromOneToTen {

	public static void main(String[] args) {
		int total = 0;
		for(int i=1; i<=10; i++) {
			total = total + i;
			System.out.print(i);
			if(i!=10) {
				System.out.print("+");	
			}
		}
		
		System.out.print("="+total);
	}

}
