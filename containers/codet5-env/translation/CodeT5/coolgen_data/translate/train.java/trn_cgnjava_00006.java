public class CYY1S011_TRAIN003 extends CTCoolGenCore {

	protected imp_error_iyy1_component m_LocalEntity001;
	
	@Override
	public void initialize(Object... inputs) {
	}

	@Override
	public void execute(Object...outputs) {
		
		cyyy9041_excptn_msg_fmt_as_str m_AuthorizationCheck = new icyyy9041_excptn_msg_fmt_as_str();
		m_AuthorizationCheck.initialize(m_LocalEntity001);
		iyy1_component m_Out1 = new iyy1_component();
		iyy1_component m_Out2 = new iyy1_component();
		m_AuthorizationCheck.execute(m_Out1, m_Out2);
		
	}

}