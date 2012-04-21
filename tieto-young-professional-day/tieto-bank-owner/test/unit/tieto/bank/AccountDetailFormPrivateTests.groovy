package tieto.bank

import static org.junit.Assert.*

import grails.test.mixin.*
import grails.test.mixin.support.*
import org.junit.*

import tieto.bank.admin.Account
import tieto.bank.admin.AccountType
import tieto.bank.admin.User

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
@Mock([User, Account])
class AccountDetailFormPrivateTests {
	
	AccountDetailForm form

    void setUp() {
        form = new AccountDetailForm()
		Account account = new Account()
		account.balance = 1000
		account.type = AccountType.Private
		User user = new User()
		user.name = "Name"
		user.save(failOnError:true)
		account.owner = user
		account.save(failOnError:true)
		form.setAccount(account)		
    }

    void testEmptyState_TxtAccountBallance_IsEnabled() {
		boolean enabled = form.txtAccountBallance.isEnabled()
		assertEquals(true, enabled)		
        
    }
	
	void testEmptyState_TxtAccountBallance_GetValue() {		
		Object value = form.txtAccountBallance.getValue()
		assertEquals(1000, value)
	}
}
