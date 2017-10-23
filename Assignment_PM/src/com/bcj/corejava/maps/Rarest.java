/**
 * 
 */
package com.bcj.corejava.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author Boot Camp User 008
 *
 */
public class Rarest {

	public static void main(String[] args) {

		HashMap<String, Integer> rearMap = new HashMap<String, Integer>();
		rearMap.put("Alyssa", 22);
		rearMap.put("Char", 25);
		rearMap.put("Dan", 25);
		rearMap.put("Jeff", 20);
		rearMap.put("Kasey", 20);
		rearMap.put("Kim", 20);
		rearMap.put("Mogran", 25);
		rearMap.put("Ryan", 25);
		rearMap.put("Stef", 22);
		System.out.println("Rearest is : ");
		try {
			System.out.println(getRarestAge(rearMap));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @param rearMap
	 * @return
	 * @throws Exception 
	 */
	
	private static Integer getRarestAge(HashMap<String, Integer> rearMap) throws Exception {
		
		if(rearMap.size() == 0){
		      throw new Exception();
		    }else{
		     Integer count = null;
		 
		    //Creating a TreeMap to get the lowest age.
		    TreeMap <Integer, Integer> t = new TreeMap<Integer, Integer>();
		  
		    for(Map.Entry<String, Integer> rear : rearMap.entrySet()){
		        if(t.containsKey(rear.getValue())) {
		            count = t.get(rear.getValue());
		            t.put(rear.getValue(), count+1);
		        }else {
		            count = 1;
		            t.put(rear.getValue(), count);
		        }
		      }  
		        
		     //If there is tie I am comparing the frequencies   
		     int freq = t.get(t.firstKey());

		     TreeSet<Integer> val = new TreeSet<Integer>();

		     for(Integer i : t.keySet()){
		        if(freq > t.get(i) ){
		            freq = t.get(i);
		            val.add(i);
		        } 
		     }
		        if(val.size() > 0){    
		           return val.first();
		        }else{
		           return t.firstKey();
		        } 
		    }
	}
}
