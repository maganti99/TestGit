package com.maganti;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		int sum=0;
		
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(5);
		nums.add(9);
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		
		for(int i:nums)
		{
			sum = sum + i;
		}
		
		System.out.println("Sum is : " + sum);
		

	}

}
