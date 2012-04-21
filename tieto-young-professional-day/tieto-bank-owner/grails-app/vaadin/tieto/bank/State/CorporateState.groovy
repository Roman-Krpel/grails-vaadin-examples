package tieto.bank.State

import tieto.bank.AccountDetailForm;

class CorporateState extends LoadedState {
	
	@Override
	public void intBtnRemove(AccountDetailForm form) {
		// TODO Auto-generated method stub
		super.intBtnRemove(form);
		form.btnRemove.setEnabled(true)
	}

	@Override
	public void initBtnSave(AccountDetailForm form) {
		// TODO Auto-generated method stub
		super.initBtnSave(form);
		form.btnSave.setEnabled(true)
	}

}
