public class InitArray {
public static void main(String[] args) {
//final int ARRAY_LENGTH = 10;
int[] array = new int[10]; //[ARRAY_LENGTH];

System.out.println("Index" + "\t" + "Value");

for(int counter = 0; counter < array.length; counter++) {
	array[counter] = 2 + 2 * counter;

System.out.printf("%3d%8d%n", counter, array[counter]) ;
	}
     }
  } 