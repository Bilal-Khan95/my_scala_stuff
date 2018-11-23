import scala.io.StdIn.{readLine, readInt}

var regno = new Array[Int](5)
var name =  new Array[String](5)
var marks = new Array[Int](5)

var i = 0
var index=0

while(i < regno.length){
	print("Enter RegNo(no.): ")
	regno(i) = readInt
	
	print("Enter Name: ")
	name(i) = readLine
	
	print("Enter Marks(no.): ")
	marks(i) = readInt
	println("")
	if(marks(i) > marks(0)){
		index=i
	}
i += 1
}


println("Position "+index+" got the best marks: "+ marks(i))
