var phys= 89
var chem = 89
var math = 89

var total=phys+chem+math

var per = total*100/450 

if(total>=270){
	println("")
	println("Total Marks: "+total)
	println("Percentage: "+per)
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

if (chem <90 || phys <90 || math <90){
	println("")
	println(total)
	println("Retake the exam")
	
}

else if(chem <90 && phys <90 || chem <90 && math <90 || phys <90 && math <90){
	println("")
	println(total)
	println("Repeate the course")
}

else if(chem <90 && phys <90 && math <90){
	println("")
	println(total)
	println("Go home you mong")
}

