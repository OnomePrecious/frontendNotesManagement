import java.util.Scanner;
public class StudentGrade {
public static void main(String...args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter number of students: ");
int numberOfStudents = input.nextInt();


System.out.print("Enter number of subjects: ");
int numberOfSubjects = input.nextInt();

int scores = 0;

//int[] [] scores = new int [numberOfStudents] [numberOfSubjects];

for (int number = 0; number < numberOfStudents; number++){

	System.out.print("Enter scores of students " + (number + 1) + ":");

for (int number1 = 0; number1 < numberOfSubjects; number1++){

System.out.print("Enter scores for subjects "  + (number1 + 1) + ":");
//scores[number][number1] = input.nextInt();

	}
}
System.out.println("\nScores entered: ");
	for (int number = 0; number < numberOfSubjects; number++) {
System.out.print("Student" + (number + 1) + ":");
for (int number1 = 0; number1 < numberOfSubjects; number1++){
System.out.println("scores[number][number1]: ");
}
System.out.println();
}
}
}