import java.util.Scanner;
import java.io.File;
import java.io.IOException;
//import java.util.ArrayList;

public class AddClass {

	public static void runAdd()
		{
		System.out.println("\nWould you like to \n  (1) Add a new student to the database.\n  (2) Delete a student from the database.");
		Scanner userInput = new Scanner(System.in);
		int userChoice = userInput.nextInt();
		if(userChoice ==  1)
		{
		addStudent();
		}
		else if(userChoice == 2)
		{
		deleteStudent();
		}
		else
		{
		System.out.println("Sorry, you selected a choice not on our list. We will re-direct you to select again.");
		runAdd();
		}
		}


	public static void addStudent() throws IOException
		{
		StudentList.fileRead();
<<<<<<< HEAD
		Scanner studentFile = new Scanner(new File("studentData.txt"));
		
=======
		Scanner studentFile = new Scanner(new File("studentData.txt"));		
>>>>>>> upstream/master
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the student details");
		//firstname
		System.out.print("First Name");
		String firstName = input.next();
		//lastname
		System.out.print("Last  Name");
		String lastName = input.next();
		//gpa
<<<<<<< HEAD
		System.out.print("GPA");
		double gpa = input.nextDouble();
		
=======
		//System.out.print("GPA");
		//double gpa = input.nextDouble();
>>>>>>> upstream/master
		//alg grade
		System.out.print("Algebra Grade");
		int algGrade = input.nextInt();
		//eng grade
		System.out.print("English Grade");
		int engGrade = input.nextInt();
		//chem grade
		System.out.print("Chemistry Grade");
		int chemGrade = input.nextInt();
<<<<<<< HEAD

		//adding the new student 
		Student newStudent = new Student(firstName, lastName, gpa, algGrade, engGrade, chemGrade);

=======
			
			///this calculates the gpa so the person doesn't have to put it in above. 
			double gpa = StudentList.gpa(algGrade, engGrade, chemGrade);

		//adding the new student 
		Student newStudent = new Student(firstName, lastName, gpa, algGrade, engGrade, chemGrade);
		StudentList.getStudents().add(newStudent);
			
>>>>>>> upstream/master
		System.out.print("added");
			}
		public static  void deleteStudent()
		{ 
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the student you want to delete");
			int index = input.nextInt();
<<<<<<< HEAD

=======
			
			///this checks to see if the student index is valid and cam be removed
>>>>>>> upstream/master
			if(index >=0 && index <StudentList.students.size())
			{
				StudentList.students.remove(index);
				System.out.println("deleted student");
			}
			else
			{
				System.out.println("not valid student");
			}
		}
			
		
		}
	
	
