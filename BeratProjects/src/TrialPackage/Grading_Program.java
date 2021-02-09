package TrialPackage;

import java.util.Scanner;

public class Grading_Program {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter your grades:");
		int examGrade1 = console.nextInt();
		int examGrade2 = console.nextInt();
		int examGrade3 = console.nextInt();
		
		int examAverage = (examGrade1 + examGrade2 + examGrade3) / 3;
		
		System.out.println("First Midterm Grade: \t" + examGrade1);
		System.out.println("Second Midterm Grade: \t" + examGrade2);
		System.out.println("Final Grade: \t\t" + examGrade3);
		
		System.out.println("-------------------------");
		
		System.out.println("Average: \t\t" + examAverage);
		System.out.println("Letter Grade: \t\t" + letterGrade(examAverage));
		
		console.close();
	}
	
	public static String letterGrade(int avg) {
		if(avg >= 90) {
			return "A";
		} else if(avg >= 80) {
			return "B";
		} else if(avg >= 70) {
			return "C";
		} else if(avg >= 60) {
			return "D";
		} else return "F";
	
	}

}
