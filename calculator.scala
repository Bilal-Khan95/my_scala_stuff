class calculator{
	def menu{
		println("Which calulation? \n 1) Multiply \n 2) Division \n 3) Addition \n 4) Subtraction")

		var x = readInt

		x match {
			case 1 => multiplication
			case 2 => division
			case 3 => addition
			case 4 => subtraction	
			case _ => print("INVALID ENTRY "); main_menu_reload
		}
	}
	def main_menu_reload = {
		println("Would you like to do another transaction? yes/no")
		var menu_yesno = readLine
		if(menu_yesno == "yes"){
			this.menu
		}else{
			println("END TRANSACTION")
		}
	}	
	def multiplication{
		print("Enter 2 numbers: \n1st No = ")
		val first_no = readInt
		print("2nd No = ")
		val second_no = readInt
		println("Result = " + (first_no * second_no))
		main_menu_reload
	}
	def division{
		print("Enter 2 numbers: \n1st No = ")
		val first_no = readInt
		print("2nd No = ")
		val second_no = readInt
		println("Result = "+ (first_no/second_no))
		main_menu_reload
	}
	def addition{
		print("Enter 2 numbers: \n1st No = ")
		var first_no:Int = readInt
		print("2nd No = ")
		var second_no:Int = readInt
		println("Result = "+ (first_no + second_no))
		main_menu_reload
	}
	def subtraction{
		print("Enter 2 numbers: \n1st No = ")
		val first_no = readInt
		print("2nd No = ")
		val second_no = readInt
		println("Result = " + (first_no- second_no))
		main_menu_reload
	}
}



var calc_ref = new calculator()

try {
	calc_ref.menu
} catch {
	case e:Exception => println("The Exception: "+e)
}