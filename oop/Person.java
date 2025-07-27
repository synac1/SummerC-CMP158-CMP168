import java.util.ArrayList;
import java.util.Objects;

public class Person extends Human {
	private String name;
	private double bankBalance;
	private String major;
	private int id;
	private String address;
	private ArrayList<Occupation> occupations;
	
	public Person(String hairColor, double height, String bloodType, double weight, char gender, String name,
			double bankBalance, String major, int id, String address) {
		super(hairColor, height, bloodType, weight, gender, id);
		this.name = name;
		this.bankBalance = bankBalance;
		this.major = major;
		this.id = id;
		this.address = address;
		this.occupations.add( new Occupation("Teacher", 10.5));
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBankBalance() {
		return bankBalance;
	}
	public void setBankBalance(double bankBalance) {
		this.bankBalance = bankBalance;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Occupations"+occupations.toString() +this.getHeight()+" getName()=" + getName() + ", getBankBalance()=" + getBankBalance() + ", getMajor()="
				+ getMajor() + ", getId()=" + getId() + ", getAddress()=" + getAddress() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		return Objects.equals(address, other.address)
				&& Double.doubleToLongBits(bankBalance) == Double.doubleToLongBits(other.bankBalance) && id == other.id
				&& Objects.equals(major, other.major) && Objects.equals(name, other.name);
	}
	class Occupation{
		private String title;
		private double yearsOfExperience;
		public Occupation(String title, double years) {
			this.title = title;
			this.yearsOfExperience = years;
		}
		public void increaseYearsOfExperience() {
			this.yearsOfExperience += 0.5;
		}
		public String getTitle() {
			return title;
		}
		public double getYearsOfExperience() {
			return yearsOfExperience;
		}
	}
}
