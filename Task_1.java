package task1;

import java.util.Scanner;

class Student{
	String name;
	 int rollNumber;
	 int[] marks;
	   void setter(String name, int rollNumber, int[] marks) {
		   this.name=name;
		   this.rollNumber=rollNumber;
		   this.marks=marks;
	   }
	   void getter() {
		   System.out.println("Name of student: " + name);
		   System.out.println("Roll number of student: " + rollNumber);
		   System.out.println("marks: ");
		   for(int marks : marks) {
			   System.out.print(marks + " ");
		   }
	   }
}
public class Task_1 {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name of Student: ");
		String name = sc.next();
		
		System.out.println("Enter Rollno of Student: ");
		int Rollno = sc.nextInt();
		
	    System.out.print("Enter number of subjects: ");
	    int n = sc.nextInt();
	    int[] marks = new int[n];

	    for (int i = 0; i < n; i++) {
	        System.out.print("Enter mark for subject " + (i + 1) + ": ");
	        marks[i] = sc.nextInt();
	    }
		
	    
		Student st = new Student();
		st.setter(name,Rollno,marks);
		st.getter();
		sc.close();
 }
}
