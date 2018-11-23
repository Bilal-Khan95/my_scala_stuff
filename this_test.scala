class boom{
	var x = 95
	
	def message()={
		var t = 12
		var x = 25
		println("t1: "+t)
		x = 42
		println("x1: " + this.x)
	}
	def message2()={
		println("x2: "+ x)
	}
	
}
var boom_ref = new boom()

boom_ref.message()
boom_ref.message2()