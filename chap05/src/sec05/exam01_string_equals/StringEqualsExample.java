package sec05.exam01_string_equals;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "정주환";
		String strVar2 = "정주환";
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		String strVar3 =new String("정주환");
		String strVar4 =new String("정주환");
		if(strVar1 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		}else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		if(strVar1.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
	}
}
