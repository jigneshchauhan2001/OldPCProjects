package linkedAssign;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Tester5 {

	public static List<String> sortSales(Map<String, Integer> sales) {

		Set<Entry<String, Integer>> entrySet = sales.entrySet();
		Set<String> kSet = new LinkedHashSet<String>();
		List<Integer> iList = new ArrayList<>();

		for (Entry<String, Integer> entry : entrySet) {	
			Integer v = entry.getValue();
			iList.add(v);
			Collections.sort(iList);
			Collections.reverse(iList);	
		}
	

		for (int i = 0; i < iList.size(); i++) {
			for (Entry<String, Integer> entry : entrySet) {
				if (iList.get(i) == entry.getValue()) {
					kSet.add(entry.getKey());
				}
			}
		}

		List<String> kList = new ArrayList<>();
		for (String str : kSet) {
			kList.add(str);
		}

		return kList;
	}

	public static void main(String args[]) {
		Map<String, Integer> sales = new HashMap<String, Integer>();
		sales.put("Mathew", 50);
		sales.put("Lisa", 76);
		sales.put("Courtney", 45);
		sales.put("David", 49);
		sales.put("Paul", 49);

		List<String> employees = sortSales(sales);

		System.out.println("Employees in the decreasing order of their sales\n=====================================");
		for (String employeeName : employees) {
			System.out.println(employeeName);
		}
	}

}
