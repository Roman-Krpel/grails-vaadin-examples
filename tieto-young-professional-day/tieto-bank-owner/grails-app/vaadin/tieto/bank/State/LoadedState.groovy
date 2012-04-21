package tieto.bank.State

import tieto.bank.AccountDetailForm;

class LoadedState extends AbstractState {

	@Override
	public void initTxtAccountBalance(AccountDetailForm form) {
		// TODO Auto-generated method stub
		super.initTxtAccountBalance(form);
		form.txtAccountBallance.setEnabled(true)
		form.txtAccountBallance.setValue(form.account.getBalance())
	}
	
}
