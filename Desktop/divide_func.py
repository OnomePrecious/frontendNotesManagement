def divide_or_square(number):
	if number % 5 == 0:
		square_root = number ** 0.5
		return square_root
	else:
		remainder = number % 5
		return remainder 

number = 10
print(divide_or_square(number))


