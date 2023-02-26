package com.javaeight.vinit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenSquareAdd2 {

	public static void main(String[] args) {

		m1();

	}

	public static void m1() {
		String s1[] = { "12", "13", "14", "ab" };
		
		List<Integer>l=Arrays.asList(s1).stream().filter(n ->Character.isDigit((Character)n.charAt(0)))
				.map(a->Integer.parseInt(a)).map(a-> a*a).filter(a->a%2==0).map(a->a+a).collect(Collectors.toList());
		
//		System.out.println(l);
		
		
	}
				
				
}
