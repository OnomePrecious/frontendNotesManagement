import java.util.Scanner;
public class DemoLargest{
public static void main(String...args) {
Scanner input = new Scanner(System.in);

int largest = 0;
int secondLargest = 0;
int counter = 1;

while(counter <= 10) {
System.out.print("Enter an integer" + counter + ": ");
int number = input.nextInt();

if (number > largest) {
	//secondLargest = largest;
	largest = number;

} else if (number > secondLargest) {
	secondLargest = largest;
}
counter++;
}

System.out.println("The largest is:" + largest);
System.out.println("The second largest is:" + secondLargest);


}
}

