import java.util.Scanner;
public class DemoMileage {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
 int stop = 0, count = 1, totalMiles = 0, totalGallon = 0;
double milesPerGallon = 0, totalMilesPerGallon = 0;
while(stop != -1) {
System.out.print("Enter miles " + count + " Driven: ");
int miles = input.nextInt();
totalMiles += miles;

System.out.print("Enter gallon " + count + " used: ");
int gallon = input.nextInt();
totalGallon += gallon;
milesPerGallon += (double) miles/gallon;

System.out.println("Miles per Gallon is: "+ milesPerGallon + " liters ");
System.out.println("if you are tired enter -1 or press 1 to continue: ");

stop = input.nextInt();
count++;
}
totalMilesPerGallon += (double)totalMiles / totalGallon;

System.out.println("Total miles driven =" + totalMiles);
System.out.println("Total gallons used =" + totalGallon);
System.out.println("Total miles / gallon =" + totalMilesPerGallon);

	}
		}