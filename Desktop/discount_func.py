def my_discount(price, discount):
	discount_price =(price - (discount /100) * price)
	return discount_price



price = 150
discount = 15

print(my_discount(price, discount))
 