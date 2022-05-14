package inner;

import inner.OuterClass.InnerClass;

public class OtherClass {

	
	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		OuterClass.InnerClass innerClass = outerClass.new InnerClass();
	}
}
