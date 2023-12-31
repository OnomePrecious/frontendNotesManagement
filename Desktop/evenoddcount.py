even_count = 0
odd_count = 0

for numbers in range(1, 100):
	if numbers % 2 == 0:
		even_count += 1
	else:
		odd_count += 1
print("The even numbers between 1 and 100: ")
print(even_count)
print("The odd numbers between 1 and 100: ")
print(odd_count) 
