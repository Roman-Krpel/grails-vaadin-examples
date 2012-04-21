package tieto.bank

import tieto.bank.admin.*
import com.vaadin.data.Property.*
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener
import com.vaadin.data.*

class ShowAccountDetailListener implements ValueChangeListener{
	
	OwnerApp app
	

	@Override
	public void valueChange(ValueChangeEvent event){
		Property p = event.getProperty()
		Account account = p?.getValue()
		
		
		if(account){
			
			app.accDetail.setVisible(true)
			app.accDetail.setAccount(account)
			
			/*AccountDetailForm detForm = app.getAccDetail()
			
			detForm.txtAccountBallance.setValue(account.getBalance())*/
		}
		/*else{
			AccountDetailForm detForm = app.getAccDetail()
			
			detForm.txtAccountBallance.setValue(null)
		}*/
		//app.getMainWindow().showNotification("necum !!!")
	}
	
}