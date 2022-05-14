package finalAssessment;

@FunctionalInterface
public interface withint {
	 
	double assess(int id, double percentage);
	    default double computeGrade(double cost) {
	    	// code for computing grade
	       return 0.0;
	    }   
}
