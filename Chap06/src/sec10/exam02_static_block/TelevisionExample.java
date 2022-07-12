package sec10.exam02_static_block;

public class TelevisionExample {

	public static void main(String[] args) {
		//메인함수 static은 객체를 생성하고 써야한다.
		
		/*Television myCar = new Television();
		myCar.field1 = 60;
		myCar.method();*/
		Television obj1 = new Television();
		Television obj2 = new Television();
		obj1.company = "LG전자";
		System.out.println(Television.info);
	}

}
