
public class Employee {

	private String name;
	 private String nationalId;
	 private int salary;
	 
	 public Employee() {};
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNationalId() {
		return nationalId;
	}
	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String name, String nationalId, int salary) {
	
		this.name = name;
		this.nationalId = nationalId;
		this.salary = salary;
	}
	
	public void print() {
		
		System.out.println("name : " + getName());
		System.out.println("national_id: " + getNationalId());
		System.out.println("salary : " + getSalary());
	}
	
		
	
}
