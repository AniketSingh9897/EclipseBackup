package day.java;

public class Emp {
	private String name;
	private Double salary;
	private String contactno;
	public Emp(String name, Double salary, String contactno) {
		super();
		this.name = name;
		this.salary = salary;
		this.contactno = contactno;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		if(salary<0)
		{
			
			System.out.println("inavlid salary");
		}
		
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Emp [name=" + name + ", salary=" + salary + ", contactno=" + contactno + "]";
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public void work()
	{
		System.out.println(name+" is working");
	}
}
