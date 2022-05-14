package linkedAssign;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

class Tester6 {

	public static Map<String, Integer> mergeMaps(Map<String, Integer> mapOne, Map<String, Integer> mapTwo) {
		 
	   	Set<String> onekset = mapOne.keySet();
			Set<String> twokset = mapTwo.keySet();
			Map<String, Integer> newMap = new HashMap<String, Integer>();
			Set<Entry<String, Integer>> entryone = mapOne.entrySet();
			Set<Entry<String, Integer>> entrytwo = mapTwo.entrySet();

			if (entryone.size() >= entrytwo.size()) {
				for (Entry<String, Integer> entry1 : entryone) {
					for (Entry<String, Integer> entry2 : entrytwo) {
						if (entry1.getKey().equals(entry2.getKey())) {
						    if(entry1.getValue() != entry2.getValue()) {
							String e1 = entry1.getKey();
							e1 = e1 + "New";
							newMap.put(e1, entry2.getValue());
						    }
						} 
							newMap.put(entry1.getKey(), entry1.getValue());
							newMap.put(entry2.getKey(), entry2.getValue());
						
					}
				}

			} else {
				for (Entry<String, Integer> entry2 : entrytwo) {
					for (Entry<String, Integer> entry1 : entryone) {
						if (entry2.getKey().equals(entry1.getKey()) && entry2.getValue() != entry1.getValue()) {
							String e1 = entry1.getKey();
							e1 = e1 + "New";
							newMap.put(e1, entry2.getValue());
						} 
							newMap.put(entry1.getKey(), entry1.getValue());
							newMap.put(entry2.getKey(), entry2.getValue());
						
					}
				}
			}
			return newMap;
	}

	public static void main(String args[]) {
		Map<String, Integer> mapOne = new HashMap<String, Integer>();
		mapOne.put("Kelly", 10);
		mapOne.put("Micheal", 20);
		mapOne.put("Ryan", 30);

		Map<String, Integer> mapTwo = new HashMap<String, Integer>();
		mapTwo.put("Jim", 15);
		mapTwo.put("Andy", 45);

		Map<String, Integer> mergedMap = mergeMaps(mapOne, mapTwo);

		System.out.println("Merged Map\n===========");
		for (Entry<String, Integer> entry : mergedMap.entrySet()) {
			System.out.println(entry.getKey() + " -- " + entry.getValue());
		}

	}
}
