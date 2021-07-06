
public class NewDeveloper extends Employee{

	private int bonus;

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public NewDeveloper(String name, String nationalId, int salary, int bonus) {
		super(name, nationalId, salary);
		this.bonus=bonus;
	}
	@Override
	public void print() {
		super.print();
		System.out.println("bonus : "+ getBonus());
	}
	
}
