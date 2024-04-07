public class CYY1S011_TRAIN003 extends CTCoolGenCore {

	protected isc1_authorization_info m_LocalEntity001;
	protected group_trans m_LocalEntity002;
	
	@Override
	public void initialize(Object... inputs) {
	}

	@Override
	public void execute(Object...outputs) {
		
		isc1z021_o_authorization_check_s m_AuthorizationCheck = new isc1z021_o_authorization_check_s();
		m_AuthorizationCheck.initialize(m_LocalEntity001, m_LocalEntity002);
		isc1_authorization_info m_Out1 = new isc1_authorization_info();
		isc1_component m_Out2 = new isc1_component();
		m_AuthorizationCheck.execute(m_Out1, m_Out2);
		
	}

}