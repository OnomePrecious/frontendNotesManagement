import java.util.Scanner;
public class DetermineCount {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("Enter number 1: ");
int number1 = input.nextInt();

System.out.println("Enter number 2: ");
int number2 = input.nextInt();


System.out.println("Enter number 3: ");
int number3 = input.nextInt();

System.out.println("Enter number 4: ");
int number4 = input.nextInt();

System.out.println("Enter number 5: ");
int number5 = input.nextInt();

int negativeCount = 0;
int positiveCount = 0;
int zeroCount = 0;

if(number1 < 0){
	negativeCount++;
}else if(number1 > 0) {
	positiveCount++;
}else{
	zeroCount++;
}


if(number2 < 0){
	negativeCount++;
}else if(number2 > 0) {
	positiveCount++;
}else{
	zeroCount++;
}


if(number3 < 0){
	negativeCount++;
}else if(number3 > 0) {
	positiveCount++;
}else{
	zeroCount++;
}


if(number4 < 0){
	negativeCount++;
}else if(number4 > 0) {
	positiveCount++;
}else{
	zeroCount++;
}



if(number5 < 0){
	negativeCount++;
}else if(number5 > 0) {
	positiveCount++;
}else{
	zeroCount++;
}
 
System.out.println("Number of negative numbers: "+ negativeCount);	
System.out.println("Number of positive numbers: " + positiveCount);		
System.out.println("Number of zeros : " + zeroCount);		


	}
	}















