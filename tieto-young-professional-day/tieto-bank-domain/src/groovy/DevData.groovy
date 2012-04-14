import tieto.bank.admin.*

/**
 * 
 */

/**
 * @author ondrejkvasnovsky
 *
 */
class DevData {

	void insert() {
		def saveParrams = [failOnError:true, flush:true]

		User user1 = new User(name:"Kristyna Wasylkiwova");
		user1.save(saveParrams)
		User user2 = new User(name:"Petra Karasova");
		user2.save(saveParrams)

		Account a1 = new Account(balance:200, owner:user1, type:AccountType.Private)
		a1.save(saveParrams)
		Account a2 = new Account(balance:2000, owner:user1, type:AccountType.Corporate)
		a2.save(saveParrams)

		Payment p1 = new Payment()
		p1.amount = 1000
		p1.from = a2
		p1.to = a1
		p1.save(saveParrams)

		Account a3 = new Account(balance:-500, owner:user2, type:AccountType.Private)
		a3.save(saveParrams)
		Account a4 = new Account(balance:-10000, owner:user2, type:AccountType.Corporate)
		a4.save(saveParrams)
		Account a5 = new Account(balance:900, owner:user2, type:AccountType.Private)
		a5.save(saveParrams)
	}
}
