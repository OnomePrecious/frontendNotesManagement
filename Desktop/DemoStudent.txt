import java.util.Scanner;
public class DemoStudent{
public static void main(String...args) {
Scanner input = new Scanner(System.in);

int passes = 0;
int failures = 0;
int studentCounter = 1;

while(studentCounter <= 10) {
System.out.print("Enter exam result: ");
int result = input.nextInt();

if(result == 1) {
	passes = passes + 1;
}
else {
	failures = failures + 1;
}
	studentCounter+=1;
}
System.out.println("The number of student that passed:" + passes);
System.out.println("The number of student that failled:" + failures);

if(passes > 8) {
System.out.println("Bonus to the instructor!");
}





	}	
			}