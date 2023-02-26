package com.javaeight.vinit;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenSquareAdd {

	public static void main(String[] args) {

		m1();

	}

	public static void m1() {
		String s = "vaibhav 5 sj 9 aks 12 sakxk3";

		String numberOnly = s.replaceAll("[^0-9]", "");

		String ss[] = numberOnly.split("");
		Integer[] i = new Integer[numberOnly.length()];

		for (int j = 0; j < i.length; j++) {

			i[j] = Integer.parseInt(ss[j]);

		}

		ArrayList<Integer> al = new ArrayList<>();
		for (Integer a : i) {
			al.add(a);
		}

		System.out.println("==== " + al);

		List<Integer> num = al.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());

//		System.out.println("even "+num);

		List<Integer> square = num.stream().map(n -> (n * n)).collect(Collectors.toList());

		System.out.println("square of numbers are " + square);

	}
}
