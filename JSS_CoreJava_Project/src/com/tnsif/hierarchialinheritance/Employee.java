package com.tnsif.hierarchialinheritance;

public class Employee extends Citizen {
	private int eid;
	private float salary;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", salary=" + salary + ", getName()=" + getName() + ", getAddress()=" + getAddress()
				+ ", getAdharNumber()=" + getAdharNumber() + ", getPhNo()=" + getPhNo() + "]";
	}
	public Employee(String name, String address, long adharNumber, long phNo,int eid,float salary) {
		super(name, address, adharNumber, phNo);
		this.eid=eid;
		this.salary=salary;
	}


}
