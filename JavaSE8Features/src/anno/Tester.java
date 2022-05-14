package anno;

public class Tester {

	public static void main(String[] args) {
		// 1 Using class and Object
		annoclass myobj1 = new annoclass();
		myobj1.meth1();
		
		// use of annonymous class is that for calling implementing interface method, 
		// we dont need to create class & its object seperately. 
		
		// 2 Using Annonymous class
		// ( 3rd method is shortest and using lambda expression )
		annointerface myobj  = new annointerface() {		
			@Override
			public void meth1() {
				System.out.println(" i m meth-1 using Annonymous class, and not using imp class ");	
			}
		};
	myobj.meth1();
	}
	
}
