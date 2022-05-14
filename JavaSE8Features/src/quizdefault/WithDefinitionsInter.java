package quizdefault;

public interface WithDefinitionsInter {

	default void definedMeth() {
		System.out.println("inside interface");
	}
}
