package sec10.exam02_static_block;

public class Television {
	int field1;
	
	static String company = "samsung";
	static String model = "LCD";
	static String info;
	/*static String info = company + "-" + model;* 밑에꺼 빼고 이렇게 해도 맞는 표현*/
	
	static { //스태틱 블럭 안에 메소드와 필드를 선언하면 안됌
		//field1 = 10; 이거 안됌
		//method1(); 이거도 안됌
		info = company + "-" + model;
	}
	
	/*static void Method() {   //스태틱 변수는 객체 영향 x
		obj1.company - Television ("LG전자")
	}*/
	void method1() {
		
	}
	static void method2() {
		//this.field1 = 10; 안됌 
		//this.method1(); 안됌 
	}
	static void method3( ) {
		Television obj = new Television();
		obj.field1 = 10;
		obj.method1();
	}
}









