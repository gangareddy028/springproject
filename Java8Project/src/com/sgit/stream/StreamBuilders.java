package com.sgit.stream;

import java.util.HashMap;
import java.util.Map;

public class StreamBuilders
{
	  public static void main(String[] args){
		  /*List<Integer> integers = Arrays.asList(1,12,433,5);
	         
		  Optional<Integer> max = integers.stream().reduce( Math::min );		   
		  max.ifPresent(value -> System.out.println(value));*/
		  HashMap<String,String> map=new HashMap<>();
		  
		  map.put("A","A");
		  map.put("B","A");
		  map.put("C","C");
		  map.put("C","E");
		  
		  for(Map.Entry<String,String> it:map.entrySet()) {
			  System.out.println(it.getKey());
			  System.out.println(it.getValue());
		  }
		  
		  
	         
	     }
}