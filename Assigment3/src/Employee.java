
public class Employee extends Person {
	
	private int employee_id;
	private String job_position;
	private double salary;

	public void setEmployee_id( int employee_id) {
		this.employee_id=employee_id;
	}
	 public int getEmployee_id() {
		 return employee_id;
	 }
	public String getJob_position() {
		return job_position;
	}
	public void setJob_position(String job_position) {
		this.job_position = job_position;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Employee () {}
	
	public Employee (String name, String date_of_birth, char gender, int national_id, int phone_number, String email,int employee_id,String job_position,double salary) {
	
		super ( name, date_of_birth, gender, national_id,  phone_number, email);
		this.employee_id=employee_id;
		this.job_position=job_position;
		this.salary=salary;
	}
	@Override
	public void print() {
		super.print();
		System.out.println("employee-id :"+getEmployee_id());
		System.out.println("job_position:"+getJob_position());
		System.out.println("salary:"+getSalary());
	}
}
