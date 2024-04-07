public class CYY1S081_TRAIN006 extends CTCoolGenCore {

	protected iyy1_component m_LocalEntity001;

	@Override
	public void initialize(Object... inputs) {
	}

	@Override
	public void execute(Object... outputs) {
		iyy1_component m_Output01 = (iyy1_component) outputs[0];
		
		moveMember(m_LocalEntity001, m_Output01);
	}

}
