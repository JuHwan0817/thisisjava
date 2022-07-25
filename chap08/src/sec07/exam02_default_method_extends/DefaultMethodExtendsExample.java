package sec07.exam02_default_method_extends;

public class DefaultMethodExtendsExample {

	public static void main(String[] args) {
		childInterface1 ci1 = new childInterface1() {
			@Override
			public void method1() {}
			@Override
			public void method3() {}
		};
		
		ci1.method1();
		ci1.method2();
		ci1.method3();
		
		ChildInterface2 ci2 = new childInterface2() {
			@Override
			public void method1() {}
			@Override
			public void method3() {}
		};
		
		ci1.method1();
		ci1.method2();
		ci1.method3();
		
		ChildInterface3 ci3 = new childInterface3() {
			@Override
			public void method1() {}
			@Override
			public void method3() {}
		};
		
		ci1.method1();
		ci1.method2();
		ci1.method3();
	}
	
}
