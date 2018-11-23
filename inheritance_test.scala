class one{
	var a = "This is class One"
	def addition(a:Int, b:Int)={
		println("A + B = "+ (a+b))
	}
	def subtraction(a:Int, b:Int)={
		println(a-b)

	}
}	
class two extends one{
	var b = "NO This is from class two ya dingus"
	def two_thingy()={
		println(b)
	}
}

class three extends one{
	override def subtraction(a:Int, b:Int)={
		print("A-B = "+(a-b))
	}
}

var one_pointer = new one()
var two_pointer = new two()
var three_pointer = new three()

two_pointer.addition(2,3)
one_pointer.subtraction(9,8)

two_pointer.two_thingy
three_pointer.subtraction(9,8)