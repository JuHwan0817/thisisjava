package chap07.sec02.exam01_inherintance;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		//DmbCellPhone 객체 생성
		DmbCellphone dmbCellPhone = new DmbCellphone("자바폰", "검정", 10);
		
		//CellPhone으로부터 상속 받은 필드
		System.out.println("모델" + dmbCellPhone.model);
		System.out.println("색상" + dmbCellPhone.color);
		
		//DmbCellPhone의 필드
		System.out.println("채널" + dmbCellPhone.model);
		
		//CellPhone으로부터 상속 받은 필드
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요");
		dmbCellPhone.sendVoice("아~ 예 반갑습니다.");
		dmbCellPhone.hangUp();
		
		//
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}

}
