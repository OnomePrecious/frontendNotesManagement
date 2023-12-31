import java.util.Scanner;
public class Product {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("enter first integer");
int number1 = input.nextInt();

System.out.println("enter second integer");
int number2 = input.nextInt();

System.out.println("enter third integer");
int number3 = input.nextInt();
int value = number1 * number2 * number3;

System.out.println("display" + value);
}


}
