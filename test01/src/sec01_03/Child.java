package sec01_03;

public class Child extends Parent {
	private String name;
	
	public Child() {	//this와 super 는 같이 사용할수없음 //(1) super(); 생성되어야함 그러나 this() 때문에 생성되지 않음.
		this("홍길동");	//(2) 인자가 하나인 아래 메소드 child(String name)가 실행됌.
		System.out.println("Child() call");
	}
	public Child(String name) {	//(3) 이 생성자(파라메터가 하나인..)super()를 호출
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
