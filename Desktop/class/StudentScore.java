import java.util.Scanner;
public class StudentScores {
public static void main(String[] args) { 
Scanner input = new Scanner(System.in);

System.out.print("Enter number of students:");
int numberOfStudents = input.nextInt();

	String highestScorer = "";
	int highestScore = 0;

	for (int count = 1; count <= numberOfStudents; count++) {
	System.out.print("Enter the name of students " + count + ": ");
	String studentsName = input.nextLine();

System.out.print("Enter the score of students " + count + ": ");
int studentScore = input.nextInt();

	if (studentScore > highestScore){
	highestScore = studentScore;
	highestScorer = studentName;

	} 

	}
System.out.println("The student with the highest score is: " + highestScorer);
      }
}