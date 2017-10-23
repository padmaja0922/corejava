/**
 * 
 */
package com.bcj.corejava.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

/**
 * @author Boot Camp User 008
 *
 */
public class CountCity {

	public static void main(String[] args) {

		Map<String, String> person = new HashMap<String, String>();

		person.put("John", "Dallas");
		person.put("Babbar", "NewYork City");
		person.put("Akbar", "Houston");
		person.put("Jorge", "Paris");
		person.put("Roshan", "Dallas");
		person.put("Sujit", "Houston");

		Map<String, Integer> city = new HashMap<String, Integer>();

		try {
			city = countCity(person);
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		System.out.println("Output Map : ");

		for (Entry<String, Integer> cityMap : city.entrySet()) {

			System.out.println(cityMap.getKey() + "   " + cityMap.getValue());

		}

	}

	/**
	 * @param person
	 * @return
	 * @throws Exception 
	 */
	private static Map<String, Integer> countCity(Map<String, String> person) throws Exception {
		
		if(person.size() == 0){
		      throw new Exception();
		    }else{
		     Integer count = null;
		 
		    //Creating a TreeMap to get count of each city
		    TreeMap <String, Integer> city = new TreeMap<String, Integer>();
		  
		    for(Map.Entry<String, String> countOfCity: person.entrySet()){
		    	
		           if(city.containsKey(countOfCity.getValue()))
		        	   city.put(countOfCity.getValue(),count+1);
		           else {
		        	   
		        	    count =1;
		        	    city.put(countOfCity.getValue(),count);
		           }
		        	   
		     
		    	
		    	
		       
		          //  count = city.get(person.getValue());
		            
		      }  
		
		    return city;
		    }
		
	}
		
	}
	

