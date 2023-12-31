result = []
for numbers in range(1500, 2701):
	if numbers % 7 == 0 and numbers % 5 == 0:
		result.append(numbers)
print("Numbers divisible by 7 and multiples of 5 between 1500 and 2700: ")
print(result)