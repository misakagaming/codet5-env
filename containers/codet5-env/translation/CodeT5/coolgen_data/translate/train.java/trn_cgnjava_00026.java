public class CYY1S081_TRAIN006 extends CTCoolGenCore {

	protected iyy1_server_data m_LocalEntity001;

	@Override
	public void initialize(Object... inputs) {
	}

	@Override
	public void execute(Object... outputs) {
		iyy1_server_data m_Output01 = (iyy1_server_data) outputs[1];
		
		moveMember(m_LocalEntity001, m_Output01);
	}

}