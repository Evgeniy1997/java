package by.gsu.pms;

public class Employee {
	private String name;
	private String gender;
	private int workExperience;
	private int salary;
	private String dateBirthday;
	private int taxes;
	
	public Employee(String name, String gender, int workExperience, int salary, String dateBirthday, int taxes) {
		super();
		this.name = name;
		this.gender = gender;
		this.workExperience = workExperience;
		this.salary = salary;
		this.dateBirthday = dateBirthday;
		this.taxes = taxes;
	}
	
	public Employee(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public Employee() {
		super();
	}
	
	public String getDateBirthday() {
		return dateBirthday;
	}
	public void setDateBirthday(String dateBirthday) {
		this.dateBirthday = dateBirthday;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int getWorkExperience() {
		return workExperience;
	}
	public void setWorkExperience(int workExperience) {
		this.workExperience = workExperience;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getTaxes() {
		return taxes;
	}
	public void setTaxes(int taxes) {
		this.taxes = taxes;
	}
	
	public String writerInfo() {
		return "Employee: \n";
	}

	public String fieldsToString() {
		return "name: "+name+"; "+"gender: "+gender+"; "+"Exp: "+workExperience+"; "+"salary: "+salary+"; "
	+"brth: "+dateBirthday+"; "+"taxes: "+taxes;
	}
	
	public String toString() {
		return writerInfo()+fieldsToString();
	}
	
	
	
	
	
}
