import scala.io.StdIn.{readInt}

var x = 3000000

var a = 0

for(i <- 2 to x){
	if(x%i == 0){
		a+=1
	}
	if(a == 1){
		println(x + " is a prime number")
	}
	a = 0
}

/*else{
	println(x + " is not a prime number")
}*/