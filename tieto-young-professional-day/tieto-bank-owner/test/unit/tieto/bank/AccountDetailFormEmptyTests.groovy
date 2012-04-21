package tieto.bank

import static org.junit.Assert.*

import grails.test.mixin.*
import grails.test.mixin.support.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
class AccountDetailFormEmptyTests {
	
	AccountDetailForm form

    void setUp() {
        form = new AccountDetailForm()
    }


    void testEmptyState_TxtAccountBallance_IsEnabled() {
		boolean enabled = form.txtAccountBallance.isEnabled()
		assertEquals(false, enabled)		
        
    }
	
	void testEmptyState_TxtAccountBallance_GetValue() {		
		Object value = form.txtAccountBallance.getValue()
		assertEquals(0, value)
	}
}
