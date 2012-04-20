package tieto.bank.admin

class PaymentController {

    def index() { 
		List payments = Payment.list()
		// render(template:'index',['payments':payments])   pro render do jine stranky
		
		return [payments:payments]
		
		}
	
	def remove(){		
		//Payment p = Payment.get(params.id)
		p?.delete()
		
		List payments = Payment.list()
		redirect(view:'index')
		
		}		
}
