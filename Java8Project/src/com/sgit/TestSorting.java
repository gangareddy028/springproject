package com.sgit;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.TreeSet;

public class TestSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Developer>  listOfDevl=getDeveloper();
		//TreeSet<Developer>  listOfDevl=getDeveloper();
		HashSet<Developer>  listOfDevl=getDeveloper();
		for(Developer dev:listOfDevl) {
			System.out.println(dev);
			
		}
		

	}
	
	private static HashSet<Developer> getDeveloper(){
		HashSet<Developer> listOfDeveloper=new HashSet<>();
		listOfDeveloper.add(new Developer("sachin",new BigDecimal(20000), 32));
		listOfDeveloper.add(new Developer("sachin",new BigDecimal(20000), 32));
		listOfDeveloper.add(new Developer("rahane",new BigDecimal(2000), 33));
		listOfDeveloper.add(new Developer("ganguly", new BigDecimal(2008), 33));
		listOfDeveloper.add(new Developer("sachin tendulkar", new BigDecimal(2900), 32));

		return listOfDeveloper;
	}

}
