print("""

    List of menu functions
    1-> Phonebook
    2. Messages
    3. Chat
    4. Call register
    5. Tones
    6. Settings
    7. Call divert
    8. Games
    9. Calculator
    10. Reminders
    11. Clock
    12. Profiles
    13. Sim sevices
	 
    """)
phone_menu = int(input("select option :"))
match (phone_menu):
 case 1:  phone_book = int(input("""
       	Phonebook
       	1. search
      	2. Service Nos.
     	3. Add name
     	4. Erase
      	5. Edit
     	6. Assign tone
      	7. Send b'card
       	8. Options
	  1. Type of view
	  2. Memory satus
       	9. Speed dials
      	10. Voice tags
	
	select option: 
       """))
match(phone_book):
 case 1: print("welcome to search")
 case 2: print("welcome to service nos")
 case 3: print("welcome to add name")
 case 4: print("welcome to erase")
 case 5: print("welcome to edit")
 case 6: print("welcome to assign tone")
 case 7: print("welcome to send b'card")
 case 8: option = int(input(""" 
		welcome Option
		1-> Type of view
		2-> Memory statu
		"""))
match(option):
 case 1: print("welcome to type of view")
 case 2: print("welcome to memory status")
 case 9: print("welcome to speed dials")
 case 10: print("welcome to voice tags")




	