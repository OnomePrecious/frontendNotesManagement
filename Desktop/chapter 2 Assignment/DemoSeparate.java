import java.util.Scanner;
public class DemoSeparate {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter four digits number: ");
int number = input.nextInt();

int lastNumber = number % 10; 
int removeFour = number /10;              
int secondNumber = removeFour % 10;
int removeThree = removeFour/10; 
int thirdNumber=removeThree % 10; 
int fourthNumber = removeThree /10; 

System.out.println(fourthNumber + " " +thirdNumber + " " + secondNumber+ " " + lastNumber);


		}
	}
