package sec11.exam01_final;

public class Person {
	//String 자바에서 만든 클래스 구래서 앞이 대문자임(변수 형태)
	//final 은 객체마다 선언됌
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
