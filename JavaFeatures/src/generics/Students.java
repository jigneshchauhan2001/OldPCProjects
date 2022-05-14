package generics;


public class Students implements Comparable<Students> {
	
	private String name;
	private int id;
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Students(int id,  String name) {
		this.id = id;
		this.name = name;
	}
	
	
	@Override
	public int compareTo(Students s) {
		return this.name.compareTo(s.name);
	}

	@Override
	public String toString() {
		return this.id + ": " + this.name;
	}
	
}
