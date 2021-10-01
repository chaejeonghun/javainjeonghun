package Today0930af;

public class RunAnimalsExam {

	public static void main(String[] args) {
		Fish fish = new Fish();
		Dog dog = new Dog();
		Bird bird = new Bird();

		System.out.println(fish.name);
		System.out.println(dog.name);
		System.out.println(bird.name);
		fish.run();
		bird.run();
		dog.run();

	}

}
