import java.util.Scanner;
public class ComputeAverage {
public static void main(String[] args)  { 
Scanner input = new Scanner(System.in);

System.out.println("Enter unspecified number of integers:");
int count = input.nextInt(); 
if(count == 0)
System.out.println("End the input:");

if(count >= 1)
System.out.println("positive numbers", "display the number of positives:");

if(count <= -1)
System.out.println("negative numbers", "display the number of negatives:");

System.out.println("positive numbers + negative numbers:");
float total = input.nextFloat();
System.out.println("total / 2:");
float average = input.nextFloat();

System.out.printf("%d%d%f%f, the number of postives, the number of negatives, total, average:");

	}
	}