import java.util.Scanner;
public class HumanTest{
public static void main (String [] args){
Scanner input = new Scanner(System.in);

Human human = new Human(); // you can use anything to name your Human

System.out.print("Enter your name : ");
String name = input.nextLine();

human.setName(name); // felix
human.setAge(25);
human.setHeight(140);



int age = human.getAge();

System.out.println("NAME IS : " + human.getName());
System.out.println("AGE IS : " + age);
System.out.println("HEIGHT IS : " + human.getHeight());

}

}