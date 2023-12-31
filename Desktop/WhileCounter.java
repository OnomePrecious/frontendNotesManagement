public class WhileCounter {
public static void main(String[] args) {
int total = 0;
//while (counter <= 10 ) { 
  for(int number = 2; number <= 20; number+= 2){
total+= number;
}
System.out.printf("Sum is : %d%n ", total);
 //++counter;

//System.out.println();
} 
}