package com.sgit;

import java.util.Comparator;

class The_Comparator implements Comparator<Developer> { 
   

	@Override
	public int compare(Developer o1, Developer o2) {
		// TODO Auto-generated method stub
		return o1.getAge()-o2.getAge();
	} 
} 