var bill = 2
var paid = 50

var change = paid - bill

var fifty = 0
var twenty = 0
var ten = 0
var five = 0
var two = 0
var one = 0
var remainder = 0

if(change >= 50){
	remainder = change % 50
	fifty = (change - remainder)/50
	change = change - fifty*50
	println(fifty+" 50(s)")
}
if(change >=20){
	remainder = change % 20
	twenty = (change - remainder)/20
	change = change - twenty*20
	println(twenty+" 20(s)")
}
if(change >=10){
	remainder = change % 10
	ten = (change - remainder)/10
	change = change - ten*10	
	println(ten+" 10(s)")
}
if(change >=5){
	remainder = change % 5
	five = (change - remainder)/5
	change = change - five*5
	println(five+" 5(s)")
}
if(change >=2){
	remainder = change % 2
	two = (change - remainder)/2
	change = change - two*2	
	println(two+" 2(s)")
}
if(change >=1){
	remainder = change % 1
	change = change - one*1	
	one = (change - remainder)/1
		
	println(one+" 1(s)")
}