package com;

public class Student extends Person{

	private String school;

	public Student(){}

	public Student(String name,String School,int age){
		setName(name);
		setAge(age);
		this.school = school;
	}
	public String study(){
		return "ÐÕÃû:" + getName() + "Ñ§Ï°¡£¡£¡£";
	}
}