abstract class draw{
	def drawing()={}
}

class line extends draw{
	override def drawing()={
		println("Draw line")
	}
}

class circle extends draw{
	override def drawing()={
		println("Draw circle")
	}
}

class square extends draw{
	override def drawing()={
		println("leo has a square head")
	}
}

def letsdodrawing(x:draw){
	x.drawing
}

var l = new line()
var c = new circle()
var s = new square()

letsdodrawing(s)