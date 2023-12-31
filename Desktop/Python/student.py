passed = 0
failed =0
count =0

scores = int(input("Enter students scores:"))

while scores >= 45:
	print("passed")
	count+= 1
     	 if scores < 45:
			print("failed")

	count+= 1
print("The number of student that passed", " = "  "count")
print("The number of student that failed", "  = " "count")
