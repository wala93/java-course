
public class Developer extends Employee{

	private double bonus;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public Developer (String name, String date_of_birth, char gender, int national_id, int phone_number, String email,int employee_id,String job_position,double salary,double bonus) {
		super(name,date_of_birth, gender, national_id, phone_number, email,employee_id,job_position,salary);
		this.bonus = bonus;
	}
	
	public Developer () {}
	
	@Override
	public void print() {
		super.print();
			
		System.out.println("bonus:"+getBonus());
		
	}
	
	
	
}
