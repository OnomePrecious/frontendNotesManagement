import java.util.Scanner;
public class DemoStudent{
public static void main(String...args) {
Scanner input = new Scanner(System.in);

int passes = 0;
int failures = 0;
int studentCounter = 1;

while(studentCounter <= 10) {
System.out.print("Enter exam result (1 = pass, 2 = fail): ");
int result = input.nextInt();

if(result == 1) {
	passes = passes + 1;
}
else if(result == 2) {
	failures = failures + 1;
}
else if(result > 2 || result < 1);
System.out.println("Enter a valid input:"); 
 result = input.nextInt();
	studentCounter+=1;
}
System.out.println("The number of student that passed:" + passes);
System.out.println("The number of student that failled:" + failures);

if(passes > 8) {
System.out.println("Bonus to the instructor!");
}





	}	
			}