package person;

public class Person {

	private int age;
	private String name;
	private double weight;
	private double length;

	public Person(int age, String name, double weight, double length) {
		this.age = age;
		this.name = name;
		this.weight = weight;
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		if (length > this.length) {
			this.length = length;
		} else if (length < this.length && this.age >= 67) {
			this.length = length;
		}
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if (weight > 0) {
			this.weight = weight;
		}
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return this.age;
	}

}
