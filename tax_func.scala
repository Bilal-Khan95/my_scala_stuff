import scala.io.StdIn.{readInt}

def tax(salary:Int):Int={
	var tax1=0
	if(salary<1000){
		println(tax1)
		//println("Your salary is: "+ salary)
		//println("Your tax is: "+ tax1)
	} else if(salary>=1000 && salary<2000) {
		tax1 = salary*15/100
		//println("Your salary is: "+ salary)
		//println("Your tax is: "+ tax1)
	} else if(salary >=2000 && salary<3000){
		tax1 = salary*17/100
		//println("Your salary is: "+ salary)
		//println("Your tax is: "+ tax1)
	} else if(salary>=3000){
		tax1 = salary*21/100
		//println("Your salary is: "+ salary)
		//println("Your tax is: "+ tax1)
	}
	
	return tax1

	
}
var income = readInt
var yourtax = tax(income)

println('\n'+"Your salary is: "+income+'\n'+"Your tax is: "+ yourtax)