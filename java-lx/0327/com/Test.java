package com;

class Test{
	public static void main(String[] args){
		Person p = new Person("二狗子",12);
		System.out.println(p.getInfo());
		Student s = new Student("三胖子","北大",12);
		System.out.println(s.getInfo());
		System.out.println(s.study());
	}

}