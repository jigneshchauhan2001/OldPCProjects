package generics;

import java.util.Comparator;

public class StudentIdComparator implements Comparator<Students> {

	@Override
	public int compare(Students s1, Students s2) {
		return s1.getId() - s2.getId();
	}
}
