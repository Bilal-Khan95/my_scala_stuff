var numbers = Array(3452, 3452, 8, 10, 973, 974, 1076, 9, 35)

var i = 1
var first = numbers(0)
var second = numbers(0)
while(i < numbers.length){
	if(numbers(i) > first){
		second = first
		first = numbers(i)
	}else if(first == second){
		second = numbers(i)
	}else if(numbers(i)> second){
		second = numbers(i)
	}
i += 1}

println(first)
println(second)