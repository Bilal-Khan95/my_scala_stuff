import java.sql.{Connection, DriverManager}
import scala.io.StdIn.{readLine, readInt}

object bank_app{
	Class.forName("com.mysql.cj.jdbc.Driver")
	val connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/bilal_khan_bank", "root", "")
	val statement = connection.createStatement
}

var bank_app_ref = new bank_app()
try{
	bank_app_ref.main_menu
}catch{
	case e:Exception => println("The Exception: "+e)
}

class bank_app{
	def main_menu(){
		println("----------------------------------------------------------")
		println("Choose: \n1) Create Account\n2) Deposit\n3) Withdraw\n4) Show balance of accounts\n")
		var cmd_line = readLine

		cmd_line match{
			case "1" => create_account
			case "2" => money_deposit
			case "3" => money_withdraw
			case "4" => acc_balance_list
			case _ => print("\nINVALID ENTRY\n"); main_menu_reload
		}
	}
	
	def main_menu_reload = {
		println("Would you like to do another transaction? yes/no")
		var menu_yesno = readLine
		if(menu_yesno == "yes"){
			this.main_menu
		}else{
			println("END TRANSACTION")
		}
	}
	def rs_create(name:String, address:String)={
		var create_query=s"insert into personal(name,address) values ('%s','%s')".format(name,address)
		(bank_app.statement).executeUpdate(create_query)

	}
	
	def rs_deposit(table:String, accno:Int, ammount:Int) = {
		var Query =s"insert into %s values (%s,%s,sysdate())".format(table, accno, ammount)
		(bank_app.statement).executeUpdate(Query)
	}

	def balance_checker(accno:Int):Int={
		var dep_sum_amount=0
		var with_sum_amount=0
		
		var dep_sum = s"select sum(amount) as money from deposit_1 where accno = %s".format(accno)
		var dep_sum_query = (bank_app.statement).executeQuery(dep_sum)
		if(dep_sum_query.next()){
			dep_sum_amount = dep_sum_query.getInt("money")
		}
		
		var with_sum = s"select sum(amount) as money from withdraw_1 where accno = %s".format(accno)
		var with_sum_query = (bank_app.statement).executeQuery(with_sum)
		if(with_sum_query.next()){
			with_sum_amount = with_sum_query.getInt("money")
		}
		
		var balance = dep_sum_amount - with_sum_amount
		return balance
	}

	def acc_checker(accno:Int):Boolean = {
		val ac = s"select * from personal where accno = %s".format(accno)
		val account_details = (bank_app.statement).executeQuery(ac)
		if(account_details.next){
			val account_name = account_details.getString("Name")
			val account_address = account_details.getString("Address")
			println("\nName on account: "+account_name+"\nAddress: "+account_address)
			return true
		}else{
			println("INVALID ACCOUNT NUMBER")
			return false
		}
		
	}

	def create_account = {
		println("\nCREATE ACCOUNT")
		print("\nEnter Name: ")
		var name_input = readLine
		print("Enter Address: ")
		var address_input = readLine
		rs_create(name_input, address_input)
		println("\nACCOUNT CREATED\n----------------------------------------------------------")
		main_menu_reload
	}
	
	def money_deposit = {
		println("\nDEPOSIT")
		
		print("\nEnter AccNo: ")
		var acno = readInt
		if(acc_checker(acno) == true){
			print("Amount: ")
			var dep_am = readInt
			rs_deposit("deposit_1", acno, dep_am)
			println("\n£"+dep_am+" DEPOSITED\n----------------------------------------------------------")
			println("Current balance: "+balance_checker(acno))
			main_menu_reload
		}
	}
	
	def money_withdraw = {
		println("\nWITHDRAW")
		print("\nEnter AccNo: ")
		var acno = readInt
		if(acc_checker(acno) == true){
			println("Current balance: "+balance_checker(acno))
			println("\nWould you like to wihdraw money? yes/no\n")
			var withdraw_yesno = readLine
			if(withdraw_yesno == "yes"){
				println("Enter amount:")
				var with_d = readInt
				rs_deposit("withdraw_1", acno, with_d)
				println("\n£"+with_d+" WITHDRAWN\n----------------------------------------------------------")
				println("Current balance: "+balance_checker(acno))
				main_menu_reload	
			}else{
			main_menu_reload
			}	
		}
	}
	
	def acc_balance_list={
		var account_list = List(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26)
		var full_account_balance = account_list.map(balance_checker)
		var i = 0
		while(i< account_list.size){
			println("Account no: "+account_list(i)+" has Balance: "+full_account_balance(i))
			i+=1
		}
		main_menu_reload
	}
}