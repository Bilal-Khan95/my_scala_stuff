import scala.io.StdIn.{readInt}
abstract class bank{
	def deposit(a:Int)
	def withdraw(a:Int)
	def show_balance()
}

class hsbc extends bank{
	override def deposit(a:Int)={
		println("Deposited: "+ a)
		var dep = a
	}
	override def withdraw(b:Int)={
		println("Withdrawn: "+ b )
		var with_draw = b
	}
	override def show_balance()={
		var balance= dep - with_draw
		println("Balance: "+ balance)
	}
}

class barclays extends bank{
	var bal = 0
	override def deposit(a:Int){
		bal = bal + a
		println(bal)
	}
	override def withdraw(b:Int){
		bal = bal - b
		println(bal)
	}
	override def show_balance(){
		println(bal)
	}
}
var bank_ref: bank = _

var hsbc_ref = new hsbc()

def hsbc_banking(bank_ref:bank)={

	hsbc_ref.deposit(readInt)
	hsbc_ref.withdraw(readInt)
	hsbc_ref.show_balance()
}

hsbc_banking(hsbc_ref)