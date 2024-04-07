public class CYY1S011_TRAIN004 extends CTCoolGenCore {
	
	protected iyy1_component m_LocalEntity001;
	protected imp_error_iyy1_component m_LocalEntity002;
	
	@Override
	public void initialize(Object... inputs) {
	}

	@Override
	public void execute(Object...outputs) {
		
		if (m_LocalEntity001.severity_code <= SPACES) {
			
			m_LocalEntity001.severity_code = m_LocalEntity002.severity_code
		}
	}

}