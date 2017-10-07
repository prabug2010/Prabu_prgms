package prabu.prgms.sample;

public class NewEmployee {

	private double salary;
	private String managername;
	private String dept;

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setManagerName(String managername) {
		this.managername = managername;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getManagerName() {
		return managername;
	}

	public double getSalary() {
		return salary;
	}

	public String getDept() {
		return dept;
	}

	public String toString() {
		String str = "";
		str += "\ndept\t\t" + getDept();
		str += "\nmanagername\t" + getManagerName();
		str += "\nsalary\t\t" + getSalary();
		return str;

	}

	public static void main(String args[]) {
		NewEmployee k = new NewEmployee();
		k.setDept("Testing");
		k.setManagerName("Sukhjeet");
		k.setSalary(45000.00);
		Emp e = new Emp();
		e.setAddress("123, thiyagi natesan street, ammapet, salem - 3");
		e.setAge(29);
		e.setId(125472);
		e.setName("Prabu");
		System.out.println(e);
		System.out.println(k);

	}
}
