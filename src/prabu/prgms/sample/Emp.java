package prabu.prgms.sample;

public class Emp {

	private int id;
	private String name;
	private int age;
	private String address;

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String toString() {
		String st = "";
		st += "\nname\t\t" + getName();
		st += "\nid\t\t" + getId();
		st += "\nage\t\t" + getAge();
		st += "\naddress\t\t" + getAddress();

		return st;
	}
}
