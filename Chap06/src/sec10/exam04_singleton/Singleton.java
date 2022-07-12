package sec10.exam04_singleton;

public class Singleton {
	//객체를 하나 밖에 선언하지 못함.
	private static Singleton singLeton = new Singleton();
	
	private Singleton() {}
		
		static Singleton getInstance() {
			return singLeton;
		
	}
}
