phone_menu = int(input("""
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

	select option : 
    """))

match phone_menu:
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
	case__: print("wrong iput try again later")