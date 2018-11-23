var countries = List("UK", "USA", "Pakistan", "Canada")

def capitals(c:String):String={
	var city =" "
	if(c == "UK"){
		city = "London"
	}

	if(c == "USA"){
		city = "Washington DC"
	}

	if(c == "Pakistan"){
		city = "Islamabad"
	}

	if(c == "Canada"){
		city = "Ottawa"
	}

	return city
}

var listx = countries.map(capitals)

for(a <- listx){
	println(a)
}


var numbers = List(23, 45, 11, 34, 54, 456, 23452, 45224352)

def even_odd(a:Int):Boolean={
	if(a%2 == 0){
		return true
	}else{
		return false
	}
}

var even_numbers = numbers.filter(even_odd)

for(x <- even_numbers)