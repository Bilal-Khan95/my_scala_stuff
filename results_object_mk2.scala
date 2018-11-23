import scala.io.StdIn.{readInt}

class results2{
	private var chem = 0
	private var phys = 0
	private var math = 0
	private var total = 0
	private var per = 0
	private var fail = 0
	
	def physics(a:Int)={
			if(a>=0 && a<=100){
				phys = a
			}else{
				println("INVALID ENTRY. ")
			}
		}
	def chemistry(a:Int)={
			if(a>=0 && a <=100){
				chem = a
			}else{
				println("INVALID ENTRY. ")
			}
		}
	def maths(a:Int)={
			if(a>=0 && a<=100){
				math = a
			}else{
				println("INVALID ENTRY. ")
			}
		}
	private def calculations()={
		total = phys + chem + math
		per = total*100/300

		if(phys<60){
			fail = fail + 1
		}
		if(chem<60){
			fail = fail + 1
		}
		if(math<60){
			fail = fail + 1
		}
	}

	def show_results()={
		calculations()
		if(per>=60){
			println("Total Marks: " + total)
			println("Percentage: " +per+"%")
		
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
		if(per<60){
			println('\n'+"You have failed.")
			
			

		}
	}
	def fail_checker()={
		fail match{
				case 1 => println("Retake the exam")
				case 2 => println("Repeat the course")
				case 3 => println("Go home.")
				case _ => println("")
			}
		println("Failed subjects: "+fail)
	}
}

var results2_pointer = new results2

print('\n'+"Marks for physics: ")
results2_pointer.physics(readInt)

print("Marks for chemistry: ")
results2_pointer.chemistry(readInt)

print("Marks for maths: ")
results2_pointer.maths(readInt)

results2_pointer.show_results()
results2_pointer.fail_checker()