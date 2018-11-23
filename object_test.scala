import scala.io.StdIn.{readInt}

class manchester{
	var quantity = readInt
	var price = readInt
}

var manchester_obj = new manchester()

println("The new quantity is: "+manchester_obj.quantity)

print("The new price is: "+manchester_obj.price)