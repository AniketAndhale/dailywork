package aniket12;

import java.io.Serializable;

public class Employee1 implements Serializable{


		/**
	 * 
	 */
	private static final long serialVersionUID = 2235758033860485317L;
		private int id;
		private String name;
		transient private String address;
		private int age;
		private double phone;
		transient private double salary;

		public Employee1() {

		}

		public Employee1(int id, String name, String address, int age, double phone, double salary) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
			this.age = age;
			this.phone = phone;
			this.salary = salary;
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

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public double getPhone() {
			return phone;
		}

		public void setPhone(double phone) {
			this.phone = phone;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			return id + " : " + name + " : " + address + " : " + age + "  : " + phone + " : " + salary;
		}

	}

