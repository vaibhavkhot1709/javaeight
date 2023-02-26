package com.javaeight.student;

public class Student {

	int roll;
	String name;
	String address;
	long mobile;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, String address, long mobile) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.mobile = mobile;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
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

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + ", mobile=" + mobile + "]";
	}

}
