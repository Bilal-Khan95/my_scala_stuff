class results{
	private var phys = 0
	private var chem = 0
	private var math = 0
	private var total = 0
	private var per = 0
	
	def physics(a:Int)={
			if(a>=0 && a<=150){
				phys = a
			}else{
				println("INVALID ENTRY. ")
			}
		}
	def chemistry(a:Int)={
			if(a>=0 && a <=150){
				chem = a
			}else{
				println("INVALID ENTRY. ")
			}
		}
	def maths(a:Int)={
			if(a>=0 && a<=150){
				math = a
			}else{
				println("INVALID ENTRY. ")
			}
		}
	private def calculations()={
		total = phys + chem + math
		per = total*100/450
	}

	def show_results()={
		calculations()
		if(per>=60){
			println("Total Marks: " + total)

			println("Percentage: " +per)

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
		if(per<=50){
			println("You have failed the course.")
		}
	
	
		}
	}
}

var results_pointer= new results()




//print("Marks for Physics: ")
results_pointer.physics(90)

//print("Marks for Chemistry: ")
results_pointer.chemistry(80)

//print("Marks for Maths: ")
results_pointer.maths(90)


results_pointer.show_results()