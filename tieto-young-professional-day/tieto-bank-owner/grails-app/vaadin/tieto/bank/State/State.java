package tieto.bank.State;

import tieto.bank.AccountDetailForm;

public interface State {
	
	void initTxtAccountBalance(AccountDetailForm form);
	void intBtnRemove(AccountDetailForm form);
	void initBtnSave(AccountDetailForm form);

}
