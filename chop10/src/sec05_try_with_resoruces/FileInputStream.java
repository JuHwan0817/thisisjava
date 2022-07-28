package sec05_try_with_resoruces;

public class FileInputStream implements AutoCloseable {	//인터페이스를 구현 하고 오버라이드를 해줘야 실행이 가능하다.
	private String file;
	public FileInputStream(String file) {
		this.file = file;
	}
	public void read() {
		System.out.println(file +"을 읽습니다.");
	}
	@Override
	public void close() throws Exception {
		System.out.println(file +"을 닫습니다.");
	}
}
