import java.util.Scanner;
public class DemoLoop {
public static void main(String[] args) {  
Scanner input = new Scanner(System.in);

  System.out.print("Enter number 1: " );
	int number = input.nextInt();

int total = number;
double average = 0.0;
int maximum = number;
int minimum = number;

for(int count = 1;count <= 9; count+=1){

  System.out.print("Enter number "+ (count+1) + " : " );
	 number = input.nextInt();

	total = total + number;
	if(number > maximum){maximum = number;}
    	if(number < minimum){minimum = number;}
	average = (double)total / count+1;
	
	 
 }
	System.out.println("Total is: " + total);
	System.out.printf("Average is: %.2f%n", average);
	System.out.println("Maximum is: " + maximum ); 
	System.out.println("Minimum is: " + minimum);

     }
}