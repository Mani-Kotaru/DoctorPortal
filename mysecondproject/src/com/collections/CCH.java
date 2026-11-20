package com.collections;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Comparator;


public class CCH {
	
	static Comparator<Patient> LevelComparator = new Comparator<Patient>() {

	    @Override
	    public int compare(Patient p1, Patient p2) {
	        return p1.getTriageLevel() -  p2.getTriageLevel();
	    }
	};
	static HashSet<Integer> patientIds = new HashSet<>();
	static PriorityQueue<Patient> queue = new PriorityQueue<>(LevelComparator);
	
	static public void registerPatient(Patient p)
	{  
		 if(patientIds.contains(p.getPatientId()))
		 {
			 System.out.println("Patient rejected..");
		 }
		 else
		 {
			 patientIds.add(p.getPatientId());
			 queue.offer(p);
			 System.out.println("Patient registered successfully!!");
			 
		 }
		
	}
	static public void treatNextPatient()
	{
		if(queue.isEmpty())
		{
			System.out.println("No waiting patients...");
		}
		else
		{
			System.out.println("treated patient : "+queue.poll());
		}
	}
	static public void viewQueue()
	{

		if(queue.isEmpty())
		{
			System.out.println("No waiting patients...");
		}
		else
		{
			 PriorityQueue<Patient> dummyQueue = new PriorityQueue<>(queue);

			System.out.println("Waiting patients are...");
			while(!dummyQueue.isEmpty())
			{
				System.out.println(dummyQueue.poll());
			}
		}
	}
    public static void main(String[] args) {
		 Patient p1=new Patient(1,"Sravya",25,1,"Cancer");
		 Patient p2=new Patient(2,"Rajesh",56,1,"Heart Attack");
		 Patient p3=new Patient(3,"swetha",27,2,"Liver problem");
		 Patient p4=new Patient(4,"Vamsi",23,3,"typhoid");
		 Patient p5=new Patient(5,"Geetha",29,4,"fever");
		 
		 registerPatient(p1);
		 registerPatient(p2);
		 registerPatient(p3);
		 registerPatient(p4);
		 registerPatient(p5);
		 
		 Patient duplicateEntry=new Patient(5,"lasya",35,4,"fever");
		 registerPatient(duplicateEntry);
		 
		 treatNextPatient();
		 viewQueue();
		 
		
	}
    

}
