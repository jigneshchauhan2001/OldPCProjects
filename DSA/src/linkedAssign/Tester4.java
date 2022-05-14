package linkedAssign;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Tester4 {

	public static Set<Student> findUnique(List<Student> students) {
		List<Student> s1 = new LinkedList<Student>();
		s1.addAll(students);

		Set<Student> s2 = new HashSet<Student>();

		for (int i = 0; i < students.size(); i++) {
			for (int j = 0; j < s1.size(); j++) {
				if (students.get(i).getEmailId().equals(s1.get(j).getEmailId())) {
					s2.add(students.get(i));
				}
			}
		}
		return s2;
	}

	public static Set<Student> findDuplicates(List<Student> students) {
		Set<Student> s1 = new HashSet<Student>();
		Set<Student> s2 = new HashSet<Student>();
		for (int i = 0; i < students.size(); i++) {
			if (s1.add(students.get(i)) == false) {
				s2.add(students.get(i));
			}
		}
		return s2;
	}

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();

		students.add(new Student(5004, "Wyatt", "Wyatt@example.com", "Dance"));
		students.add(new Student(5010, "Lucy", "Lucy@example.com", "Dance"));
		students.add(new Student(5550, "Aaron", "Aaron@example.com", "Dance"));
		students.add(new Student(5560, "Ruby", "Ruby@example.com", "Dance"));
		students.add(new Student(5015, "Sophie", "Sophie@example.com", "Music"));
		students.add(new Student(5013, "Clara", "Clara@example.com", "Music"));
		students.add(new Student(5010, "Lucy", "Lucy@example.com", "Music"));
		students.add(new Student(5011, "Ivan", "Ivan@example.com", "Music"));
		students.add(new Student(5550, "Aaron", "Aaron@example.com", "Music"));

		Set<Student> studentNominations = findUnique(students);
		System.out.println("Students who have submitted nominations");
		for (Student student : studentNominations)
			System.out.println(student);

		Set<Student> duplicateStudents = findDuplicates(students);
		System.out.println("Students who have submitted nominations for both the events");
		for (Student student : duplicateStudents)
			System.out.println(student);
	}
}
