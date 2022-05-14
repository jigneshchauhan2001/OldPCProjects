package lambda;


// method with only 1 abstract method is called FUNCTIONAL INTERFACE, u cal also used @FunctionalInterface annotation,
// THIS IS REQUIRED WHEN U WANT TO USE LAMBDA EXPRESSION -- so if u try add another method in interface, it will give error.

@FunctionalInterface
public interface myint {

	//1
	void meth1(int a);
}


// MARKER INTERFACE: Interface with no method.
// NORMAL INTERFACE: Interface with More than 1 interface.



