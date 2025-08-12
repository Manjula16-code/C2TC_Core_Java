package com.tnsif.hierarchialinheritance;

public class Student extends Citizen {
	private int rollNo;
	private String CollegeName;
	public Student() {
		super();
	}
	public Student(String name, String address, long adharNumber, long phNo, int rollNo, String CollegName, String CollegeName) {
		super(name, address, adharNumber, phNo); //this will call parent class constructor parameters so super keyword is used
		this.CollegeName= CollegeName;
		this.rollNo=rollNo;
		
		}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCollegeName() {
		return CollegeName;
	}
	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", CollegeName=" + CollegeName + "]," + super.toString();
		}

}
