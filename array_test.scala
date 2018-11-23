var numbers = Array(2, 7, 8, 10, 973, 974, 1076, 8989, 235)

var i = 0
var x = numbers(0)
while(i < numbers.length){
	if(numbers(i) > x){
		x = numbers(i)
		
	}
	
	i+=1
}

println(x)