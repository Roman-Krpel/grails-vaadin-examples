package bank


import tieto.bank.admin.Account
import tieto.bank.admin.Payment

import com.vaadin.Application;
import com.vaadin.ui.*

class PaymentApp extends Application {
    /**
     * Entry point for application
     */
    void init() {
       /* this.mainWindow = new Window("Grails")
        this.mainWindow.content.setMargin(false)*/
		Window w = new Window("Payment application")
		
		Label lblTitle = new Label("Payment History")		
		w.addComponent(lblTitle)
		
		Table table = new Table()
		table.addContainerProperty("Id", Long.class, null)
		table.addContainerProperty("Datum", Date.class, null)
		table.addContainerProperty("Transfered money", Integer.class, null)
		table.addContainerProperty("From", Account.class, null)
		table.addContainerProperty("To", Account.class, null)
		
		List payments = Payment.list()
		for(Payment p : payments){
			Object [] values = new Object[5]
			values[0] = p.id
			values[1] = p.date
			values[2] = p.amount
			values[3] = p.from
			values[4] = p.to
		}
		
		
		w.addComponent(table)
		
		setMainWindow(w)
    }
}
