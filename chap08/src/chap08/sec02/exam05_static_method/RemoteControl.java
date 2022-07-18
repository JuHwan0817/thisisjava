package chap08.sec02.exam05_static_method;

public interface RemoteControl {
	//상수 필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	//실행 하려고 만드는게 아님
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴드 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
