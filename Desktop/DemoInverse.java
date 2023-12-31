import java.util.Scanner;
public class DemoInverse {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter four digits number: ");
int number = input.nextInt();
int evenNumber = 0;
int oddNumber = 0 ;                         
int lastDigit = number % 10;
int removeDigit= number / 10;
int thirdDigit = removeDigit % 10;
int removeDigit2 = removeDigit / 10;
int secondDigit = removeDigit2 % 10 ;
int firstDigit = removeDigit2 / 10 ;

System.out.println(lastDigit + " " + thirdDigit + " " + secondDigit + " " + firstDigit);

if (lastDigit % 2 == 0){
	evenNumber++;
System.out.println(lastDigit + ": is an even number");
}else if(firstDigit % 2!= 0){
	oddNumber++;
System.out.println(lastDigit + ": is an odd number ");
}

if (thirdDigit % 2 == 0){
	evenNumber++;
System.out.println(thirdDigit + ": is an even number ");
}else if(secondDigit % 2!= 0){
	oddNumber++;
System.out.println(thirdDigit + ": is an odd number ");
}


if (secondDigit % 2 == 0){
	evenNumber++;
System.out.println(secondDigit + ": is an even number " );
}else if(thirdDigit % 2!= 0){
	oddNumber++;
System.out.println(secondDigit + ": is an odd number");
}


if (firstDigit % 2 == 0){
	evenNumber++;
System.out.println(firstDigit + ": is an even number" );
}else if(lastDigit % 2!= 0){
	oddNumber++;
System.out.println(firstDigit + ": is an odd number ");

System.out.println("even number counted:" + evenNumber);
System.out.println("odd number counted:" + oddNumber);



}
		}
}