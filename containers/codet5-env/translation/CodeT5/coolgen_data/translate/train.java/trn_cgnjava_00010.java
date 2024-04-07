public class CYY1S011_TRAIN004 extends CTCoolGenCore {
	
	protected imp_error_iyy1_component m_LocalEntity001;
	protected dont_change_return_codes m_LocalEntity002;
	protected iyy1_component m_LocalEntity003;
	
	@Override
	public void initialize(Object... inputs) {
	}

	@Override
	public void execute(Object...outputs) {
		
		if (m_LocalEntity001.return_code < m_LocalEntity002.one_ok) {
			
			m_LocalEntity001.severity_code = "E"
			m_LocalEntity003.severity_code = m_LocalEntity001.severity_code
      
		}
	}

}