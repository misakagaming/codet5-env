public class CYY1S081_TRAIN016 extends CTCoolGenCore {
	protected group_list m_LocalEntity001;
	protected iyy1_list m_LocalEntity002;
	protected iyy1_component m_LocalEntity003;

	@Override
	public void initialize(Object... inputs) {
	}

	@Override
	public void execute(Object... outputs) {

		iyy1_component m_Output01 = (iyy1_component) outputs[0];
		
		moveMember(m_LocalEntity003, m_Output01);
			
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
