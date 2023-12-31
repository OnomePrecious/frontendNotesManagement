import java.util.Scanner;
public class Circle { 
public static void main(String[] args) { 
Scanner input = new Scanner(System.in);

System.out.println("Enter radius of a circle:");
double radius = input.nextDouble();

double diameter = 2 * radius;

double circumference = 2 * 3.14159 * radius;

double area = 3.14159 *radius*2;

System.out.println("the diameter of a circle: " );
System.out.println("the circumference of a circle: " );
System.out.println("the area of a circle: " );


}

}