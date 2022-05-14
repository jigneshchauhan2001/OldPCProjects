package inputoutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;


public class JohnExercises {

	public static void main(String[] args) throws IOException {
		String term1 = "C:\\File IpOp\\JohnTerm1.txt";
		FileReader reader1 = new FileReader(term1);
		
	BufferedReader bReader = new BufferedReader(reader1);
		
		int x = bReader.read();
		String y = bReader.readLine();	
		while(x != -1)
		{
			//System.out.print((char) x );
			y = bReader.readLine();
			System.out.println(y);
				
			x = bReader.read();
		}
		bReader.close();
		reader1.close();
		
	}
}
