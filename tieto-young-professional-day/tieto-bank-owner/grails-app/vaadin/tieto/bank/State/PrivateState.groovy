package tieto.bank.State

import tieto.bank.AccountDetailForm;

class PrivateState extends LoadedState {


	@Override
	public void initBtnSave(AccountDetailForm form) {
		// TODO Auto-generated method stub
		super.initBtnSave(form);
		form.btnSave.setEnabled(true)
	}
	
	

}
