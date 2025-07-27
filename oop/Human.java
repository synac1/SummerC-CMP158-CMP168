import java.util.Objects;

public class Human implements Comparable<Human>{
	private String hairColor;
	private double height;
	private String bloodType;
	private double weight;
	private char gender;
	private int age;
	
	public Human(String hairColor, double height, String bloodType, double weight, char gender, int age) {
		this.hairColor = hairColor;
		this.height = height;
		this.bloodType = bloodType;
		this.weight = weight;
		this.gender = gender;
		this.age = age;
	}
	public Human() {
		this.hairColor = "";
		this.height = 0.0;
		this.bloodType = "";
		this.weight = 0.0;
		this.gender = 'u';
		this.age = 0;
	}
	public String getHairColor() {
		return hairColor;
	}
	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Human [getHairColor()=" + getHairColor() + ", getHeight()=" + getHeight() + ", getBloodType()="
				+ getBloodType() + ", getWeight()=" + getWeight() + ", getGender()=" + getGender() + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human other = (Human) obj;
		return Objects.equals(bloodType, other.bloodType) && gender == other.gender
				&& Objects.equals(hairColor, other.hairColor)
				&& Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}
	@Override
	public int compareTo(Human other) {
		if (this.getAge()<other.getAge())
			return -1;
		else if (this.getAge()>other.getAge())
			return 1;
		return 0;
	}
	
}
