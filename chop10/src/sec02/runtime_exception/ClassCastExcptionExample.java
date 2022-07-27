package sec02.runtime_exception;

public class ClassCastExcptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		//changeDog(cat);
	}
	public static void changeDog(Animal animal) {
		//ClassCastExcption  발생 가능
		Dog dog = (Dog) animal;
	}
}

class Animal {}
class Dog extends Animal{}
class Cat extends Animal{}
