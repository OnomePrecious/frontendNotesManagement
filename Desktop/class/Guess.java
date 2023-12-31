import java.security.SecureRandom;
import java.util.Scanner;

public class Guess { 
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

SecureRandom random = new SecureRandom();
int number = random.nextInt(1, 11); 
	
System.out.println("Enter your guess: ");
int guess = scanner.nextInt();
 
while (guess = 4) {

if(guess < 4) {
System.out.println("Your guess is too low: ");
}

if(guess == 4) {
System.out.println("Correct guess: ");
}

if(guess > 4 && = 10){
System.out.println("Your guess is too high: ");

}

}

 

}
	}