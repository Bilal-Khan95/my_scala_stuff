import java.sql.{Connection, DriverManager}

try{
	Class.forName("com.mysql.cj.jdbc.Driver")
	val connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/bilal_databe", "root", "")
	val statement = connection.createStatement
	val rs = statement.executeQuery("SELECT * FROM school")
	println("--------------------------")
	while(rs.next){
		val name = rs.getString("Name")
		val marks = rs.getInt("Marks")
		println("Name: "+name+" -- Marks: "+marks)
	} 
	statement.executeUpdate("update school set marks = 100 where regno = 104")
}catch {
	case e:Exception => println(e)
}

//connectin.close