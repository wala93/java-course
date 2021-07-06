
public class Person {
	
	private String  name;
	private String date_of_birth;
	private char gender;
	private int national_id;
	private int phone_number;
	private String email;

	public void setName (String name) {
		this.name=name;
	}
	public String getName () {
		return name;
	}
	 public String getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getNational_id() {
		return national_id;
	}
	public void setNational_id(int national_id) {
		this.national_id = national_id;
	}
	public int getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	 
	
	public Person(String name, String date_of_birth, char gender, int national_id, int phone_number, String email) {
		super();
		this.name = name;
		this.date_of_birth = date_of_birth;
		this.gender = gender;
		this.national_id = national_id;
		this.phone_number = phone_number;
		this.email = email;
	}
	
	public Person () {}

	public void print () {
		
		System.out.println("name :"+getName ());
		System.out.println("date-of-birth :"+getDate_of_birth());
		System.out.println("gender :"+getGender());
		System.out.println("national-id :"+getNational_id());
		System.out.println("phone -number :"+getPhone_number());
		System.out.println("email :"+getEmail());
		
	}
	
	
}
