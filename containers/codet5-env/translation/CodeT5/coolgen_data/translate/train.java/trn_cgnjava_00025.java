public class CYY1S011_TRAIN003 extends CTCoolGenCore {

	
	@Override
	public void initialize(Object... inputs) {
	}

	@Override
	public void execute(Object...outputs) {
		
		cyy1a131_server_init m_AuthorizationCheck = new cyy1a131_server_init();
		m_AuthorizationCheck.initialize();
		iyy1_server_data m_Out1 = new iyy1_server_data();
		m_AuthorizationCheck.execute(m_Out1);
		
	}

}