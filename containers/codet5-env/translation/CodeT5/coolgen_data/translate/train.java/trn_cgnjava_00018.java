public class CYY1S011_TRAIN003 extends CTCoolGenCore {

	
	@Override
	public void initialize(Object... inputs) {
	}

	@Override
	public void execute(Object...outputs) {
		
		cyyy9001_exception_hndlng_dflt m_AuthorizationCheck = new cyyy9001_exception_hndlng_dflt();
		m_AuthorizationCheck.initialize();
		iyy1_component m_Out1 = new iyy1_component();
		m_AuthorizationCheck.execute(m_Out1);
		
	}

}