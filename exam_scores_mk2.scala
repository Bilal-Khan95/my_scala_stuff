var phys= 99
var chem = 95
var math = 70
var fail = 0

if(phys<90){
	fail = fail + 1
}
if(chem<90){
	fail = fail + 1
}
if(math<90){
	fail = fail + 1
}

if(fail == 0){
	var total=phys+chem+math

	var per = total*100/450 

	if(total>=270){
		println("Total Marks: "+total)
		println("Percentage: "+per)

	}
}
if(fail == 1){
	if (chem <90 || phys <90 || math <90){
		if(chem<90){
			println("You have failed chemistry, marks = " + chem)
		}
		else if(phys<90){
			println("You have failed physics, marks = " + phys)
		}
		else if(math<90){
			println("You have failed maths, marks = " + math)
		}

	}
	println("Retake the exam")
}
if(fail == 2){
	if(chem <90 && phys <90 || chem <90 && math <90 || phys <90 && math <90){
		if(chem<90){
			println("You have failed chemistry, marks = " + chem)
		}
		if(phys<90){
			println("You have failed physics, marks = " + phys)
		}
		if(math<90){
			println("You have failed maths, marks = " + math)
		}


	}
	println("Repeat the course")
}


if(fail == 3){
	if(chem <90 && phys <90 && math <90){
		println("You have failed all 3 subjects.")

	}
	println("Go home")
}