package linkedAssign;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
	
class Tester7 {

    public static Map<Character, Integer> findOccurrences(String input) {
       Map<Character, Integer> map = new TreeMap<Character, Integer>();
      
       char[] inputArr=input.toCharArray();
       
       for (char c : inputArr) {
    	   if (c == ' ') {
			continue;
		}
		if (map.containsKey(c)) {
			map.put((Character)c, map.get(c)+1);
		}
		else {
			map.put((Character)c, 1);
		}
	}
     return map;  
	}
	
	public static void main(String args[]) {
		
		String input = "occurrnce";
		Map<Character, Integer> occurrenceMap = findOccurrences(input);
		
		System.out.println("Occurrences of characters\n=======================");
		for (Entry<Character, Integer> entry : occurrenceMap.entrySet()) {
			System.out.println(entry.getKey()+" -- "+entry.getValue());
		}
		
	}

}