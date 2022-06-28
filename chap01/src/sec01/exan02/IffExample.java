package sec01.exan02;

public class IffExample {
	public static void main(String[] args) {
		int score = 91;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}
		
		if(score < 90)
			System.out.println("점수가 90보다 적습니다.");
			System.out.println("등급은 B 입니다.");	
	}
}
