package tieto.bank.admin

class Payment {

	Date date
	Integer amount
	Account from
	Account to

	static constraints = {
		//Create minimum value of amount
		amount min : 1
		from nullable:true
		to nullable:true
	}

	def beforeValidate(){
		date = new Date()
	}
}
