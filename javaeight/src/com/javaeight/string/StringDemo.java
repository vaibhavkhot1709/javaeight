package com.javaeight.string;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringDemo {

	public static void main(String[] args) {
		
		String str="My name nameew ndddhv nn nnjkd is Vaibhav Khot";
		
		String [] ss=str.split(" ");
		
		ArrayList< String> al=new ArrayList<>();
		
		for(String s:ss) {
			al.add(s);
		}
		
//		System.out.println(al);
		
		List aa = al.stream().filter(x -> /* x.startsWith("n") && */x.endsWith("v")).collect(Collectors.toList());
		
		System.out.println(aa);
		
		
		
	
		
		
		
		
		

	
	
	
	
	}
}
