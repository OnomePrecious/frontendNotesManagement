public class TableValues{
public static void main(String...args) {

int number = 0;

System.out.print("N\tN2\tN3\tN4");
System.out.println();
while(number <= 4) {
number++;

System.out.println(number + "\t" + (number * number) + "\t" + (number * number * number) + "\t" + (number * number * number *number));

}
}
}