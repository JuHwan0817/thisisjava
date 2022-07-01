package sec00;

public class GoGoDan {

	public static void main(String[] args) {
		int total = 0;
		for(int i=2; i<=9; i++) {		//구구단 숫자 표현(1단,2단,3단 등)
			System.out.print("["+i+"단]\t");		//그걸 출력
		}
		System.out.println();
		for(int i=1; i<=9; i++) {		//구구단 앞자리 표현(2x? ,3x? 등)
			for(int j=2; j<=9; j++) {		//구구단 뒷자리 표현(?x2 ?x3 등)
				System.out.print(j+"x"+i+"="+j*i+"\t");		//구구단 계산식 (2x2=4 등 \t는 줄바꿈)
			}
			System.out.println();
		}
	}

}
