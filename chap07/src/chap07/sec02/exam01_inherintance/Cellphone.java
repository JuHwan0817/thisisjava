package chap07.sec02.exam01_inherintance;

public class Cellphone {
	//필드
	String model;
	String color;
	
	//생성자
	
	//메소드
	void powerOn() {System.out.println("전원을 켭니다.");}
	void powerOff() {System.out.println("전원을 끕니다.");}
	void bell() {System.out.println("벨이 울립니다.");}
	void sendVoice(String messge) {System.out.println("자기: " + messge);}
	void receiveVoice(String messge) {System.out.println("상대방 : " + messge);}
	void hangUp() {System.out.println("전화를 끊습니다.");}
}
