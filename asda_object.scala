import scala.io.StdIn.{readLine, readInt, readDouble}

class asda{
	var product_name = readLine("Product?: ")
	print("Amount?: ")
	var product_quantity = readInt
	print("Price?: ")
	var product_price = readDouble

	def amount{
		
		println("Total value is: "+product_quantity*product_price)

	}

	def bill{
		println('\n'+"Product: "+product_name)
		println("Price: "+product_price)
		println("Amount: "+product_quantity)
		println("VAT: " + product_price*15/100)
		println("Net Bill: "+ (product_price + product_price*15/100))

	}
}

var asda_pointer = new asda()

asda_pointer.bill
asda_pointer.amount