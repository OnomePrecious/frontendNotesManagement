total_sum = 0	
count= 0
while True:
	number = int(input("Enter numbers or press 0 to finish: "))
	if number == 0:
	   break
	total_sum+= number
	count+=1
	if count == 0:
	   print("No numbers entered: ")
	else:	
		average = total_sum / count
		print("Total sum is:", total_sum)
		print("Average is:", average)