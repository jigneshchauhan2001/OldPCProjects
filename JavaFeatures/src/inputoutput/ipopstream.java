package inputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ipopstream {

	public static void main(String[] args) throws IOException {
		String txtPath = "C:\\File IpOp\\Candidate.txt";
		FileOutputStream fos = new FileOutputStream(txtPath);
		
		String candidates = "jignesh, sunil";
		byte[] bArray = candidates.getBytes();
		fos.write(bArray);;
		fos.close();
		
		
		FileInputStream fis = new FileInputStream(txtPath);
		int x=fis.read();
		System.out.println((char)x);   // print first char
		
		System.out.println("using file input stream");
		while (x != -1) {
			//System.out.print(x + ", ");
			System.out.print((char)x);
			 x=fis.read();	
		}
		fis.close();
		
		System.out.println();
		
		// Reader & Writer -- FileReader & FileWriter
		
	
		Writer writer = new FileWriter(txtPath);
		String newnameString = "sagar, abhishek";
		char[] charArray = newnameString.toCharArray();
		writer.write(charArray);
		writer.close();
		
		Reader reader = new FileReader(txtPath);
		int y=reader.read();  
		System.out.println((char)y);      //print first char
		System.out.println("using file reader");
		while (y != -1) {
			System.out.print((char)y);
			y=reader.read();
		}	
		reader.close();
			
	}	
}
