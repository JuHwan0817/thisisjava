package sec05.exam01_exit;

public class GetPropertyExample {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		
		System.out.println("운영체제 이름: " + osName);
		System.out.println("사용자 이름: " + userName);
		System.out.println("사용자 홈 디렉토리: " + userHome);
		
		System.out.println("------------------------------");
		System.out.println("[ key ] value");
		System.out.println("------------------------------");
		properties props = System.getProperties();
		Set keys = props.keySet();
		for(Object objKey : keys) {
			
		}
		
	}

}
