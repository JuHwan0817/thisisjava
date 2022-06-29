package sec04.exam01_arithmetic;

public class StringConcatExample {

	public static void main(String[] args) {
		String str1 = "JDK" + 6.0;		//앞이 문자면 뒤도 문자로 인식
		String str2 = str1 + " 특징";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;
		String str4 = 3 + 3.0 +"JDK";		//숫자 먼저 문자열 나중에 
		System.out.println(str3);
		System.out.println(str4);
	}

}
