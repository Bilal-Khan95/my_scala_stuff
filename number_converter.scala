import scala.io.StdIn.{readInt}

var num = readInt

def ones

if((num/100)<10){
	var w = num/100
	w match{
		case 1 => print("One Hundred and ")
		case 2 => print("Two Hundred and ")
		case 3 => print("Three Hundred and ")
		case 4 => print("Four Hundred and ")
		case 5 => print("Five Hundred and ")
		case 6 => print("Six Hundred and ")
		case 7 => print("Seven Hundred and ")
		case 8 => print("Eight Hundred and ")
		case 9 => print("Nine Hundred and ")
	}
	
}
if((num%100)>=20 && (num%100)<=99){
	var x = (num%100)/10
	x match{
		case 2 => print(" Twenty")
		case 3 => print(" Thirty")
		case 4 => print(" Fourty")
		case 5 => print(" Fifty")
		case 6 => print(" Sixty")
		case 7 => print(" Seventy")
		case 8 => print(" Eighty")
		case 9 => print(" Ninety")
	}
}

if((num%100)<=19 && (num%100)>=10){
	var y = num%100
	y match {
		case 10 => print(" Ten")
		case 11 => print(" Eleven")
		case 12 => print(" Twelve")
		case 13 => print(" Thirteen")
		case 14 => print(" Fourteen")
		case 15 => print(" Fifteen")
		case 16 => print(" Sixteen")
		case 17 => print(" Seventeen")
		case 18 => print(" Eighteen")
		case 19 => print(" Nineteen") 
	}
}

if(((num%10)<10) || (num<10)){
	if((num%10)<10){
		var z = num%10
		z match{		
		case 1 => print(" One")
		case 2 => print(" Two")
		case 3 => print(" Three")
		case 4 => print(" Four")
		case 5 => print(" Five")
		case 6 => print(" Six")
		case 7 => print(" Seven")
		case 8 => print(" Eight")
		case 9 => print(" Nine")
	}
	}else if(num<10){
		var z1 = num
		z1 match{		
		case 1 => print(" One")
		case 2 => print(" Two")
		case 3 => print(" Three")
		case 4 => print(" Four")
		case 5 => print(" Five")
		case 6 => print(" Six")
		case 7 => print(" Seven")
		case 8 => print(" Eight")
		case 9 => print(" Nine")
	}
}
}