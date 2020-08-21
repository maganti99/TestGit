package com.maganti;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test1 {

	public static void main(String[] args) {
		Optional<Integer> sum;
		
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(5);
		nums.add(9);
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		nums.add(60);
		nums.add(70);
		
		sum = nums.stream().reduce((s1,s2) -> s1+s2);
		
		
		System.out.println("Sum is : " + sum);
		

	}

}
