def zeroed_code(my_list):
	my_list[0] = 0
	my_list[(len(my_list) - 1)] = 0
	return my_list


my_list = [2, 5, 7, 8, 9]

print(zeroed_code(my_list))