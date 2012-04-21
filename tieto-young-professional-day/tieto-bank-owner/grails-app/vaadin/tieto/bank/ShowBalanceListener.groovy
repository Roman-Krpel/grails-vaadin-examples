package tieto.bank

import tieto.bank.admin.Account;
import tieto.bank.admin.User

import com.vaadin.data.Property
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener
import com.vaadin.ui.*

class ShowBalanceListener implements ValueChangeListener {

	OwnerApp app

	@Override
	public void valueChange(ValueChangeEvent event) {
		Property p = event.getProperty()
		User u = p?.getValue()
		
		if(u) {
			List usAccounts = Account.findAllByOwner(u)
			if(usAccounts){
				Table tableAc = app.getTableAc()
				tableAc.removeAllItems()
				tableAc.addContainerProperty("Id",Long.class,null)
				tableAc.addContainerProperty("Amount",Integer.class,null)
				tableAc.addContainerProperty("Type",String.class,null)
				
				for(Account a : usAccounts){
					Object [] values = new Object[3]
					values[0] = a.id
					values[1] = a.balance
					values[2] = a.type
					tableAc.addItem(values,a)
					}
				//app.getMainWindow().addComponent(tableAc)
			
			}
			
			
			
			//app.lblUserBalance.setCaption(u.name + "'s: " + balance)
		}
	}
}
