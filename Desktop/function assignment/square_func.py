def divide_or_square(number):
	if number % 5 == 0:
		square_root = number ** 0.5
		return round(square_root, 2)
	else:
		remainder = number % 5
		return round(remainder, 2)

myNumber = 10
print(divide_or_square(myNumber))