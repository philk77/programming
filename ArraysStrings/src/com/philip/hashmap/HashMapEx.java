package com.philip.hashmap;

import java.util.HashMap;

public class HashMapEx {

	public HashMap<Integer, Student> buildHashMap (Student[] students) {
		HashMap<Integer, Student> myHashMap = new HashMap<Integer, Student> ();

		for (Student s: students) {
			myHashMap.put(s.getId(), s);
		}
		
		return myHashMap;
	}
	
}
