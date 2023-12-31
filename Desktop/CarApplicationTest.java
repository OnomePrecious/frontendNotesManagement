import java.util.Scanner;
public class CarApplicationTest { 
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

Car car = new Car();

System.out.println("Enter car model: " );
String model = input.nextLine();

System.out.println("Enter car year: " );
String year = input.nextLine();

System.out.println("Enter car price: " );
double price = input.nextDouble();


car.setModel(model);
car.setYear(year);
car.setPrice(price);	

System.out.println("MODEL is: " + car.getModel());
System.out.println("YEAR is: "  + car.getYear());
System.out.println("PRICE is: " + car.getPrice());

}
}