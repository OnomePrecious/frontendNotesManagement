import java.util.Scanner;
public class RaisedToPower { 
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("Enter the first number");
double value = input.nextdouble();

System.out.println("Enter the second number");
double exponent = input.nextdouble();

double result = Power(value, exponent);
System.out.println(value + " raised to the power of " + exponent + " is: " + result);


     }
}