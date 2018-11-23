var msg = "I am going to London"
var i = 0

while(i< msg.length()){
	if(msg.substring( i, i+1) !=" "){
		print(msg.substring(i,i+1))

	}
	else{
		println(" ")
	}
	i+=1
}