package tieto.bank.State

import tieto.bank.AccountDetailForm;

abstract class AbstractState implements State{

	@Override
	public void initTxtAccountBalance(AccountDetailForm form) {
		form.txtAccountBallance.setEnabled(false)
		
	}

	@Override
	public void intBtnRemove(AccountDetailForm form) {
		form.btnRemove.setEnabled(false)
		
	}

	@Override
	public void initBtnSave(AccountDetailForm form) {
		form.btnSave.setEnabled(false)
		
	}
	
	}