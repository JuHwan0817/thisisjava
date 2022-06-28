package sec01.exam02_char;

public class CharExample {

	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		
		char c4 = '가';					//문자를 직접 젖장
		char c5 = 44032;				//10진수로저장
		char c6 = '\uac00';				//16진수로저장
				
		int unicode = c1;               //유니코드 열기
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(unicode);
		
		

	}

}
