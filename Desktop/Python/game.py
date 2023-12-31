import random

guess = random.randint(1, 10)
for number in range(3):
	user_input = int(input("Enter a guess: "))

	if guess == user_input:
		print("you win")
		break

	else:
		print("try again")	
	
