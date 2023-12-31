number1 = int(input("Enter the first number:"))
number2 = int(input("Enter the second number:"))
number3 = int(input("Enter the third number:"))

if number1 > number2 and number1 > number3: 
	print(number1, "is the greatest number:")

if number2 > number3 and number2 > number1:
	print(number2, "is the greatest number:")

if number3 > number2 and number3 > number1:
	print(number3, "is the greatest number:")