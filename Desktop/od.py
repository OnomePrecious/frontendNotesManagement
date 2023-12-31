#count =1000
count= 5000
sum = 0
#while(count <= 5000):
while(count >=1000):
	if count % 2 != 0:
		sum += count
#	count+= 1
	count -=1
	
print(sum)