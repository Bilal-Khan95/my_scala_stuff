import scala.io.StdIn.{readLine, readInt}

var regno = new Array[Int](5)
var name =  new Array[String](5)
var marks = new Array[Int](5)

var i = 0

var first_marks = marks(0)
var first_names = name(0)
var first_regno = regno(0)

while(i < regno.length){
	print("Enter RegNo(no.): ")
	regno(i) = readInt
	
	print("Enter Name: ")
	name(i) = readLine
	
	print("Enter Marks(no.): ")
	marks(i) = readInt
	println("")
	if(marks(i) > first_marks){
		first_marks = marks(i)
		first_names = name(i)
		first_regno = regno(i)
	}
i += 1
}


println(first_names+" got the best marks: "+ first_marks)
