unit = int(input("Enter an integer:"))

if unit <= 100:
   print("no charge:")

if unit > 100 and unit < 200:
   unit =(unit - 100)*10
   print(unit)
 
    
if unit > 200:
   unit = unit - 100
   unit =(100 * 10) + (unit - 100)*20
   print(unit)
  