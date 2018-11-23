import java.sql.{Connection, DriverManager}
import scala.io.StdIn.{readLine, readInt}

try{
	Class.forName("com.mysql.cj.jdbc.Driver")
	val connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "")
	val statement = connection.createStatement
	val rs = statement.executeQuery("select * from personal")
	
	var money_dep = 0
	var money_with = 0
	var money_balance = money_dep - money_with

	var money_query1 = s"select sum(amount) as money from withdraw where accno = %s".format(readLine)
	val withdraw_query = statement.executeQuery(money_query1)
	
	var money_query = s"select sum(amount) as money from deposit where accno = %s".format(readLine)
	val deposit_query = statement.executeQuery(money_query)

	def rs_create(name:String, address:String)={
		var create_query=s"insert into personal(name,address) values ('%s','%s')".format(name,address)
		statement.executeUpdate(create_query)
	}
		
	def rs_deposit(table:String, accno:String, ammount:String) = {
		var Query =s"insert into %s values (%s,'%s',sysdate())".format(table, accno, ammount)
		statement.executeUpdate(Query)
	}

	println("----------------------------------------------------------")
	println("Choose: \n1) Create Account\n2) Deposit Money\n3) Withdraw")
	var cmd_line = readLine

	while(rs.next){
		if(cmd_line == "1"){
			println("Create account")
			println("\nEnter: \nName\nAddress")
			rs_create(readLine, readLine)
			println("----------------------------------------------------------")
		}
		
		if(cmd_line == "2"){
			println("Deposit")
			println("\nEnter: \nAccNo\nAmount")
			rs_deposit("deposit", readLine, readLine)
			println("----------------------------------------------------------")
		}
		
		if(cmd_line == "3"){
			println("Withdraw")
			println("\nEnter: \nAccNo\nAmount")
			rs_deposit("withdraw", readLine, readLine)
			println("----------------------------------------------------------")
		}
	
		println("\nWould you like to do another transaction?")
		var second_transacation = readLine
		println("----------------------------------------------------------")
		if(second_transacation == "yes"){
			
			println("Show:\n1)Deposits\n2)Withdrawals\n3)Balance")
			var third_transaction = readLine
			
			if(third_transaction == "1"){
				println("Pick AccNo")
		
				money_dep = deposit_query.getInt("money")
				
				println("Total amount deposited: "+ money_dep)
				
			}
			
			if(third_transaction == "2"){
				println("Pick AccNo")
			
				money_with = withdraw_query.getInt("money")
				if(withdraw_query.next){
					println("Total amount withdrawn: "+money_with)
				}
				
			}
			if(third_transaction == "3"){
				println("Your balance is: "+money_balance)
			}
		}
		else{
			println("Transaction finished")
		}

	}

}catch {
	case e:Exception => println(e)
	case f:Exception => println(f)
}

//connectin.close