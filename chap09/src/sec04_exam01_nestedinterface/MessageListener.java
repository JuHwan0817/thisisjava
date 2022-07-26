package sec04_exam01_nestedinterface;

public class MessageListener implements Button.onClickListener{
	@Override
	public void onClick() {
		System.out.println("메세지를 보냅니다.");
	}
	
}
