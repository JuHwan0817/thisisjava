package sec01_exam01_equals;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	/*@Override  //주석 풀면 example obj2 번이 동등하지 않다고 뜸
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}*/
}
