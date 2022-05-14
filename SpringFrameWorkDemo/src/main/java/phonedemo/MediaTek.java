package phonedemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class MediaTek implements MobileProcessor {

	
	// if u dont give compoenent name -- it take default as -- FIRST LETTER SMALL -- "mediaTek".
	
	// Now what If u want to Take Processor as MediaTek and Not SnapDragon
	// Then  u need to give @Primary annotation to this Class
	// if u want to Take Processor as SnapDragon  u need to add @Primary annotation to that Class.
	// IF U DONT THEN IT GIVES RUNTIME ERROR -- because cpu dont know which Processser u want to run.
	
	// OR ELSE u can add @Qualifier("mediaTek") annotation with component name at Object Declaraion in App Class.
	
	public void Process() {
		
		System.out.println("I am MediaTek Processor");
	}

}
