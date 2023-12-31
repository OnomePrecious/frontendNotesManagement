unit = int(input("Enter an integer:"))

if unit <= 100:
   print("no charge:")

if unit > 100 and unit < 200:
   unit =(unit - 100)*10
   print(unit, "charge of #10:")
 
    
if unit > 200:
   unit =(100 * 10) + (unit - 100)*20
   print(unit, "charge of #20:")
  