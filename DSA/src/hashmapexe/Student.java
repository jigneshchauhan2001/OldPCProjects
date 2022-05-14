package hashmapexe;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Student {

	public static Map<String, Double> findMaxMinScorers(Map<String, Double> studentMarks) {

		Map<String, Double> map = new HashMap<>();

		Collection<Double> coll = studentMarks.values();
		Double minVal = Collections.min(coll);
		Double maxVal = Collections.max(coll);

		Set<Entry<String, Double>> map2 = studentMarks.entrySet();

		for (Entry<String, Double> entry : map2) {
			if (entry.getValue().equals(minVal) || entry.getValue().equals(maxVal)) {
				String key = entry.getKey();
				map.put(key, entry.getValue());
			}
		}
		return map;
	}
}
