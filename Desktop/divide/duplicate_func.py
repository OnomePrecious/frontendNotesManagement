def check_duplicate(string_list):
	check = set()
	for string in string_list:
		if string in check:
			return string
		else:
			check.add(string)		
	return "no duplicate"



string_list =['apple', 'orange', 'banana', 'apple']
print(check_duplicate(string_list))