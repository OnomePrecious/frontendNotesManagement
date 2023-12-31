tax = int(input("Enter cost:"))

if tax < 1000000: 
	tax = tax*0.1
	print(tax, "is the user pay")

if tax > 1000000 and tax <= 3000000:
	tax = tax*0.15
	print(tax, "is the user pay")

if tax > 3000000 and tax <= 5000000: 
	tax = tax*0.2
	print(tax, "is the user pay")

if tax > 5000000:	
	tax = tax*0.25
	print(tax, "is the user pay")