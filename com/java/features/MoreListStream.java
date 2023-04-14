package com.java.features;
//package org.interview.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoreListStream {
	public static void main(String... arg) {

		int[] arr = {3,5435,3,35,56,234,67,788,88};
		List<Integer> abc = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		int ac = Arrays.stream(arr).boxed().
				 sorted(Collections.reverseOrder())
				.limit(2).reduce(0,(a,b)-> a+b);
		
		OptionalInt max = Arrays.stream(arr).max();
		System.out.println(max.getAsInt());
		
		System.out.println(ac);
		
		System.out.println(abc);
	}
}
