package practice.java;

import java.util.HashMap;

public class hashmapPractice {

	public static void main(String[] args) {
 
		
		HashMap<String , Integer> map1 = new HashMap();
		HashMap<String , Integer> map2 = new HashMap();
		HashMap<String , Integer> map3 = new HashMap();
		HashMap<String , Integer> map4 = new HashMap();


		map1.put( "shabana", 98499);
		map1.put( "divya", 876545);
		map1.put( "shabbu", 9849912);
		map1.put( "ssgsg", 9849934);
		map1.put( "shvba", 98499544);
		
		map2.put( "sree", 984995646);
		map2.put( "divygvga", 87654512);
		map2.put( "shabbudfsf", 98491912);
		map2.put( "ssdssgsg", 984119934);
		map2.put( "shvba", 98499544);
		
		System.out.println(map1.equals(map2));
		map3.put( "shabana", 98499);
		map3.put( "divya", 876545);
		map3.put( "shabbu", 9849912);
		map3.put( "ssgsg", 9849934);
		map3.put( "shvba", 98499544);
		
		map4.put( "shabana", 9849912);
		map4.put( "divya", 876545);
		map4.put( "shabbu", 9849912);
		map4.put( "ssgsg", 9849934);
		map4.put( "shvba", 98499544);
		System.out.println(map3.equals(map4));

	}

}
