import scala.io.StdIn.{readInt}

class salary_exp extends Exception{}
class too_many_days_too_many_many_days extends Exception{}

def salarycalc(salary:Int, absense:Int):Float = {
	var sal = 0
	var net = 0
	if(absense>=6 && absense < 10){
		var a = new salary_exp
		throw a
	}
	if(absense <=31 && absense >=10){
		var b = new too_many_days_too_many_many_days
		throw b
	}else{
		sal = salary*15/100
		net = salary - sal
		println("Salary for this month: "+net)
	}
	return net
}

try{
	salarycalc(readInt,readInt)
}catch{
	case a:salary_exp => {
		println("Invalid Number of Days")
		println("Re-enter values")
	}
	case b:too_many_days_too_many_many_days=> {
		println("There's toomany days, too many many days")
		println("Try again")
	}
}finally{
	println('\n'+"END")
}