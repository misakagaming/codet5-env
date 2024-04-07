public class CYY1S011_D004_TRAIN013 extends CTCoolGenCore {
	
	protected group_context m_LocalEntity001;
	protected isc1_authorization_info m_LocalEntity002;
	protected g_context_dont_change_text m_LocalEntity003;
	
	@Override
	public void initialize(Object... inputs) {
	}

	@Override
	public void execute(Object...outputs) {
		
		if (!m_LocalEntity002.authority_ind == 4) {
			
			m_LocalEntity001.setSubscript(3);
		}
	}

}
