public class DemoAddition {
public static void main(String...args) {

int total = 0;
int [] array = {34, 66, 45, 25};
for (int counter = 0; counter < array.length; counter++ ) {
total+= array[counter];
}
System.out.println("The total of the array is:" + total);
		}
}