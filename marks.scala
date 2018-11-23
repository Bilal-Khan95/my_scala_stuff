var physics= 110
var chemistry = 130
val maths = 75

var total=physics+chemistry+maths

var per = total*100/450

if(per>=60){
	println("")
	println("Total Marks:" + total)
	
	println("Percentage:" +per)
	
	if(per>=90){
		println("Grade: A+")
	}

	if(per>=80 && per<90){
		println("Grade: A")
	}

	if(per>=70 && per<80){
		println("Grade: B")
	}

	if(per>=60 && per<70){
		println("Grade: C")
	}

} 
if(per<50)
{
	println("You've failed the exam dumbo")
}