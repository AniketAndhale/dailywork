package aniket12;

public class Empp {
	private int id;
	private String name;
	private String address;
	private double salary;
	private double phone;
	public Empp()
	{
		
	}
	
	public Empp(int id, String name, String address, double salary, double phone) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getPhone() {
		return phone;
	}

	public void setPhone(double phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Empp [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + ", phone=" + phone
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getAddress()=" + getAddress()
				+ ", getSalary()=" + getSalary() + ", getPhone()=" + getPhone() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

	//public String toString() {
	//return id+":"+name+":"+address+":"+salary":"+phone;
	//}


//public int compareTo(Empp emp1)
//{
	//if(this.id>emp1.id)
	//{
		//return 1;
//}
	
	//if(this.id==emp1.id)
	//{
		//return 0;
//}
	//else
	//{
		//return 1;
	//}
//}
	
	class SortByid implements Comparator<Empp>
	{
		public int compare(Empp l,Empp k)
		{
			if(l.getId()>k.getId())
			{
				return 1;
			}
			else if(l.getId() == k.getId()){
				
					return 0;
				}
				else {
					return -1;
				}
			}
	}
	}
