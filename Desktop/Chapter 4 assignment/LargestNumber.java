import java.util.Scanner;
public class LargestNumber{
public static void main(String...args) {
Scanner input = new Scanner(System.in);

int countNumber = 1;
int largest = 0;

while(countNumber <= 10) {
System.out.println("Enter an integer: ");
int number = input.nextInt();
countNumber++;

if(number > largest) {
	largest = number;
}
}
System.out.println("The largest number is:" + largest);

}

}
