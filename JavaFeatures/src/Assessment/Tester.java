package Assessment;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import javax.swing.text.DateFormatter;

public class Tester {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		String customerName = scanner.nextLine();
		String customerDOB = scanner.nextLine();
		
	    LocalDate custDOB =LocalDate.parse(customerDOB);	
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String dateString =formatter.format(custDOB);
			
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate dateTime = LocalDate.parse(dateString, format);
				
		String[] detailStrings =PolicyDetailgenerator.policyGenerator(customerName, dateTime);
		scanner.close();
		
		String finalString = "";
		
		for (int i = 0; i < detailStrings.length; i++) {
			 finalString = finalString +  detailStrings[i];
			 
			 if ( i == detailStrings.length -1) {
				break;
			}
			 finalString = finalString + "-";
		}	
		System.out.println(finalString);
}
}


class PolicyDetailgenerator { 
	
	public static String[] policyGenerator(String customerName, LocalDate customerDOB) {
	
		String[] policyDetails = new String[3];
		
		if (customerName.length() < 5) {
			policyDetails[0] = "0";
			policyDetails[1] = null; 
			policyDetails[2] = null;
			return policyDetails;
		}
		else {
			int year = customerDOB.getYear();
			int month = customerDOB.getMonthValue();
			int date = customerDOB.getDayOfMonth();
			
			
			String name = customerName.substring(0, 5);		
			String custName=name + String.valueOf(month) + String.valueOf(year);		
			policyDetails[0] = custName;
			
			String custId=name + String.valueOf(date);
			policyDetails[1] = custId;
			
			String password = customerName.replaceAll(" ", "") + "@1234";
			policyDetails[2] = password;
			return policyDetails;
		}
		
	}
}
