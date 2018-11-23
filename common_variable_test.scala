import scala.io.StdIn.{readInt}

object bank{
	var dollar = 95
}

class bank{
	var a = 1
	def amount(x:Int)={
		println("Dollar amount = $"+ bank.dollar * x)
	}
	def set_dollar(y:Int)={
		bank.dollar = y
	}
}



var hsbc = new bank()
var natwest = new bank()
var barclays = new bank()

barclays.set_dollar(100)


println("How many dollars? ")
natwest.amount(readInt)