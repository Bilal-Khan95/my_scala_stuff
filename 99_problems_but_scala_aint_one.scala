import scala.io.StdIn.{readInt}
var last = List(1, 1, 2, 2, 3, 4)
//1
//println(last(last.size-1))

//2
//println(last(last.size-2))

//3
/*print("Enter index number of list (must be less than list size of %s) ".format(last.size) )
var x = readInt
println(last(x))*/

//4
//println(last.length)

//5
//println(last.reverse)

//6
/*if (last==last.reverse)
{
	println("the list is palindrome")
}

else {
	println("the list is okay")
}*/

//7
/*val second_last = List(List(List(1, 1), 2, List(3, List(5, 8))))
println(flatten(second_last))*/

//8
/*for(i <- 0 to (last.size-1)){
	if(last(i) == last(i+1)){

	}
}*/

var a = 811321
var b = 0
while (b<6){
	
	println(a%10)
	a=a/10
	b+=1
}