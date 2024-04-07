public class CYY1S011_TRAIN002 extends CTCoolGenCore {

	protected exp_reference_iyy1_server_data m_LocalEntity001;
	
	@Override
	public void initialize(Object... inputs) {
	}
	
	@Override
	public void execute(Object...outputs) {
		m_LocalEntity001.server_time = timetimestamp(m_LocalEntity001.server_timestamp);
	}
}