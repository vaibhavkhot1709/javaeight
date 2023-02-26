package com.javaeight.methods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MethodTest {
	
	public static void main(String[] args) {
		
		List<Integer> ll=new ArrayList<>();
		
		ll.add(19);
		ll.add(11);
		ll.add(16);
		ll.add(12);
		ll.add(20);
		ll.add(17);
		ll.add(18);
		ll.add(15);
		ll.add(14);
		ll.add(13);
		
		
		System.out.println(ll.stream().sorted().collect(Collectors.toList()));
		
//		limit method
		
//		System.out.println(ll.stream().limit(15).collect(Collectors.toList()));
		
		ll.parallelStream();
		
	}

}
