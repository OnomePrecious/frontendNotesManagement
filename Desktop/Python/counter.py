number = float(input("Enter numbers:"))
positive_count = 0
negative_count = 0
zero_count = 0

while number != -1:
	if number > 0:
		positive_count += 1

	if number < 0:
		negative_count += 1
 
	if number == 0:
		zero_count += 1

	number = float(input("Enter numbers:"))


print("positive count: " , positive_count)
print("negative count: " , negative_count)
print("zero count: ", zero_count)