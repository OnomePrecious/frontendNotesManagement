number1 = int(input("Enter the first integer:"))
number2 = int(input("Enter the second integer:"))
number3 = int(input("Enter the third integer:"))

sum_of_numbers = number1 + number2 + number3
average_of_numbers = sum_of_numbers / 3
product_of_numbers = number1 * number2 * number3

smallest_number = min(number1, number2, number3)
largest_number = max(number1, number2, number3)

print(sum_of_numbers, "is the sum of the numbers:")
print(average_of_numbers, "is the average of the numbers:")
print(product_of_numbers, "is the product of the numbers:")
print(smallest_number, "is the smallest number:")
print(largest_number, "is the largest number:")