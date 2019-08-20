package com.sgit;

import java.util.HashMap;
import java.util.function.Consumer;

public class IterationExamples {
    public static void main(String[] args){
    	HashMap<String, Integer> map = new HashMap<>();
        
    	map.put("A", 1);
    	map.put("B", 2);
    	map.put("C", 3);
    	
    	/*map.forEach((key,value) -> {
    		System.out.println(key);
    		System.out.println(value);
    	});
    	Consumer<Map.Entry<String,Integer>> action=System.out::println;
    	
    	map.entrySet().forEach(action);*/
    	
    	Consumer<String> actionKey=System.out::println;
    	map.keySet().stream().filter(predicate -> predicate.compareTo("A") == 0).forEach(actionKey);
    	
    	/*Consumer<Integer> actionValue=System.out::println;
    	map.values().stream().filter(value -> value != 2).forEach(actionValue);*/
    	
    	


    }
}