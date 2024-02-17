package LLD.creational.BuilderPattern;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Dog dog = new Dog.DogBuilder().setName("bbb").setGender("M").build();
		//Dog dog1 = new Dog.DogBuilder().setName("bbb").setPrice(5000).build();
		System.out.print(dog);
		//System.out.print(dog1);

	}

}
