public class CYY1S081_TRAIN006 extends CTCoolGenCore {

	protected loc_error_msg_iyy1_component m_LocalEntity001;

	@Override
	public void initialize(Object... inputs) {
	}

	@Override
	public void execute(Object... outputs) {
		exp_error_msg_iyy1_component m_Output01 = (exp_error_msg_iyy1_component) outputs[1];
		
		moveMember(m_LocalEntity001, m_Output01);
	}

}