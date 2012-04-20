package tieto.bank.admin

class UserController {

    def login() {
		String name = params.login
		User user = User.findByName(name)
		session.user = user
		redirect(controller:'payment',view:'index')
		/*if(user){
			session.user = user
		}
		else{
			
			}*/
		}
	
	def logout(){
		session user = user
		redirect(controller:'payment',view:'index')
		}
}
