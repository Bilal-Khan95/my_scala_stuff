import scala.io.StdIn.{readInt, readLine}


class calculator{
	def menu{
		println("Which calulation? \n 1) Multiply \n 2) Division \n 3) Addition \n 4) Subtraction")

		var x = readInt

		x match {
			case 1 => multiplication
			case 2 => division
			case 3 => addition
			case 4 => subtraction	
			case _ => print("INVALID ENTRY")
		}
	}
	def mult(a:Int, b:Int){
		println("Result = "+ a*b)
	}
	def div(a:Int, b:Int){
		println("Result = "+ a/b)
	}
	def add(a:Int, b:Int){
		println("Result = "+ a+b)
	}
	def sub(a:Int, b:Int){
		println("Result = "+ (a-b))
	}

	def multiplication{
		print("Enter 2 numbers: \n1st No. ")
		val first_no = readInt
		print("2nd No. ")
		val second_no = readInt
		mult(first_no, second_no)
	}
	def division{
		print("Enter 2 numbers: \n1st No. ")
		val first_no = readInt
		print("2nd No. ")
		val second_no = readInt
		div(first_no, second_no)
	}
	def addition{
		print("Enter 2 numbers: \n1st No. ")
		val first_no = readInt
		print("2nd No. ")
		val second_no = readInt
		add(first_no, second_no)
	}
	def subtraction{
		print("Enter 2 numbers: \n1st No. ")
		val first_no = readInt
		print("2nd No. ")
		val second_no = readInt
		sub(first_no, second_no)
	}
}



var calc_ref = new calculator()

calc_ref.menu