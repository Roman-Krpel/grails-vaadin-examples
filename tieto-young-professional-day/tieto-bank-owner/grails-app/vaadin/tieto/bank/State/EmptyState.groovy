package tieto.bank.State

import tieto.bank.AccountDetailForm;

class EmptyState extends AbstractState {
	
	@Override
	public void initTxtAccountBalance(AccountDetailForm form) {
		// TODO Auto-generated method stub
		super.initTxtAccountBalance(form);
		form.txtAccountBallance.setValue(0)
	}
	
}
