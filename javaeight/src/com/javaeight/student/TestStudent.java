package com.javaeight.student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStudent {

	public static void main(String[] args) {

		Student std1 = new Student(11, "Vaibhav", "Pune", 90987);
		Student std2 = new Student(14, "Rohan", "Kalyan", 34623);
		Student std3 = new Student(15, "Rohit", "Savarde", 47553);
		Student std4 = new Student(16, "Sachin", "Savarde", 35464);
		Student std5 = new Student(18, "Akshay", "Bambavade", 1244575);
		Student std6 = new Student(13, "Sunil", "Satara", 24789);
		Student std7 = new Student(17, "KK", "Assam", 1232345);
		Student std8 = new Student(19, "Jali", "Mumbai", 87654);
		Student std9 = new Student(12, "Ravi", "Mumbai", 109874);
		Student std10 = new Student(0, "A", "Mumbai", 109874);
		Student std11 = new Student(22, "A", "Mumbai", 109874);
		Student std12 = new Student(21, "Aarayan", "Mumbai", 109874);
		
		ArrayList<Student> al=new ArrayList<>();
		al.add(std10);
		al.add(std9);
		al.add(std1);
		al.add(std4);
		al.add(std3);
		al.add(std11);
		al.add(std11);
		al.add(std12);
		al.add(std12);
		al.add(std7);
		al.add(std5);
		al.add(std6);
		al.add(std2);
		al.add(std8);
		al.add(std9);
		
		
//		System.out.println("original array list al = : "+al);
		
		/* List<Student> l= */
//		System.out.println(l);
		
//		System.out.println(al.stream().filter(x -> x.name.startsWith("S") && x.roll>12).collect(Collectors.toList()));
		
		List<Student> sort= al.stream().sorted((e1,e2)-> e1.roll>e2.roll ? 1:-1).filter(n->n.name.startsWith("A")).distinct().collect(Collectors.toList());
//		System.out.println(sort);
		
//		System.out.println(al.stream().sorted((e1,e2)-> e1.roll>e2.roll ? 1:-1).filter(n->n.name.startsWith("A")).distinct().count());
		
		
//=====================================================================================================		
		
		List<Long> li=al.stream().map(Student ::getMobile).collect(Collectors.toList());
		System.out.println(li);
		
		
		
		
		

	}
}