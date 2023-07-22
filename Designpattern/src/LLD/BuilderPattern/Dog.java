package LLD.BuilderPattern;

public class Dog {
	
	private String name;
	private String gender;
	private String breed;
	private double price;
	
	public Dog(DogBuilder builder) {
		System.out.println("Dog cons");
		this.name = builder.getName();
		this.gender=builder.getGender();
		this.breed=builder.getBreed();
		this.price=builder.getPrice();
	}

	public String getName() {
		System.out.println("Dog getname");
		return name;
	}

	private void setName(String name) {
		System.out.println("Dog setname");
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	private void setGender(String gender) {
		this.gender = gender;
	}

	public String getBreed() {
		return breed;
	}

	private void setBreed(String breed) {
		this.breed = breed;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	@Override
	public String toString() {
		return "Dog [name=" + name + ", gender=" + gender + ", breed=" + breed 
				+ ", price=" + price + "]";
	}



	public static class DogBuilder{
		private String name;
		private String gender;
		private String breed;
		private double price;
		public String getName() {
			System.out.println("DogBuuild getName");
			return name;
		}
		public DogBuilder setName(String name) {
			System.out.println("Dogbuild setName");
			this.name = name;
			return this;
		}
		public String getGender() {
			return gender;
		}
		public DogBuilder setGender(String gender) {
			this.gender = gender;
			return this;
		}
		public String getBreed() {
			return breed;
		}
		public DogBuilder setBreed(String breed) {
			this.breed = breed;
			return this;
		}
		public double getPrice() {
			return price;
		}
		public DogBuilder setPrice(double price) {
			this.price = price;
			return this;
		}
		

		public Dog build() {
			System.out.println("Dogbuild");
		return new Dog(this);
		}
	}
	
	

}
