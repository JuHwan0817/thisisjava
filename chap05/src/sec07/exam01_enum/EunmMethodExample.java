package sec07.exam01_enum;

public class EunmMethodExample {

	public static void main(String[] args) {
		// name() 메소드 <컨텐츠 내용을 뜻함>
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		//ordinal() 메소드 <요일이 몇 번째 순서에 있는지 알려주는거임>
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//compareTo() 메소드 <result1 은 day2를 기준으로 day1이 어느 순서에 있는지의 계산식 = -2>
		//compareTo() 메소드 <result2 은 day1을 기준으로 day2이 어느 순서에 있는지의 계산식 = 2>
		//compareTo(day2) <day2를 기준으로 라는뜻 이거 생각하고 바로 윗줄 보셈>
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day1.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf()메소드 Week.SATURDAY || weekDay == Week.SUNDAY) <<둘중 하나만 해당해도 주말이군요 출력
		//Week weekday = Week.valueOf("SUNDAY"); ()안에 무슨 요일이냐에 따라 주말이군요 or 평일이군요 출력
		Week weekDay = Week.valueOf("SUNDAY");
		  if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
		  		System.out.println("주말 이군요");
		  } else {
		  		System.out.println("평일 이군요");
		  }
		
		/*if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말 이군요");
			} else {
				System.out.println("평일 이군요");
			}
		}*/
		
		//values() 메소드 for문과 동일
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
	}

}
