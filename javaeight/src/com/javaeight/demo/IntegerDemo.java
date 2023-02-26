package com.javaeight.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerDemo {
	
	public static void main(String[] args) {
//		System.out.println("jay shri Ram");
		
		
		Collection<Integer> cl=new ArrayList<Integer>();
		
		cl.add(45);
		cl.add(60);
		cl.add(20);
		cl.add(50);
		cl.add(30);
		cl.add(7);
		cl.add(80);
		cl.add(9);
		cl.add(9);
		cl.add(81);
		cl.add(81);
		cl.add(81);
		cl.add(81);
		cl.add(46);
		cl.add(46);
		
		
		List< Integer>ll= cl.stream().filter(x -> x %2 !=0).collect(Collectors.toList());
		
		System.out.println(ll);
		
//		List s=cl.stream().sorted().collect(Collectors.toList());
//		System.out.println(s);
//		System.out.println(cl.stream().sorted().distinct().toList());
		
		
//     List l=cl.stream().filter(n -> n>45).collect(Collectors.toList());
//		System.out.println(">>>>>>>>>>> "+l);

//		List l2=cl.stream().sorted().filter(n -> n>45 && n<80).distinct().collect(Collectors.toList());
//		System.out.println("!!!!! "+l2);
		
		
		
		
	}

}
