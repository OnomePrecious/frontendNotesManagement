import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;
public class Checkout{
	private final List<String> productName = new ArrayList<>();
	private final List<Integer> quantity = new ArrayList<>();
	private final List<Double> price = new ArrayList<>();
	private final List<Double> total = new ArrayList<>();
	private double discount;
	private double amountPaid;
	private double subTotal;
	private double discountPrice;
	private double vat;
	private double billTotal;
	private double balance;
	private String customerName;
	private String cashierName;
	Scanner input = new Scanner(System.in);

public static void main(String[] args) {
	Checkout checkout = new Checkout();
	checkout.collectInput();
	checkout.calculateTotalForEachProduct();
	checkout.calculateSubTotal();
	checkout.calculateDiscount();
	checkout.calculateVat();
	checkout.calculateBillTotal();
	checkout.printReceipt();
	checkout.calculateBalance();
	checkout.printReceipt2();
}
public void collectInput(){
	System.out.println("What is the customer's Name ");
	String customerName = input.nextLine();

	System.out.println("What did the user buy ");
        String name = input.nextLine();
	productName.add(name);

	System.out.println("How many pieces" );
	int piece = input.nextInt();
	quantity.add(piece);
	
	System.out.println("How much per unit" );
	double unitPrices = input.nextDouble();
	price.add(unitPrices);

 	System.out.println("Add more items");
	input.nextLine();
	String status = input.nextLine();

	while(status.equalsIgnoreCase("yes")){
	System.out.println("What did the user buy ");
	String purchase = input.nextLine();
	productName.add(purchase);

	System.out.println("How many pieces" );
	int pieces = input.nextInt();
	quantity.add(pieces);
	
	System.out.println("How much per unit" );
	double unitPrice = input.nextDouble();
	price.add(unitPrice);

 	System.out.println("Add more items");
	String answer = input.nextLine();
}

System.out.println("What is your name: ");
cashierName = input.nextLine();

System.out.println("How much discount will he get?");
 discount = input.nextDouble();
}
public void calculateTotalForEachProduct(){
	for(int index = 0; index < quantity.size(); index++){
		double totalPrice = price.get(index) * quantity.get(index);
		total.add(totalPrice);
	}
}
public void calculateSubTotal(){
	for(int index = 0; index < total.size(); index++) {
		subTotal+= total.get(index);
	}
}
public void calculateDiscount() {
	discountPrice = (discount / 100) * subTotal;
}
public void calculateVat() {
	vat = (17.50 / 100) * subTotal;
}
public void calculateBillTotal() {
	billTotal = subTotal - discountPrice + vat;
}
public void calculateBalance() {
	System.out.println("How much did your customer pay?");
	amountPaid = input.nextDouble();
	balance = amountPaid - billTotal;
}

public void printReceipt(){
System.out.println("SEMICOLON STORES");
System.out.println("MAIN BRANCH");
System.out.println("LOCATION 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
//System.out.printf("%s%d", "TEL:", 03293828343);
System.out.println("Cashier name:" + cashierName);
System.out.println("Customer Name:" + customerName);
System.out.println("==========================================================");
System.out.println("\t" + "\t" + "ITEM" + "\t" + "QTY" + "\t" + "PRICE" + "\t" + "TOTAL");
System.out.println("======================================================================");
	for(int index = 0; index < productName.size(); index++) {
	    System.out.printf("%s\t%d\t%.2f%n",productName.get(index), quantity);
}
System.out.printf("""
=====================================================
	Sub total: %.2f
	Discount: %.2f
	VAT @ 17.50%%: %.2f
===============================%n""", subTotal, discountPrice, vat);
}

public void printReceipt2(){
System.out.println("SEMICOLON STORES");
System.out.println("MAIN BRANCH");
System.out.println("LOCATION 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
//System.out.printf("%s%d", "TEL:", 03293828343);
System.out.println("Date:");
System.out.println("Cashier name:");
System.out.println("Customer Name:");
System.out.println("==========================================================");
System.out.println("\t" + "\t" + "ITEM" + "\t" + "QTY" + "\t" + "PRICE" + "\t" + "TOTAL");
System.out.println("======================================================================");
	for(int index = 0; index < productName.size(); index++) {
	    System.out.printf("%s\t%d\t%.2f%n",productName.get(index), quantity);
}
System.out.printf("""
=====================================================
	Sub total: %.2f
	Discount: %.2f
	VAT @ 17.50%%: %.2f
===============================%n""", subTotal, discountPrice, vat);
System.out.printf("""
	Bill Total: %.2f

	Amount Paid: %.2f
	    Balance: %.2f%n""",billTotal, amountPaid, balance);
System.out.println("""
=========================================================

THANK YOU FOR YOUR PATRONAGE
============================================================
""");

}

}


