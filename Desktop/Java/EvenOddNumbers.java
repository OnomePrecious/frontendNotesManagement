import java.util.Scanner;
public class  EvenOddNumbers { 
public static void main(String[] args) { 
Scanner input = new Scanner(System.in);

System.out.println("Enter an integer");
int number = input.nextInt();

if(number % 2 == 0) {
          System.out.println(number + " is an even number.");
    } else { 
          System.out.println(number + " is an odd number.");
    }


    }
}