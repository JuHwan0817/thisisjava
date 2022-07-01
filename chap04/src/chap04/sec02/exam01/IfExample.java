package chap04.sec02.exam01;

public class IfExample {

	public static void main(String[] args) {
		int score = 93;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}
		
		if(score<90)		//if는 다음 한줄까지 {}영향을 받음 ( {} 한줄 생략 가능)
			System.out.println("점수가 90보다 적습니다.");
		
		System.out.println("등급은 B 입니다.");
	}

}
