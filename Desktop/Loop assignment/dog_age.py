print("A dog's age in dog years: ")
human_years =float(input("Enter your dog's age in human years: "))
if human_years < 0:
	print("Enter valid age: ")

elif human_years <= 2:
	dog_years = human_years * 10.5
else:
	dog_years = 2 * 10.5 + (human_years - 2) * 4
print(dog_years)
