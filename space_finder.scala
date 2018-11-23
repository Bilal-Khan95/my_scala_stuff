var msg = "I am going am to am London am"
var space = 0
var i = 0
var word = "am"

while(i<=msg.length() - 2){
	if(msg.substring( i, i+2) == word){
		space+=1
	}
	i+=1
}

print(space)