public class CYY1S081_TRAIN007 extends CTCoolGenCore {
	protected group_list m_LocalEntity001;
	protected iyy1_list m_LocalEntity002;

	@Override
	public void initialize(Object... inputs) {
	}

	@Override
	public void execute(Object... outputs) {

		if (m_LocalEntity002.scroll_amount > m_LocalEntity001.getMaximum() || m_LocalEntity002.scroll_amount < 1) {
			m_LocalEntity002.scroll_amount = m_LocalEntity001.getMaximum();
		}
		
		if (m_LocalEntity002.sort_option.equalsIgnoreCase(CTCoolGenGlobal.SPACES)) {
			m_LocalEntity002.sort_option = "ASC";
		}
			
		if (m_LocalEntity002.list_direction.equalsIgnoreCase("P")) {
			
			if (m_LocalEntity002.sort_option.equalsIgnoreCase("ASC")) {
				m_LocalEntity002.sort_option = "DES";
			}
			else {
				m_LocalEntity002.sort_option = "ASC";
			}
		}

	}
}
