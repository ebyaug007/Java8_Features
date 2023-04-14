package org.interview.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@FunctionalInterface
interface FuncInter
{
	void fun(int x);
}

public class FunctionalInterCheck {

	public static void main(String ... arg)
	{
		FuncInter f = (x)->{ 
			System.out.print("This is functional Interface " + x);
		};
		f.fun(20);
		
		
		List<Integer> a = new ArrayList<>();
		a.add(20);
		a.add(10);
		a.add(24);
		a.add(88);
		a.add(12);
		a.add(2);
		
		//Collections.sort(a, (i,j)->i-j);
		
		//Get top 3 elements from list
		List<Integer> b = a.stream().sorted((i,j)->i-j)
				.limit(3)
				.collect(Collectors.toList());
		
		System.out.println(b);
		
		System.out.println(a);
	}
}
