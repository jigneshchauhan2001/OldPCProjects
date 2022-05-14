package defaultmethods;

public class phone implements camera {

	@Override
	public void recordvideo() {
		System.out.println("recording video");
	}
	
	// if u need u can override it also - but not mandatory.
	@Override
	public void recordvideo4K() {
		System.out.println("overriden record 4k video ");
	}
	
	public static void main(String[] args) {
		phone p = new phone();
		p.recordvideo();
		//p.recordvideo4K();
	}
}
