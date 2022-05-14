package arraydeque;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

class Tester {
    
    public static List<Deque<Patient>> splitQueue(Deque<Patient> patientsQueue) {
	    

    	List<Deque<Patient>> list = new ArrayList<Deque<Patient>>();
    	
    	Deque<Patient> deq1 = new ArrayDeque<Patient>();
    	Deque<Patient> deq2 = new ArrayDeque<Patient>();
    	
    	list.add(deq1);
    	list.add(deq2);
    	for (Patient patient : patientsQueue) {
//    		Patient pt =patientsQueue.peek();
//    		patientsQueue.pop();
    		
    		Patient pt =patientsQueue.pop();
    		
    		
    		int age =pt.getAge();
    		
    		if (age >= 60) {
				list.get(0).add(patient);
			}
    		else {
    			list.get(1).add(patient);
			}	
		}
    	return list;	
	}

	public static void main(String[] args) {
		
		Patient patient1=new Patient("Jack","Male",25);
		Patient patient2=new Patient("Tom","Male",64);
		Patient patient3=new Patient("Simona","Female",24);

		Deque<Patient> patientsQueue = new ArrayDeque<Patient>();
		patientsQueue.add(patient1);
		patientsQueue.add(patient2);
		patientsQueue.add(patient3);

		List<Deque<Patient>> queuesList = splitQueue(patientsQueue);
		
		int counter=0;
		for (Deque<Patient> queue : queuesList) {
			if(counter==0)
				System.out.println("Patients in the senior queue\n============================");
			else
				System.out.println("Patients in the normal queue\n============================");
			
			for (Patient patient : queue) {
				System.out.println("Name : "+patient.getName());
				System.out.println("Age : "+patient.getAge());
				System.out.println();
			}
			counter++;
		}	
	}
}