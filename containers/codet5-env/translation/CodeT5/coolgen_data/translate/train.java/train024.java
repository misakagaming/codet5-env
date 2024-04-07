public class CYY1S011_TRAIN004 extends CTCoolGenCore {
	
	protected iyy1_component m_LocalEntity001;
	protected dont_change_return_codes m_LocalEntity002;
	
	@Override
	public void initialize(Object... inputs) {
	}

	@Override
	public void execute(Object...outputs) {
		
		if (m_LocalEntity001.return_code < m_LocalEntity002.n1110_unauthorized_operation) {
			
			iyy1_component m_Output01 = (iyy1_component) outputs[1];
		
			moveMember(m_LocalEntity001, m_Output01);
		}
	}

}