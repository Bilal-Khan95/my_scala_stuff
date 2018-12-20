import scala.io.StdIn.{readLine, readInt}
val r = scala.util.Random

var first_card = r.nextInt(10 +1)
var second_card = r.nextInt(10 +1)
var cards_total = first_card + second_card
var total = 0
var total1 = 0

start

def start(){
	println("\nBLACKJACK \nWould you like to play? \nYes or No")
	var play_check = readLine

	if(play_check == "yes"){
		start_play
	}else{
		println("\nGOODBYE")
	}
}

def start_play(){
	println("\nCard 1: " + first_card + "\nCard 2: "+ second_card + "\nTotal: " + cards_total)
		
	if(cards_total > 21){
		game_restart
	}else{
		card_draw
	}
}
def card_draw(){
	
	println("\n1) HIT\n2) STAND")
	var play_choice = readInt
	if(play_choice == 1){
		play_hit
	}else if(play_choice == 2){
		println("Total: "+total)
	}
}

def play_hit(){
	var round_card = r.nextInt(11)
	total = cards_total + round_card
	
	
	if(total <21){
		//println("\nNew card: "+ round_card+ "\nRound Total: "+total)
		println(round_card+" test "+total)
		card_draw
		
	}
	if(total>21){
		println(round_card+" test "+total)
		game_restart	
	}
	else if(total == 21){
		println("\nYOU WIN\nNew Game?\nYes/No "+round_card+" test "+total)
		var new_game = readLine
		if(new_game == "yes"){
			start_play
		}else{
			println("END GAME")
		}
	}
	total = total + round_card
}
def game_restart(){
	println("\nBUST \nGo back to START menu? \nYes/No\n")
	var play_again = readLine
	if(play_again == "yes"){
		start
	}else{
		println("\nEND GAME")
	}
}
