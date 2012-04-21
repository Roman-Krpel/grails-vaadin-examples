package tieto.bank.State

import tieto.bank.AccountDetailForm

class StateHolder {
	
	private AccountDetailForm form
	private State state
	
	public StateHolder(AccountDetailForm form, State state) {
		super();
		this.form = form;
		this.state = state;
		applyState()
	}

	public void setState(State state){
		this.state = state
		applyState()
		}
	
	private void applyState(){
		state.initTxtAccountBalance(form)
		state.initBtnSave(form)
		state.intBtnRemove(form)
		}

}
