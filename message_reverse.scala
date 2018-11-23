var msg = "I am going to London"
var i = 0
var word = " "
var word2= "am"

while(i>=0){
	if(msg.substring( i, i+1) ==" "){
		println(word)
		println()
		word=""
	}
	else{
		word = msg.substring(i, i+1) + word
	}
	i-=1
}
print(word)	