def largest_number(a, b, c):
	l = 0
	if a > b and a > c:
		l = a 
	if b > a and b > c:
		l =b
	if c > b and c > a:
		l =c
	return l
       
print(largest_number(8, 5, 6))
print(largest_number(6, 5, 8))
print(largest_number(5, 8, 6))

#def largest(number1, number2, number3):
#	largest = number1
#	if number2 > number1:
#		largest = number2:
#	elif number3 > number2:
#		largest = number3
#	return largest