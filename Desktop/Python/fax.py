def nokia_phone():
  menu = (input("""
		NOKIA PHONE MAIN MENU

*****************************************************************

		1-> Phonebook
		2-> Messages
		3-> Chat
		4-> Call Register
		5-> Tones
		6-> Settings
		7-> Call Divert
		8-> Games
		9-> Calculator
		10-> Reminders
		11-> Clock
		12-> Profiles
		13-> Sim services

**********************************************************************
		select options: """))
match menu:
	case '1':
		print(phone_book())
	case '2':
		print(messages())
	case '3':
		print(chat())
	case '4':
		print(call_register())
	case '5':
		print(tones())
	case '6':
		print(settings())
	case '7':
		print(call_divert())
	case '8':
		print(games())
	case '9':
		print(calculator())
	case '10': 
		print(reminders())
	case '11':
		print(clock())
	case '12':
		print(profiles())
	case '13': 
		print(sim_servicest())











