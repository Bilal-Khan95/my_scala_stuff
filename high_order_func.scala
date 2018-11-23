import scala.io.StdIn.{readInt}
def add(a:Int, b:Int)= {
	var x = a + b
	print(x)
}



def subtract(a:Int, b:Int) ={
	var y = a - b
	println("a - b = "+y)
}



def mult(a:Int, b:Int, c:Int) = {
	var z = a*b*c
	println("a x b x c = "+z)
}

def operations(maths:(Int,Int)=>Unit){
	maths(readInt,readInt)

}

operations(subtract)