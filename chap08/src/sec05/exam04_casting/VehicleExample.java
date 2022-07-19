package sec05.exam04_casting;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		vehicle.run();
		//vehicle.checkFare(); 형변환을 하지 않아서 실행 안됌 강제 형변환 시키면 가능
		//Bus bus = (Bus) vehicle; 강제 타입 변환 하는법(vehicle)
		//Bus bus = new Bus(); 자식에서 자식 개체라 실행 가능
		//bus.run();
		//bus.checkFare();
		Bus bus = (Bus) vehicle; 
		bus.run();
		//bus.checkFare();
	}

}
