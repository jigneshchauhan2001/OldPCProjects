package inner;

public class OuterClass {

	double d;
	
	
	
	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
	}

	public class InnerClass {
		int x;
		String name;
		
		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}	
	}
}
