import java.util.Scanner;
public class CreditLimitCalculator{
public static void main(String...args) {
Scanner input = new Scanner(System.in);
int customers = 0;
int count =1;
while(customers != -1){
System.out.print("Enter account number: ");
int accountNumber = input.nextInt();
count++;
System.out.println("Enter balance at the beginning of the month: ");
int beginningBalance = input.nextInt();
count++;

System.out.println("Enter total items charged by customer: ");
int charges = input.nextInt();
count++;

System.out.println("Enter total credits: ");
int credits = input.nextInt();
count++;

System.out.println("Enter allowed credit: ");
int creditLimit = input.nextInt();
count++;

int balance = beginningBalance + charges - credits;
count++;
if (balance > creditLimit){
System.out.println("Credit limit exceeded: ");
} else {
System.out.println("New balance is " + balance ) ;
}
}
		}
}



