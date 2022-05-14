package defaultmethods;

public interface camera {

	void recordvideo();
	
	// using default method -- u need to proivde bpdy for it and 
	// for default method, -- implementation of this method is not necessary in all class
	default void recordvideo4K() {
		System.out.println("recoding video in 4k");
	}
}
