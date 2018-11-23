import scala.io.StdIn.{readInt}

class myexp extends Exception{}
try{
var first = readInt
var second = readInt
var result = first/second

if(second>first){
	var x = new myexp()
	throw x
}else{
	println("Result is: "+result)
}
}catch{
	case y:myexp => {
		println("WRONG MATHS")
	}
}