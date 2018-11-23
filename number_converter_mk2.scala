import scala.io.StdIn.{readInt}



def ones(no:Int):String = {
	var result = ""
		no match{		
		case 1=> result = "One "
		case 2=> result = "Two "
		case 3=> result = "Three "
		case 4=> result = "Four "
		case 5=> result ="Five "
		case 6=> result="Six "
		case 7=> result="Seven "
		case 8=> result="Eight "
		case 9=> result="Nine "
		case 10=> result="Ten "
		case 11=> result="Eleven "
		case 12=> result="Twelve "
		case 13=> result="Thirteen "
		case 14=> result="Fourteen "
		case 15=> result="Fifteen "
		case 16=> result="Sixteen "
		case 17=> result="Seventeen"
		case 18=> result="Eighteen"
		case 19=> result="Nineteen"
		case _=> result=""
	}
	return result
}

def tens(no:Int):String = {
	var result = ""
	no match{
		case 2=> result="Twenty "
		case 3=> result="Thirty "
		case 4=> result="Fourty "
		case 5=> result="Fifty "
		case 6=> result="Sixty "
		case 7=> result="Seventy "
		case 8=> result="Eighty "
		case 9=> result="Ninety "
		case _=> result=""
	}
	return result
}


def num_to_string(no:Int):String = {

	var answer = ""
	var num = no
	if(num>=1000){
		answer += (ones(num/1000)+"Thousand ")
		num = num - (num/1000)*1000
	}

	if(num>=100){
		answer += (ones(num/100)+"Hundred and ")
		num = num - (num/100)*100
	}

	if(num>=20){
		answer+= (tens(num/10)+ones(num%10))
	}
	if(num<20){
		answer+= ones(num)
	}
	return answer
}

val input_num = readInt

for(i <- 1 to input_num){
	println(num_to_string(i))
}