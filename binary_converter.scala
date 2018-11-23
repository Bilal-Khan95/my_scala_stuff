import scala.io.StdIn.{readInt}

def binary_func(no:Int):String={
var num = no
var binary = ""

while(num>=1){
	
	if(num%2 == 0){
		binary = "0" + binary
	}
	if(num%2 == 1){
		binary = "1" + binary
	}
	
	num=num/2
	}
return binary
}

print("Your number: ")
var result = binary_func(readInt)

println("In binary: "+result)





def decimal_func(dec:String):Int={
	var decimal = 0
	var power = 0
	var bin = dec.length() - 1
	while (bin>= 0){
		if(dec.substring(bin, bin+1) == "1"){
			decimal = decimal + ((scala.math.pow(2,power))*1).toInt
		}else{
			decimal = decimal + ((scala.math.pow(2,power))*0).toInt
		}
	bin -= 1
	power += 1
	}
	return decimal
	
	}
	

println("Back to decimal: "+decimal_func(result))