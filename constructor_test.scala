import scala.io.StdIn.{readInt}
class manchester(){
	println("First constructor")
	def this(a:Int)={
		this()
		println('\n'+"Second constructor")
	}
	def this(a:Int, b:Int)={
		this()
		println("Third constructor")
	}
}

var manc_ref1 = new manchester(readInt, 3)
var manc_ref2 = new manchester(readInt)