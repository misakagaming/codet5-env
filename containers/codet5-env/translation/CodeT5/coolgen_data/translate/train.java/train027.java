public class CYY1S011_TRAIN027 extends CTCoolGenCore {
	
	
	@Override
	public void initialize(Object... inputs) {
	}

	@Override
	public void execute(Object...outputs) {
		dont_change_return_codes drCodes = new dont_change_return_codes();
		error_iyy1_component m_Output02 = (error_iyy1_component) outputs[1];

		if (m_Output02.return_code < drCodes.n1_ok) {
			CTCoolGenGlobal.setExitStateRB(std_return_rb);	
		}
		else {
			CTCoolGenGlobal.setExitState(std_return);			
		}
	}

}
