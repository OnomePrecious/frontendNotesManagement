print("Prime numbers between 1 and 100: ")
number = []
for number in range(2, 101):
	prime = True
	for num in range(2, int(number**0.5) + 1):
		if number % num == 0:
		   prime = False
		   break
	if prime:
		print(number, end=" ")
