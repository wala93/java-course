
public class Student extends Person {

	private int student_id;
	private double GPA;
	private int claas;
	
	 public void setClass (int claas) {
		 this.claas=claas;
		 
	 }
	 
	 public int getClaas () {
		 return claas;
	 }

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	public Student() {
		
		
	}
	public Student(String name, String date_of_birth, char gender, int national_id, int phone_number, String email,int student_id , double GPA,int claas) 
	
	{
		super( name,  date_of_birth, gender,national_id,phone_number,  email);
		this.student_id=student_id;
		this.GPA=GPA;
		this.claas=claas;
	
			}
	 
	
	@Override
	public void print() {
		super.print();
		System.out.println("student-id :"+getStudent_id());
		System.out.println("gpa :"+getGPA());
		System.out.println("class :"+getClaas());
	}
	
}
