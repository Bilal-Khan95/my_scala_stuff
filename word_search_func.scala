import scala.io.StdIn.{readLine}

def message(find:String, msg:String)={
	var x = 0
	var word = 0
	while( x < msg.length){
		if(msg.substring(x, x+1)==find.substring(0,1)){
			if(msg.substring(x,x+find.length())== find){
				word+=1
				x = x + find.length() - 1
			}

		}
	x+=1
	
	}
	println(word)
}

message(readLine, readLine)