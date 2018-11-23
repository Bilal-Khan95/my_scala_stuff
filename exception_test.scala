try{
	var a = 4
	var b = 2
	var c = a/b
	println("Result: "+c)


	var numbers = Array(2,3,5)
	println("The")
	println("Number")
	println("At")
	println("Position 3")
	println("Is "+ numbers(3))
}catch{
	case a:ArithmeticException =>{
		println("You're maths is wrong foo")
	}
	case b:ArrayIndexOutOfBoundsException =>{
		println("That position don't exist foo")
	}
}